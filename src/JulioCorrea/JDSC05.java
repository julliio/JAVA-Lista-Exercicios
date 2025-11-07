package JulioCorrea;

import java.util.Scanner;

public class JDSC05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println();
        System.out.println("**************************************************");
        System.out.println("* Aluno: JÚLIO DA SILVA CORRÊA - RA 0025250      *");
        System.out.println("* Programa JDSC-05 - Notas e aprovação           *");
        System.out.println("**************************************************");
        System.out.println();

        System.out.print("Digite a primeira nota: ");
        float nota1 = sc.nextFloat();

        System.out.print("Digite a segunda nota: ");
        float nota2 = sc.nextFloat();

        System.out.print("Digite a terceira nota: ");
        float nota3 = sc.nextFloat();

        float media = (nota1 + nota2 + nota3) / 3;

        if (media >= 6) {
            System.out.println("\nSua média é " + media + " e você está aprovado!");
        } else {
            System.out.println("\nSua média é " + media + " e você está reprovado!");
        }

        sc.close();
    }
}
