package fakedb;

import java.util.ArrayList;

public abstract class BaseFakeDB<TDominio> {

    public BaseFakeDB(){
        this.preencherDados();

    }

    protected  ArrayList<TDominio> tabela;

    //Propriedade Somente Leitura(Read-only)
    public ArrayList<TDominio> getTabela(){
        return  tabela;
    }

    protected  abstract   void preencherDados();
}
