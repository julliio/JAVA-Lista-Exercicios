package JulioCorrea;

import java.util.Scanner;

public class JDSC04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println();
        System.out.println("**************************************************");
        System.out.println("* Aluno: JÚLIO DA SILVA CORRÊA - RA 0025250      *");
        System.out.println("* Programa JDSC-04 - Pode votar?                 *");
        System.out.println("**************************************************");
        System.out.println();

        System.out.print("Digite a sua idade: ");
        int idade = sc.nextInt();

        if (idade >= 18) {
            System.out.println("\nVocê tem " + idade + " anos e já pode votar!");
        } else {
            System.out.println("\nVocê tem " + idade + " anos e ainda NÃO pode votar!");
        }

        sc.close();
    }
}
