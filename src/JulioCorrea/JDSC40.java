package JulioCorrea;

import java.util.Scanner;

public class JDSC40 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("\n*************************************************************************");
        System.out.println("* Aluno: JÚLIO DA SILVA CORRÊA - RA 0025250                             *");
        System.out.println("* Programa JDSC-40 - Ler números e mostrar o maior (até digitar negativo)*");
        System.out.println("*************************************************************************");

        int num, maiorNumero = 0;

        do {
            System.out.print("\nDigite um número (negativo para sair): ");
            num = sc.nextInt();

            if (num > maiorNumero && num >= 0) {
                maiorNumero = num;
            }

        } while (num >= 0);

        System.out.println("\nO maior número positivo digitado foi: " + maiorNumero);

        sc.close();
    }
}
