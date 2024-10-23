package Service;

import java.util.ArrayList;

public abstract class BaseService<TDominio> {

    public abstract ArrayList<TDominio> Navegar();
    public abstract TDominio Adicionar(TDominio obj);
    public abstract TDominio Editar(TDominio obj);
    public abstract TDominio Ler(int codigo);
    public abstract TDominio Remover(int codigo);


}
