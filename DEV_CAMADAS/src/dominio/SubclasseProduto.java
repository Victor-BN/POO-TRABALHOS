package dominio;

import java.time.LocalDate;
import java.util.Locale;

public class SubclasseProduto extends BaseParametro{
    private int codigoClasse;

    
    public SubclasseProduto(){

    }
    
    public SubclasseProduto(int codigo, String descricao, LocalDate dataDeInclusao, int codigoClasse) {
        super(codigo, descricao, dataDeInclusao);
        this.codigoClasse = codigoClasse;
    }



    public int getCodigoClasse() {
        return codigoClasse;
    }

    public void setCodigoClasse(int codigoClasse) {
        this.codigoClasse = codigoClasse;
    }

    

}
