package dominio;

import java.util.Locale;

public class Produto extends SubclasseProduto {
    private int codigoSubclasse;
    private double valor;
    
    
    public Produto() {
        super();
    }


    public Produto(int codigo, String descricao, Locale dataDeInclusao, int codigoClasse, int codigoSubclasse, double valor) {
        super(codigo, descricao, dataDeInclusao, codigoClasse);
        this.codigoSubclasse = codigoSubclasse;
        this.valor = valor;
    }


    public int getCodigoSubclasse() {
        return codigoSubclasse;
    }


    public void setCodigoSubclasse(int codigoSubclasse) {
        this.codigoSubclasse = codigoSubclasse;
    }


    public double getValor() {
        return valor;
    }


    public void setValor(double valor) {
        this.valor = valor;
    }

    

    

       
}
