package JulioCorrea;

import java.util.Scanner;

public class JDSC03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println();
        System.out.println("**************************************************");
        System.out.println("* Aluno: JÚLIO DA SILVA CORRÊA - RA 0025250      *");
        System.out.println("* Programa JDSC-03 - Maior de dois números       *");
        System.out.println("**************************************************");
        System.out.println();

        System.out.print("Digite o primeiro número: ");
        int num1 = sc.nextInt();

        System.out.print("Digite o segundo número: ");
        int num2 = sc.nextInt();

        if (num1 > num2) {
            System.out.println("O número " + num1 + " é maior que o número " + num2 + "!");
        } else if (num2 > num1) {
            System.out.println("O número " + num2 + " é maior que o número " + num1 + "!");
        } else {
            System.out.println("Os números " + num1 + " e " + num2 + " são iguais!");
        }

        sc.close();
    }
}

