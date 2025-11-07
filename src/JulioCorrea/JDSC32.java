package JulioCorrea;

import java.util.Scanner;

public class JDSC32 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("\n**************************************************************");
        System.out.println("* Aluno: JÚLIO DA SILVA CORRÊA - RA 0025250                  *");
        System.out.println("* Programa JDSC-32 -  Tabuada de um número                   *");
        System.out.println("**************************************************************");

        int i = 1;
        System.out.print("\nDigite um número e saiba sua tabuada: ");
        int num = sc.nextInt();

        do {
            System.out.println(num + " x " + i + " = " + (num * i));
            i++;
        } while (i <= 10);

        sc.close();
    }
}
