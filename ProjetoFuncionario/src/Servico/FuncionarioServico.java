package Servico;

import Dominio.Funcionario;
import Repositorio.FuncionarioRepositorio;

import java.util.ArrayList;

public class FuncionarioServico extends BaseServico<Funcionario> {

    private FuncionarioRepositorio funrepo;

   public FuncionarioServico(){
       this.funrepo = new FuncionarioRepositorio();
   }

    @Override
    public ArrayList<Funcionario> Navegar() {
        return this.funrepo.Browse();
    }

    @Override
    public Funcionario Ler(int chave) {
        return this.funrepo.Read(chave);
    }

    @Override
    public Funcionario Editar(Funcionario obj) {
        return this.funrepo.Edit(obj);
    }

    @Override
    public Funcionario Adicionar(Funcionario obj) {
        return this.funrepo.Add(obj);
    }

    @Override
    public Funcionario Remover(int chave) {
        return this.funrepo.Delete(chave);
    }
}
