package JulioCorrea;

import java.util.Scanner;

public class JDSC24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("\n**************************************************************");
        System.out.println("* Aluno: JÚLIO DA SILVA CORRÊA - RA 0025250                  *");
        System.out.println("* Programa JDSC-24 -  Verificar se um número é positivo      *");
        System.out.println("**************************************************************");

        int num = -1;

        while (num <= 0) {
            System.out.print("\nDigite um número (digite um número positivo diferente de 0 para parar): ");
            num = sc.nextInt();
        }

        System.out.println("\n\n" + num + " é um número positivo!");
        System.out.println("Programa encerrando...");

        sc.close();
    }
}
