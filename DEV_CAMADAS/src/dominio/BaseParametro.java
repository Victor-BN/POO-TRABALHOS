package dominio;

import java.util.Locale;

public abstract class BaseParametro {
    
  protected int codigo;
  protected String descricao;
  protected Locale dataDeInclusao;

  public BaseParametro(){

  }

   public BaseParametro(int codigo, String descricao, Locale dataDeInclusao) {
    this.codigo = codigo;
    this.descricao = descricao;
    this.dataDeInclusao = dataDeInclusao;
}


public void setCodigo(int c){
    this.codigo = c;
  }
  
  public int getCodigo(){
    return this.codigo;
  }

  public void setDescricao(String d){
    this.descricao = d;
  }

  public String getDescricao(){
    return this.descricao;
  }

  public void setDataDeInclusao(Locale l){
    this.dataDeInclusao = l;
  }

  public Locale getDataDeInclusao(){
    return this.dataDeInclusao;
  }

}
