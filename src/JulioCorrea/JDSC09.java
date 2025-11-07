package JulioCorrea;

import java.util.Scanner;

public class JDSC09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println();
        System.out.println("**************************************************");
        System.out.println("* Aluno: JÚLIO DA SILVA CORRÊA - RA 0025250      *");
        System.out.println("* Programa JDSC-09 - Ordem crescente (três números)*");
        System.out.println("**************************************************");
        System.out.println();

        System.out.print("Digite o primeiro numero: ");
        int num1 = sc.nextInt();

        System.out.print("Digite o segundo numero: ");
        int num2 = sc.nextInt();

        System.out.print("Digite o terceiro numero: ");
        int num3 = sc.nextInt();

        if (num1 <= num2 && num1 <= num3) {
            if (num2 <= num3) {
                System.out.println("\nOrdem crescente: " + num1 + " " + num2 + " " + num3);
            } else {
                System.out.println("\nOrdem crescente: " + num1 + " " + num3 + " " + num2);
            }
        } else if (num2 <= num1 && num2 <= num3) {
            if (num1 <= num3) {
                System.out.println("\nOrdem crescente: " + num2 + " " + num1 + " " + num3);
            } else {
                System.out.println("\nOrdem crescente: " + num2 + " " + num3 + " " + num1);
            }
        } else {
            if (num1 <= num2) {
                System.out.println("\nOrdem crescente: " + num3 + " " + num1 + " " + num2);
            } else {
                System.out.println("\nOrdem crescente: " + num3 + " " + num2 + " " + num1);
            }
        }

        sc.close();
    }
}
