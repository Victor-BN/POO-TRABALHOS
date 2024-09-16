package fakedb;

import dominio.ClasseProduto;

import java.time.LocalDate;
import java.util.ArrayList;

public class ClasseProdutoFakeDb  extends  BaseFakeDB<ClasseProduto>{
    @Override
    protected void preencherDados() {
       this.tabela = new ArrayList<>();
       this.tabela.add(new ClasseProduto(1,"limpeza",LocalDate.now()));

      this.tabela.add(new ClasseProduto(12,"PROTEINAS",LocalDate.now()));

       this.tabela.add(new ClasseProduto(32,"MASSAS",LocalDate.now()));

       this.tabela.add(new ClasseProduto(98,"limpeza",LocalDate.now()));

       this.tabela.add(new ClasseProduto(12,"cosmeticos",LocalDate.now()));

    }

    public ClasseProdutoFakeDb(){
        super();
    }
}
