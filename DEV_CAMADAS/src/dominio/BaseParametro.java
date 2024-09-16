package dominio;

import java.util.Locale;
import java.time.*;

public abstract class BaseParametro {
    
  protected int codigo;
  protected String descricao;
  protected LocalDate dataDeInclusao;

  public BaseParametro(){

  }

   public BaseParametro(int codigo, String descricao, LocalDate dataDeInclusao) {
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

  public void setDataDeInclusao(LocalDate l){
    this.dataDeInclusao = l;
  }

  public LocalDate getDataDeInclusao(){
    return this.dataDeInclusao;
  }

}
