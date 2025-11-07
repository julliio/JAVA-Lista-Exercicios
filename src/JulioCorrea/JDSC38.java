package JulioCorrea;

import java.util.Scanner;

public class JDSC38 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("\n**************************************************************");
        System.out.println("* Aluno: JÚLIO DA SILVA CORRÊA - RA 0025250                  *");
        System.out.println("* Programa JDSC-38 - Menu até escolher sair                  *");
        System.out.println("**************************************************************");

        int num;
        char opcao;

        do {
            System.out.println("\n\n============== MENU ==============");
            System.out.println("1 - Mostrar mensagem importante.");
            System.out.println("2 - Exibir tabuadas.");
            System.out.println("s - Deseja sair? Digite s");
            System.out.println("==================================");

            System.out.print("\n\nQual opção você deseja? ");
            opcao = sc.next().charAt(0);

            if (opcao == '1') {
                System.out.println("\nEstar matematicamente classificado é um crime contra a arte futebolística!");
            } else if (opcao == '2') {
                System.out.print("\nDigite o número da tabuada que deseja saber: ");
                num = sc.nextInt();

                for (int i = 1; i <= 10; i++) {
                    System.out.println("\n" + num + " x " + i + " = " + (num * i));
                }
            } else if (opcao == 's' || opcao == 'S') {
                System.out.println("\nEncerrando programa...");
            } else {
                System.out.println("\nOpção inválida!");
            }
        } while (opcao != 's' && opcao != 'S');

        sc.close();
    }
}

