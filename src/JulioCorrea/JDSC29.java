package JulioCorrea;

import java.util.Scanner;

public class JDSC29 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("\n**************************************************************");
        System.out.println("* Aluno: JÚLIO DA SILVA CORRÊA - RA 0025250                  *");
        System.out.println("* Programa JDSC-29 - Contar dígitos de um número             *");
        System.out.println("**************************************************************");

        System.out.print("\nDigite um número inteiro positivo: ");
        int num = sc.nextInt();

        if (num <= 0) {
            System.out.println("\nPor favor, digite um número positivo maior que zero.");
            sc.close();
            return;
        }

        int cont = 0;
        int aux = num; // Mantém o número original

        while (aux != 0) {
            aux = aux / 10;
            cont++;
        }

        System.out.println("\nQuantidade de dígitos: " + cont);

        sc.close();
    }
}
