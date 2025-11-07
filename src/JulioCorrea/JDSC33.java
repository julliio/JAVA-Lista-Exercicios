package JulioCorrea;

import java.util.Scanner;

public class JDSC33 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("\n**************************************************************");
        System.out.println("* Aluno: JÚLIO DA SILVA CORRÊA - RA 0025250                  *");
        System.out.println("* Programa JDSC-33 - Menu com opção de sair                  *");
        System.out.println("**************************************************************");

        int opcao = 0;

        do {
            System.out.println("\n\n============== MENU ==============");
            System.out.println("1 - Mensagem");
            System.out.println("2 - Sair");
            System.out.println("====================================");

            System.out.print("\n\nQual opção você deseja? ");
            opcao = sc.nextInt();

            if (opcao == 1) {
                System.out.println("\nVocê escolheu a mensagem!");
            } else if (opcao == 2) {
                System.out.println("\nEncerrando programa...");
            } else {
                System.out.println("\nOpção inválida!");
            }

        } while (opcao != 2);

        sc.close();
    }
}
