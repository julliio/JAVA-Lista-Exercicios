package JulioCorrea;

import java.util.Scanner;

public class JDSC20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println();
        System.out.println("**************************************************************");
        System.out.println("* Aluno: JÚLIO DA SILVA CORRÊA - RA 0025250                  *");
        System.out.println("* Programa JDSC-20 - Números de Fibonacci (n termos)         *");
        System.out.println("**************************************************************");
        System.out.println();

        System.out.print("Quantos números da sequência de Fibonacci você quer? ");
        int num = sc.nextInt();

        int a = 0, b = 1, proximoNumero;

        for (int i = 1; i <= num; i++) {
            System.out.println("\n" + a);
            proximoNumero = a + b;
            a = b;
            b = proximoNumero;
        }

        sc.close();
    }
}
