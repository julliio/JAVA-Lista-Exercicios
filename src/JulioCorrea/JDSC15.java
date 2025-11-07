package JulioCorrea;

import java.util.Scanner;

public class JDSC15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println();
        System.out.println("**************************************************************");
        System.out.println("* Aluno: JÚLIO DA SILVA CORRÊA - RA 0025250                  *");
        System.out.println("* Programa JDSC-15 - Fatorial de um número                   *");
        System.out.println("**************************************************************");
        System.out.println();

        System.out.print("Digite um número: ");
        int num = sc.nextInt();
        int fatorial = 1;

        for (int i = 1; i <= num; i++) {
            fatorial *= i;
        }

        System.out.println("O fatorial de " + num + " é: " + fatorial);

        sc.close();
    }
}
