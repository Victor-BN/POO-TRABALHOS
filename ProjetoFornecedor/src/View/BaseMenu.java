package View;

import java.util.Locale;
import java.util.Scanner;

public abstract class BaseMenu<TDominio> {

    protected Scanner sc;

    public BaseMenu(){
        this.sc = new Scanner(System.in);
        this.sc.useLocale(Locale.US);
    }

    public abstract void ExibirMenu();
    public abstract void Adicionar();
    public abstract void Atualizar();
    public abstract void Exibir();
    public abstract void Pesquisar();
    public abstract void Remover();
}
