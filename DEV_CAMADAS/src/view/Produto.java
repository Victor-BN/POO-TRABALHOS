package view;

import java.util.Arrays;
import java.util.List;

public class Produto {
    private String nome;
    private double preco;
    private String categoria;

    public Produto(String nome, double preco, String categoria) {
        this.nome = nome;
        this.preco = preco;
        this.categoria = categoria;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public String getCategoria() {
        return categoria;
    }

    public static void main(String [] args){

        List<Produto> produtos = Arrays.asList(
                new Produto("Produto 1", 50.0, "Categoria 1"),
                new Produto("Produto 2", 120.0, "Categoria 2"),
                new Produto("Produto 3", 80.0, "Categoria 1"),
                new Produto("Produto 4", 150.0, "Categoria 3"),
                new Produto("Produto 5", 30.0, "Categoria 2")
        );
    }
}
