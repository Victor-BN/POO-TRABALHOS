package dominio;


import java.util.Locale;

public class ClasseProduto extends BaseParametro{

     public ClasseProduto(){
        super();
     }

     public ClasseProduto(int codigo,String descricao,Locale dataDeInclusao){
       super(codigo, descricao, dataDeInclusao);
     }
    
}