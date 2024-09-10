package view;

import dominio.ClasseProduto;

public class ClasseProdutoVisao {
    
    public ClasseProdutoVisao(){

    }

    public void Exibir(){
        ClasseProduto cp1 = new ClasseProduto();
        cp1.setCodigo(1);
        cp1.setDescricao("Bebidas");
        cp1.setDataDeInclusa(LocalDate.now());
    }
}
