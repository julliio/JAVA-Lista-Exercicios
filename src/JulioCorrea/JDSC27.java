package JulioCorrea;

import java.util.Scanner;

public class JDSC27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("\n**************************************************************");
        System.out.println("* Aluno: JÚLIO DA SILVA CORRÊA - RA 0025250                  *");
        System.out.println("* Programa JDSC-27 - Quantidade de números ímpares digitados *");
        System.out.println("**************************************************************");

        int num, i = 1, impares = 0;

        while (i <= 10) {
            System.out.print("\nDigite o " + i + "º número: ");
            num = sc.nextInt();

            if (num % 2 != 0) {
                impares++;
            }

            i++;
        }

        System.out.println("\nQuantidade de números ímpares digitados: " + impares);

        sc.close();
    }
}
