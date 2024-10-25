package FakeDB;

import Dominio.Fornecedor;

import java.util.ArrayList;

public class FornecedorFAKEDB extends BaseFakedb<Fornecedor> {

    public FornecedorFAKEDB(){
        super();
    }
    @Override
    protected void preencherdados() {
        this.tabela = new ArrayList<>();

        this.tabela.add(new Fornecedor(32,"ALIMENTICIO","BEBIDASICE","100555","ice@gmil.com","566444"));
    }
}
