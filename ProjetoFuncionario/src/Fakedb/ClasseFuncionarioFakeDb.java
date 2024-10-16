package Fakedb;

import Dominio.Funcionario;

import java.util.ArrayList;

public class ClasseFuncionarioFakeDb extends BaseFakeDB<Funcionario> {



    @Override
    protected void preencherDaddos() {
      this.lista = new ArrayList<>();

      this.lista.add(new Funcionario(1,"Victor hugo","DEV",3400.5,"victor@","7667666"));
    }

    public ClasseFuncionarioFakeDb(){
        super();
    }
}
