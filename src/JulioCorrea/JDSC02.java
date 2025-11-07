package JulioCorrea;

import java.util.Scanner;

public class JDSC02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println();
        System.out.println("**************************************************");
        System.out.println("* Aluno: JÚLIO DA SILVA CORRÊA - RA 0025250      *");
        System.out.println("* Programa JDSC-02 - Par ou ímpar                *");
        System.out.println("**************************************************");
        System.out.println();

        System.out.print("Digite um número: ");
        int num = sc.nextInt();

        if (num % 2 == 0) {
            System.out.println("O número " + num + " é par!");
        } else {
            System.out.println("O número " + num + " é ímpar!");
        }

        sc.close();
    }
}
