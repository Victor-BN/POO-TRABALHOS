package view;

import dominio.ClasseProduto;
import fakedb.ClasseProdutoFakeDb;

import java.time.LocalDate;
import java.util.ArrayList;

public class ClasseProdutoVisao {
    
    public ClasseProdutoVisao(){

    }

    public void Exibir(){
        ClasseProdutoFakeDb db = new ClasseProdutoFakeDb();
        ArrayList<ClasseProduto> lista = db.getTabela();
        for (ClasseProduto cp : lista) {
            System.out.println("-----------------------------");
            System.out.println("Classe de produto");
            System.out.println("Código " +cp.getCodigo());
            System.out.println("Descricao:"+cp.getDescricao());
            System.out.println("Data de Inclusao:"+cp.getDataDeInclusao());

        }
    }
}
