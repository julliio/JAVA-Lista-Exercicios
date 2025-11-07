package JulioCorrea;

import java.util.Scanner;

public class JDSC26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("\n**************************************************************");
        System.out.println("* Aluno: JÚLIO DA SILVA CORRÊA - RA 0025250                  *");
        System.out.println("* Programa JDSC-26 - Número primo com while                  *");
        System.out.println("**************************************************************");

        int num, i = 1, divisores = 0;

        System.out.print("\nDigite um número: ");
        num = sc.nextInt();

        while (i <= num) {
            if (num % i == 0) {
                divisores++;
            }
            i++;
        }

        if (divisores == 2) {
            System.out.println("\nO número " + num + " é primo!");
        } else {
            System.out.println("\nO número " + num + " não é primo!");
        }

        sc.close();
    }
}
