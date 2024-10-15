package view;

import Service.ClasseProdutoServico;
import dominio.ClasseProduto;

import java.time.LocalDate;
import java.util.ArrayList;

public class ClasseProdutoMenu extends BaseMenu {


    private ClasseProdutoServico srv;
    private Util util;

    public ClasseProdutoMenu(){
        super();
        this.srv = new ClasseProdutoServico();
    }

    @Override
    public void ExibirMenu() {
        int opcao = 0;
        while(opcao != 9){
            //Util.LimparConsole();
            System.out.println("Cadastro de Classes de Produto");
            System.out.println("1 - Listar");
            System.out.println("2 - Localizar");
            System.out.println("3 - Adicionar");
            System.out.println("4 - Atualizar");
            System.out.println("5 - Remover");
            System.out.println("9 - Sair");
            System.out.print("Selecione uma opção: ");
            opcao = this.sc.nextInt();
            switch (opcao) {
                case 1:
                    this.Listar();
                    break;
                case 2:
                    this.Localizar();
                    break;
                case 3:
                    this.Adicionar();
                    break;
                case 4:
                    this.Atualizar();
                    break;
                case 5:
                    this.Remover();
                    break;
                case 6:
                    this.RemoverTodos();
                     break;
                     case 9:
                    System.out.println("Saindo");
                    break;
                default:
                    System.out.println("Opção Inválida");
                    break;
            }
        }
    }

    @Override
    public void Listar() {

        ArrayList<ClasseProduto> lista  = this.srv.Navegar();

        for(ClasseProduto cp : lista){
            this.ImprimirPorLinha(cp);
        }
    }

    @Override
    public void Localizar() {
        Util.LimparConsole();
        System.out.println("Localizar produto");
        System.out.println("Digite o codigo do produto a ser localizado");
        int cod =  sc.nextInt();


        ClasseProduto cp = this.srv.Ler(cod);

       if(cp != null){
          this.ImprimirPorLinha(cp);
       }else{
           System.out.println("Não foi possível encontrar o produto!!! ");
           System.out.println("Produto inesxistente");
       }
        System.out.println("Clique <ENTER> para continuar...");
        this.sc.nextLine();
        this.sc.nextLine();
    }

    @Override
    public void Adicionar() {
        Util.LimparConsole();
       ClasseProduto cp = new ClasseProduto();

       System.out.println("Informe a descricao que voce quer adicionar");
       String descricao = sc.next();

       cp.setDescricao(descricao);
       cp.setDataDeInclusao(LocalDate.now());

       if(this.srv.Adicionar(cp) != null){
           System.out.println("Produto add com sucesso");
       }else{
           System.out.println("Erro em adicionar o produto");
       }

        System.out.println("Clique <ENTER> para continuar...");
        this.sc.nextLine();
        this.sc.nextLine();

    }

    @Override
    public void Atualizar() {
          Util.LimparConsole();

          System.out.println("Digite o codigo do produto que voce deseja alterar a descricao");
          int cod = sc.nextInt();

          ClasseProduto cp = this.srv.Ler(cod);

          if(cp != null){
              System.out.println("Digite a descricao que deseje atualizar");
              String descricao = sc.next();
              cp.setDescricao(descricao);
              this.srv.Editar(cp);

              if(this.srv.Editar(cp) != null){
                  System.out.println("Alteraçao realizada com sucesso");
              }else {
                  System.out.println("Problema na alteracao");
              }
          }else{
              System.out.println("Produto nao encontrado");
          }
        System.out.println("Clique <ENTER> para continuar...");
        this.sc.nextLine();
        this.sc.nextLine();

    }

    @Override
    public void Remover() {
       Util.LimparConsole();

       System.out.println("Digite o codigo do produto a ser removido");
       int cod = this.sc.nextInt();

       ClasseProduto cp = this.srv.Ler(cod);

       if(cp != null){
           //this.srv.Remover(cp.getCodigo());
           if(this.srv.Remover(cp.getCodigo()) != null){
               System.out.println("Produto removido com sucesso");
           }else{
               System.out.println("Produto nao foi excluida ");
           }

       }else{
           System.out.println("Produto nao encontrado");
       }

        System.out.println("Clique <ENTER> para continuar...");
        this.sc.nextLine();
        this.sc.nextLine();
    }

    public void RemoverTodos(){
     Util.LimparConsole();

     ArrayList<ClasseProduto> lista = this.srv.Navegar();


     if(lista != null || !lista.isEmpty()){
         ClasseProduto cp = this.srv.RemoverTodo();
         if(cp != null){
             System.out.println("todos os elementos foram excluidos");
         }else{
             System.out.println("erro ao deletar os elementos");
         }

     }
        System.out.println("Clique <ENTER> para continuar...");
        this.sc.nextLine();
        this.sc.nextLine();
    }







    private void ImprimirPorLinha(ClasseProduto cp){
        String mensagem = "";
        mensagem += "Classe de Produto: ";
        mensagem += "Código: " + cp.getCodigo() + " | ";
        mensagem += "Descrição: " + cp.getDescricao() + " | ";
        mensagem += "Data de Inclusão: " + cp.getDataDeInclusao();
        System.out.println(mensagem);
    }
}
