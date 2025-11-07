package JulioCorrea;

import java.util.Scanner;

public class JDSC39 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("\n**************************************************************");
        System.out.println("* Aluno: JÚLIO DA SILVA CORRÊA - RA 0025250                  *");
        System.out.println("* Programa JDSC-39 - Validar número entre 1 e 5             *");
        System.out.println("**************************************************************");

        int num;

        do {
            System.out.print("\nDigite um número entre 1 e 5 para encerrar o programa: ");
            num = sc.nextInt();
        } while (num < 1 || num > 5);

        System.out.println("\nEncerrando programa...");

        sc.close();
    }
}
