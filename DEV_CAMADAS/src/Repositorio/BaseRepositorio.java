package Repositorio;

import fakedb.BaseFakeDB;

import java.util.ArrayList;

public abstract class BaseRepositorio<TDominio> {

    protected ArrayList<TDominio> dado;

    public ArrayList<TDominio> Browse(){
        return this.dado;
    }

    public abstract TDominio Read(int chave);

    public abstract TDominio Edit(TDominio instancia);

   public abstract TDominio Add(TDominio instancia);

   public abstract TDominio Delete(int chave);

}
