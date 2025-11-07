package JulioCorrea;

import java.util.Scanner;

public class JDSC01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println();
        System.out.println("**************************************************");
        System.out.println("* Aluno: JÚLIO DA SILVA CORRÊA - RA 0025250      *");
        System.out.println("* Programa JDSC-01 - Número positivo ou negativo *");
        System.out.println("**************************************************");
        System.out.println();

        System.out.print("Digite um número: ");
        int num = sc.nextInt();

        if (num > 0) {
            System.out.println("\nNúmero positivo!");
        } else if (num < 0) {
            System.out.println("\nNúmero negativo!");
        } else {
            System.out.println("\nVocê digitou zero!");
        }

        sc.close();
    }
}
