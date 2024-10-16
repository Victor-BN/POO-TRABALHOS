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
        return null;
    }

    @Override
    public Funcionario Add(Funcionario obj) {
        return null;
    }

    @Override
    public Funcionario Delete(int codigo) {
        return null;
    }
}
