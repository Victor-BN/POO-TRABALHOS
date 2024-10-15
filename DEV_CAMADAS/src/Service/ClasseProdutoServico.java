package Service;

import Repositorio.ClasseProdutoRepository;
import dominio.ClasseProduto;

import java.util.ArrayList;

public class ClasseProdutoServico extends BaseServico<ClasseProduto> {

    private ClasseProdutoRepository repositorio;

    public ClasseProdutoServico(){
        this.repositorio =new ClasseProdutoRepository();
    }
    @Override
    public ArrayList<ClasseProduto> Navegar() {
        return repositorio.Browse();
    }

    @Override
    public ClasseProduto Ler(int chave) {
        return repositorio.Read(chave);
    }

    @Override
    public ClasseProduto Editar(ClasseProduto obj) {
        return repositorio.Edit(obj);
    }

    @Override
    public ClasseProduto Adicionar(ClasseProduto obj) {
        return repositorio.Add(obj);
    }

    @Override
    public ClasseProduto Remover(int chave) {
        return repositorio.Delete(chave);
    }

    @Override
    public ClasseProduto RemoverTodo() {
        return this.repositorio.DeleteALL();
    }
}
