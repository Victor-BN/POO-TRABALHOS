package view;

import java.util.Scanner;

public class EditaMenu {
    public void showMenu() {
        int opt;
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("ESCOLHA QUAL DESCRICAO VOCE DESEJA ALTERAR DE FUNCIONARIO!");
            System.out.println("1 -Alterar Cargo");
            System.out.println("2 -Alterar Salario");
            System.out.println("3- ALTERAR EMAIL");
            System.out.println("4- ALTERAR TELEFONE");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");

            opt = sc.nextInt();

            switch (opt) {
                case 1:
                    System.out.println("Você escolheu alterar o nome.");
                    // Add logic for changing the name
                    break;
                case 2:
                    System.out.println("Você escolheu alterar o cargo.");
                    // Add logic for changing the position
                    break;
                case 3:
                    System.out.println("Você escolheu alterar o salário.");
                    // Add logic for changing the salary
                    break;
                case 0:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }

        } while (opt != 0);

        sc.close();
    }


}
