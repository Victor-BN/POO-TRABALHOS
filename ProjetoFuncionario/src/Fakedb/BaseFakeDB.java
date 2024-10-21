package Fakedb;

import java.util.ArrayList;

public abstract class BaseFakeDB<TDominio> {

    public BaseFakeDB(){
     this.preencherDaddos();
    }


    protected abstract void preencherDaddos();

    protected ArrayList<TDominio> lista;


    public ArrayList<TDominio> getLista() {
        return lista;
    }


}
