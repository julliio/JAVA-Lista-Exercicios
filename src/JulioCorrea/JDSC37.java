package JulioCorrea;

import java.util.Scanner;

public class JDSC37 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("\n**************************************************************");
        System.out.println("* Aluno: JÚLIO DA SILVA CORRÊA - RA 0025250                  *");
        System.out.println("* Programa JDSC-37 -   Soma até o número ser múltiplo de 10  *");
        System.out.println("**************************************************************");

        int num, soma = 0;

        do {
            System.out.print("\nDigite um número: ");
            num = sc.nextInt();
            soma += num;
        } while (num % 10 != 0);

        System.out.println("\nSoma dos números inseridos: " + soma);

        sc.close();
    }
}
