package Service;

import Dominio.Fornecedor;
import Repositorio.FornecedorRepositorio;

import java.util.ArrayList;

public class FornecedorService extends BaseService<Fornecedor>{

    private FornecedorRepositorio fornecedorRp;

    public FornecedorService(){
        this.fornecedorRp = new FornecedorRepositorio();
    }

    @Override
    public ArrayList<Fornecedor> Navegar() {
        return this.fornecedorRp.Browse();
    }
    @Override
    public Fornecedor Ler(int codigo) {
        return this.fornecedorRp.Read(codigo);
    }

    @Override
    public Fornecedor Adicionar(Fornecedor obj) {
        return this.fornecedorRp.Add(obj);
    }

    @Override
    public Fornecedor Editar(Fornecedor obj) {
        return this.fornecedorRp.Edit(obj);
    }

    @Override
    public Fornecedor Remover(int codigo) {
        return this.fornecedorRp.Delete(codigo);
    }
}
