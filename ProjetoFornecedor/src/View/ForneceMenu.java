package View;

import java.lang.String;
import Dominio.Fornecedor;
import FakeDB.FornecedorFAKEDB;
import Service.FornecedorService;

import java.util.ArrayList;




public class ForneceMenu extends BaseMenu<Fornecedor> {

    private FornecedorService fornecedorService;
   
    


    public ForneceMenu() {
        super();
        this.fornecedorService = new FornecedorService();

    }


    @Override
    public void ExibirMenu() {
        Util.LimparConsole();
        int opt;

        do {
            System.out.println("MENU FORNECEDOR");
            System.out.println("------------------");
            System.out.println("1-PARA ADICIONAR UM FORNECEDOR");
            System.out.println("2-ATUALIZAR AS INFORMAÇOES DE UM FORNECEDOR");
            System.out.println("3-PESQUISAR UM FORNECEDOR");
            System.out.println("4-LISTAR TODOS OS FORNECEDORES");
            System.out.println("5-REMOVER UM FORNECEDOR");
            System.out.println("---------------------");
            System.out.println("DIGITE A OPCAO DESEJADA:");

            opt = sc.nextInt();
            switch (opt) {
                case 1:
                    this.Adicionar();
                    break;
                case 2:
                    this.Atualizar();
                    break;
                case 3:
                    this.Pesquisar();
                    break;
                case 4:
                    this.Exibir();
                    break;
                case 5:
                    this.Remover();
                    break;
                default:
                    System.out.println("opcao invalida");
                    break;
            }


        } while (opt != 0);

    }


    @Override
    public void Adicionar() {
        Fornecedor fornecedor = new Fornecedor();
        FornecedorFAKEDB fakedb = new FornecedorFAKEDB();
         
        Util.LimparConsole();
        System.out.println("DIGITE A RAZAO SOCIAL DO FORNECEDOR:");
        String razao = sc.next();
        fornecedor.setRazaoSocial(razao);


        System.out.println("DIGITE O NOME FANTASIA DO FORNECEDOR:");
         String nomefantasia = sc.next();
         fornecedor.setNomeFan(nomefantasia);

        System.out.println("DIGITE O CNPJ:");
         String cnpj = sc.next();
         fornecedor.setCNPJ(cnpj);


        System.out.println("DIGITE O EMAIL DO FORNECEDOR:");
        String email = sc.next();
        fornecedor.setEmail(email);


        System.out.println("DIGITE O TELEFONE DO FORNECEDOR");
        String telefone = sc.next();
        fornecedor.setTelefone(telefone);




        if (fornecedorService.Adicionar(fornecedor) != null) {
            System.out.println("FORNECEDOR:" + fornecedor.getNomeFan() + ",FOI ADICIONADO COM SUCESSO");
        } else {
            System.out.println("ERRO AO ADICIONAR O FORNECEDOR");
        }
        System.out.println("Clique <ENTER> para continuar...");
        this.sc.nextLine();
        this.sc.nextLine();
    }


   
    @Override
    public void Atualizar() {
        Util.LimparConsole();
        System.out.println("DIGITE O CODIGO DO FORNECEDOR QUE VOCE DEJA EDITAR");
        int codigo = sc.nextInt();

        Fornecedor alterar = this.fornecedorService.Ler(codigo);

        if (alterar != null) {
            System.out.println("DIGITE A NOVA RAZAO SOCIAL DO FORNECEDOR:");
            String razao = sc.next();
            System.out.println("DIGITE O NOVO NOME FANTASIA DO FORNECEDOR:");
            String nomefantasia = sc.next();
            //System.out.println("DIGITE O NOVO CNPJ:");
            //String cnpj = sc.next();
            System.out.println("DIGITE O NOVO EMAIL DO FORNECEDOR:");
            String email = sc.next();
            System.out.println("DIGITE O NOVO TELEFONE DO FORNECEDOR");
            String telefone = sc.next();


            alterar.setRazaoSocial(razao);
            alterar.setNomeFan(nomefantasia);
            //alterar.setCNPJ(cnpj);
            alterar.setEmail(email);
            alterar.setTelefone(telefone);

            this.fornecedorService.Editar(alterar);
            System.out.println("DADOS DO FORNECEDOR(A):" + alterar.getNomeFan() + " ATUALIZADO ");

        }else{
            System.out.println("NAO FOI POSSIVEL ALTERAR O FORNECEDOR!!");
            System.out.println("VERIFIQUE SE DIGITOU O CODIGO DO FORNECEDOR  CORRETO");
            System.out.println("VERIFIQUE SE O FORNECEDOR ESTA NA LISTA");

        }




        System.out.println("Clique <ENTER> para continuar...");
        this.sc.nextLine();
        this.sc.nextLine();

    }

    @Override
    public void Exibir() {
        Util.LimparConsole();
        ArrayList<Fornecedor> fornelista  = this.fornecedorService.Navegar();

        if(fornelista != null){
            for(Fornecedor lista : fornelista){
                ImprimirPorLinha(lista);

            }
        }
        if(fornelista.isEmpty()){
            System.out.println("NAO CONTEM NENHUM FORNECEDOR NA LISTA");
        }

        System.out.println("Clique <ENTER> para continuar...");
        this.sc.nextLine();
        this.sc.nextLine();

    }

    @Override
    public void Pesquisar() {
        Util.LimparConsole();
        System.out.println("DIGITE O CODIGO DO FORNECEDOR QUE VOCE DEJA PESQUISAR");
        int codigo = sc.nextInt();

        Fornecedor fonecedor = this.fornecedorService.Ler(codigo);

        if(fonecedor != null){
            ImprimirPorLinha(fonecedor);
        }else{

        }

        System.out.println("Clique <ENTER> para continuar...");
        this.sc.nextLine();
        this.sc.nextLine();

    }

    @Override
    public void Remover() {
        Util.LimparConsole();
        System.out.println("DIGITE O CODIGO DO FORNECEDOR A REMOVER: ");
        int cod = sc.nextInt();

        Fornecedor forne = this.fornecedorService.Ler(cod);

        if(forne != null){
            System.out.println("FORNECEDOR "+forne.getNomeFan()+" FOI REMOVIDO COM SUCESSO:");
            this.fornecedorService.Remover(cod);
        }else{
            System.out.println("NAO FOI POSSIVEL REMOVER O FORNECEDOR");
        }

        System.out.println("Clique <ENTER> para continuar...");
        this.sc.nextLine();
        this.sc.nextLine();
    }

    private void ImprimirPorLinha(Fornecedor forne){
        String mensagem = "";
        mensagem += "Fornecedor: ";
        mensagem += "Código: " + forne.getCodigo() + " | ";
        mensagem += "Razao Social: " + forne.getRazaoSocial() + " | ";
        mensagem += "Nome Fantasia:" + forne.getNomeFan() + " |";
        mensagem += "CNPJ:" + forne.getCNPJ() + " |";
        mensagem += "Email:" + forne.getEmail() + " |";
        mensagem += "Telefone:" + forne.getTelefone() + " |";

        System.out.println(mensagem);
    }
}