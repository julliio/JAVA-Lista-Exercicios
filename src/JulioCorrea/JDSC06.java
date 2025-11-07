package JulioCorrea;

import java.util.Scanner;

public class JDSC06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println();
        System.out.println("**************************************************");
        System.out.println("* Aluno: JÚLIO DA SILVA CORRÊA - RA 0025250      *");
        System.out.println("* Programa JDSC-06 - Múltiplo de 3 e/ou 5        *");
        System.out.println("**************************************************");
        System.out.println();

        System.out.print("Digite um número: ");
        int num = sc.nextInt();

        if (num % 3 == 0 && num % 5 == 0) {
            System.out.println("\nO número " + num + " é múltiplo de 3 e de 5!");
        } else if (num % 3 == 0) {
            System.out.println("\nO número " + num + " é múltiplo de 3!");
        } else if (num % 5 == 0) {
            System.out.println("\nO número " + num + " é múltiplo de 5!");
        } else {
            System.out.println("\nO número " + num + " não é múltiplo nem de 3 nem de 5!");
        }

        sc.close();
    }
}

