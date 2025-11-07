package JulioCorrea;

import java.util.Scanner;

public class JDSC22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println();
        System.out.println("**************************************************************");
        System.out.println("* Aluno: JÚLIO DA SILVA CORRÊA - RA 0025250                  *");
        System.out.println("* Programa JDSC-22 - Soma de números até digitar zero        *");
        System.out.println("**************************************************************");
        System.out.println();

        int num = 1, soma = 0;

        while (num != 0) {
            System.out.print("\nDigite um número para somar (digite 0 para parar): ");
            num = sc.nextInt();
            soma += num;
        }

        System.out.println("\nO resultado da soma é: " + soma);
        System.out.println("Programa encerrando...");

        sc.close();
    }
}
