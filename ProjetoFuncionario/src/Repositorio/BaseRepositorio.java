package Repositorio;

import java.util.ArrayList;

public abstract class BaseRepositorio<TDominio> {

   public BaseRepositorio(){

   }

   protected ArrayList<TDominio> tabeladados ;

   public ArrayList<TDominio> Browse(){
       return this.tabeladados;
   }

  public abstract TDominio Read(int codigo);

   public abstract TDominio Edit(TDominio obj);

   public abstract TDominio Add(TDominio obj);

   public abstract TDominio Delete(int codigo);



}
