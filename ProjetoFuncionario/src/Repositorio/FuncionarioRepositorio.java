package Repositorio;

import Dominio.Funcionario;
import Fakedb.ClasseFuncionarioFakeDb;

public class FuncionarioRepositorio extends BaseRepositorio<Funcionario> {


    private ClasseFuncionarioFakeDb tab;

    public FuncionarioRepositorio(){
        this.tab = new ClasseFuncionarioFakeDb();
        this.tabeladados = this.tab.getLista();
    }



    @Override
    public Funcionario Read(int codigo) {
        for(Funcionario fun : tabeladados){
            if(fun.getCodigo() == codigo){
                //this.tabeladados.get(codigo);
                return fun;
            }
        }
        System.out.println("Funcionario nao encontrado");
        return null;
    }

    @Override
    public Funcionario Edit(Funcionario obj) {
        Funcionario altera = this.Read(obj.getCodigo());

        if(altera != null){
            altera.setCargo(obj.getCargo());
            altera.setEmail(obj.getEmail());
            altera.setTelefone(obj.getTelefone());
            altera.setSalario(obj.getSalario());
            return altera;
        }else if(altera.equals(obj)){
          System.out.println("Nao foi possivel alterar os dados do funcionario:"+altera.getNome());
          System.out.println("Pois estes dados , sao os mesmos do atual funcionario");
          return null;

        }

        System.out.println("Nao foi possivel fazer a alteracao , pois nao foi encontrado o funcionario");
        return null;
    }

    @Override
    public Funcionario Add(Funcionario obj) {
        if(tabeladados.isEmpty()){
            obj.setCodigo(1);
        }else{
            int ultimocod = this.tabeladados.get(this.tabeladados.size() - 1).getCodigo();
            obj.setCodigo(ultimocod+1);
        }
        this.tabeladados.add(obj);
        return obj;
    }

    @Override
    public Funcionario Delete(int codigo) {
       Funcionario fun = this.Read(codigo);

       if(fun != null){
           System.out.println("Deletando o Funcionario:");
           this.tabeladados.remove(fun);
           System.out.println("Funcionario:"+fun.getNome()+",Deletado com sucesso");
           return fun;
       }

       System.out.println("Nao foi possivel deletar");
       System.out.println("Funcionario nao existe!!!");

       return null;
    }
}
