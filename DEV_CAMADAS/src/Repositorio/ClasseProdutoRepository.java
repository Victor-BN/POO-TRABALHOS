package Repositorio;

import dominio.ClasseProduto;
import fakedb.ClasseProdutoFakeDb;

import java.util.ArrayList;

public class ClasseProdutoRepository extends  BaseRepositorio<ClasseProduto>{

    private ClasseProdutoFakeDb tab;

    public ClasseProdutoRepository(){
        this.tab = new ClasseProdutoFakeDb();
        this.dado = this.tab.getTabela();
    }


    @Override
    public ClasseProduto Read(int chave) {
      for(ClasseProduto cp : this.dado){
          if(cp.getCodigo() == chave){
              return cp;
          }
      }
      return null;
    }

    @Override
    public ClasseProduto Edit(ClasseProduto instancia) {
        ClasseProduto cp = this.Read(instancia.getCodigo());
        if( cp != null){
            cp.setDescricao(instancia.getDescricao());
            return cp;
        }else{
            return null;
        }
    }

    @Override
    public ClasseProduto Add(ClasseProduto instancia) {
        //int pos = this.dado.size()-1;
        //ClasseProduto cp = this.dado.get(pos);
        int prox = cp.getCodigo() + 1;

        instancia.setCodigo(prox);
        this.dado.add(instancia);
        return instancia;
    }

    @Override
    public ClasseProduto Delete(int chave) {
        ClasseProduto cp = this.Read(chave);
        if(cp != null){
            this.dado.remove(cp);
            return cp;
        }else {
            return null;
        }
    }

    public ClasseProduto DeleteALL() {

      ClasseProduto cp = new ClasseProduto();

        if(!dado.isEmpty()){
            dado.removeAll(dado);
            System.out.println("Remoçao com sucesseso");
            return cp;
        }else{
            System.out.println("Erro na remocao");
            return null;
        }



    }
}
