package Repositorio;

import java.util.ArrayList;


public abstract class BaseRepositorio<TDominio> {

    public BaseRepositorio(){

    }

    protected ArrayList<TDominio> listatab;


    public ArrayList<TDominio> Browse(){
        return this.listatab;
    }

    public abstract TDominio Read(int codigo);
    public abstract TDominio Edit(TDominio obj);
    public abstract TDominio Add(TDominio obj);
    public abstract TDominio Delete(int codigo);

}
