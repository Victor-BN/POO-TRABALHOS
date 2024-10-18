package view;

import Dominio.Funcionario;
import Servico.FuncionarioServico;

import java.util.Locale;

public class FuncionarioMenu extends BaseMenu<Funcionario>{

    FuncionarioServico funcioservico = new FuncionarioServico();





    public FuncionarioMenu(){
        super();
    }


    @Override
    public void ExibirMenu() {
        int opt;

        do{
            System.out.println("Menu funcionario ");
            System.out.println("------------------");
            System.out.println("1-PARA ADICIONAR UM FUNCIONARIO");
            System.out.println("2-ATUALIZAR AS INFORMAÇOES DE UM FUNCIONARIO");
            System.out.println("3-PESQUISAR UM FUNCIONARIO");
            System.out.println("4-LISTAR TODOS OS FUNCIONARIOS");
            System.out.println("5-REMOVER UM FUNCIONARIO");
            System.out.println("---------------------");
            System.out.println("DIGITE A OPCAO DESEJADA:");

            opt = sc.nextInt();
            switch (opt){
                case 1:
               this.Adicionar();
                        break;
                case 2:
                    this.Atualizar();
                    break;
                case 3:
                    this.Localizar();
                    break;
                case 4:
                     this.Listar();
                     break;
                case 5:
                    this.Remover();
                    break;
                default:
                    System.out.println("opcao invalida");
                    break;
            }



        }while(opt != 0);


    }

    @Override
    public void Listar() {

    }

    @Override
    public void Localizar() {

    }

    @Override
    public void Adicionar() {

        Funcionario funcionario = new Funcionario();


        System.out.println("DIGITE O NOME DO FUNCIONARIO");
        String nome = sc.next();
        System.out.println("QUAL E O CARGO DO FUNCIONARIO:");
        String cargo = sc.next();
        System.out.println("DIGITE O SALARIO DO FUNCIONARO:");
        double salario = sc.nextDouble();
        System.out.println("INFORME O EMAIL DO FUNCIONARIO:");
        String email = sc.next();
        System.out.println("INFORME O TELEFONE DO FUNCIONARIO:");
        String telefone = sc.next();

        funcionario.setNome(nome);
        funcionario.setCargo(cargo);
        funcionario.setSalario(salario);
        funcionario.setEmail(email);
        funcionario.setTelefone(telefone);

        if(funcioservico.Adicionar(funcionario) != null){
            System.out.println("FUNCIONARIO:"+funcionario.getNome()+",FOI ADICIONADO COM SUCESSO");
        }else{
            System.out.println("ERRO AO ADICIONAR O FUNCIONARIO");
        }

        System.out.println("Clique <ENTER> para continuar...");
        this.sc.nextLine();
        this.sc.nextLine();


    }

    @Override
    public void Atualizar() {

    }

    @Override
    public void Remover() {

    }
}
