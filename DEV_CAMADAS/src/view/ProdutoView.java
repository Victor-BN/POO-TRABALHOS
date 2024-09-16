package view;

import dominio.Produto;

import java.time.LocalDate;

public class ProdutoView {

    public ProdutoView(){

    }

    public void Exibir(){
        Produto p1 = new Produto(123,"CHOCOLATE", LocalDate.now(),2,10,34.6);
        System.out.println("Classe de produto");
        System.out.println("Código:"+p1.getCodigo());
        System.out.println("Descricao:"+p1.getDescricao());
        System.out.println("Data de Inclusao:"+p1.getDataDeInclusao());
    }
}
