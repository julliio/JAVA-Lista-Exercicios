package JulioCorrea;

import java.util.Scanner;

public class JDSC23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int senha = 0;

        while (senha != 12345) {
            System.out.println();
            System.out.println("**************************************************************");
            System.out.println("* Aluno: JÚLIO DA SILVA CORRÊA - RA 0025250                  *");
            System.out.println("* Programa JDSC-23 - Senha correta                            *");
            System.out.println("**************************************************************");
            System.out.println();

            System.out.print("Digite a senha correta: ");
            senha = sc.nextInt();

            if (senha == 12345) {
                System.out.println();
                System.out.println("**************************************************************");
                System.out.println("* Aluno: JÚLIO DA SILVA CORRÊA - RA 0025250                  *");
                System.out.println("* Programa JDSC-23 - Senha correta                            *");
                System.out.println("**************************************************************");
                System.out.println("\nVocê acertou!");
            } else {
                System.out.println("Senha incorreta, tente novamente.");
            }
        }

        System.out.println("\nPrograma encerrando...");
        sc.close();
    }
}
