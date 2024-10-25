package FakeDB;

import java.util.ArrayList;

public abstract class BaseFakedb<TDominio> {

    public BaseFakedb(){
        this.preencherdados();
    }

    protected abstract void preencherdados();

    protected ArrayList<TDominio> tabela;

    public ArrayList<TDominio> getTabela(){
      return tabela;
    }
}
