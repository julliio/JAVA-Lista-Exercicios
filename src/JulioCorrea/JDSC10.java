package JulioCorrea;

import java.util.Scanner;

public class JDSC10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println();
        System.out.println("**************************************************");
        System.out.println("* Aluno: JÚLIO DA SILVA CORRÊA - RA 0025250      *");
        System.out.println("* Programa JDSC-10 - Ano bissexto               *");
        System.out.println("**************************************************");
        System.out.println();

        System.out.print("Digite um ano: ");
        int ano = sc.nextInt();

        if (ano % 4 == 0) {
            System.out.println("\n" + ano + " é um ano bissexto!");
        } else {
            System.out.println("\n" + ano + " não é um ano bissexto!");
        }

        sc.close();
    }
}
