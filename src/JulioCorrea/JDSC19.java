package JulioCorrea;

import java.util.Scanner;

public class JDSC19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println();
        System.out.println("**************************************************************");
        System.out.println("* Aluno: JÚLIO DA SILVA CORRÊA - RA 0025250                  *");
        System.out.println("* Programa JDSC-19 - Verificar se um número é primo          *");
        System.out.println("**************************************************************");
        System.out.println();

        System.out.print("Digite um número: ");
        int num = sc.nextInt();

        int divisores = 0;
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                divisores++;
            }
        }

        if (divisores == 2) {
            System.out.println("\nO número " + num + " é primo!");
        } else {
            System.out.println("\nO número " + num + " não é primo!");
        }

        sc.close();
    }
}
