package JulioCorrea;

import java.util.Scanner;

public class JDSC30 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("\n**************************************************************");
        System.out.println("* Aluno: JÚLIO DA SILVA CORRÊA - RA 0025250                  *");
        System.out.println("* Programa JDSC-30 - Menu até escolher sair                  *");
        System.out.println("**************************************************************");

        int opcao = 0;

        while (opcao != 3) {
            System.out.println("\n\n============== MENU ==============");
            System.out.println("1 - Dizer a mensagem olá");
            System.out.println("2 - Mostrar números de 1 até 5");
            System.out.println("3 - Sair");
            System.out.println("==================================");

            System.out.print("\n\nQual opção você deseja? ");
            opcao = sc.nextInt();

            if (opcao == 1) {
                System.out.println("\nOlá!");
            } else if (opcao == 2) {
                for (int i = 1; i <= 5; i++) {
                    System.out.println(i);
                }
            } else if (opcao == 3) {
                System.out.println("\nEncerrando programa...");
            } else {
                System.out.println("\nOpção inválida!");
            }
        }

        sc.close();
    }
}
