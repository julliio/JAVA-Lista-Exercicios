package JulioCorrea;

import java.util.Scanner;

public class JDSC07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println();
        System.out.println("**************************************************");
        System.out.println("* Aluno: JÚLIO DA SILVA CORRÊA - RA 0025250      *");
        System.out.println("* Programa JDSC-07 - Triângulo válido            *");
        System.out.println("**************************************************");
        System.out.println();

        System.out.print("Digite o primeiro lado do triângulo: ");
        float lado1 = sc.nextFloat();

        System.out.print("Digite o segundo lado do triângulo: ");
        float lado2 = sc.nextFloat();

        System.out.print("Digite o terceiro lado do triângulo: ");
        float lado3 = sc.nextFloat();

        if (lado1 + lado2 > lado3 && lado1 + lado3 > lado2 && lado2 + lado3 > lado1) {
            System.out.println("\nÉ um triângulo válido!");

            if (lado1 == lado2 && lado2 == lado3) {
                System.out.println("\nTriângulo equilátero!");
            } else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
                System.out.println("\nTriângulo isósceles!");
            } else {
                System.out.println("\nTriângulo escaleno!");
            }
        } else {
            System.out.println("\nÉ um triângulo inválido!");
        }

        sc.close();
    }
}
