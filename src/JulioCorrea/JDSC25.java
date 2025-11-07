package JulioCorrea;

import java.util.Scanner;

public class JDSC25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("\n**************************************************************");
        System.out.println("* Aluno: JÚLIO DA SILVA CORRÊA - RA 0025250                  *");
        System.out.println("* Programa JDSC-25 - Tabuada com while                       *");
        System.out.println("**************************************************************");

        int i = 1, num;

        System.out.print("\nDigite um número e saiba sua tabuada: ");
        num = sc.nextInt();

        while (i <= 10) {
            System.out.println("\n" + num + " x " + i + " = " + (i * num));
            i++;
        }

        sc.close();
    }
}
