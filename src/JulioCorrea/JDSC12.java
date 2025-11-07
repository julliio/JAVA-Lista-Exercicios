package JulioCorrea;

import java.util.Scanner;

public class JDSC12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println();
        System.out.println("**************************************************");
        System.out.println("* Aluno: JÚLIO DA SILVA CORRÊA - RA 0025250      *");
        System.out.println("* Programa JDSC-12 - Tabuada de um número        *");
        System.out.println("**************************************************");
        System.out.println();

        System.out.print("Digite um número: ");
        int num = sc.nextInt();

        for (int i = 1; i <= 10; i++) {
            System.out.println(" " + num + " x " + i + " = " + (i * num));
        }

        sc.close();
    }
}
