package JulioCorrea;

import java.util.Scanner;

public class JDSC34 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("\n**************************************************************");
        System.out.println("* Aluno: JÚLIO DA SILVA CORRÊA - RA 0025250                  *");
        System.out.println("* Programa JDSC-34 - Pedir senha até acertar                *");
        System.out.println("**************************************************************");

        int senha;

        do {
            System.out.print("\nDigite uma senha: ");
            senha = sc.nextInt();

            if (senha == 1111) {
                System.out.println("\nAcesso liberado!");
            } else {
                System.out.println("\nSenha incorreta, tente novamente.");
            }

        } while (senha != 1111);

        System.out.println("\nPrograma encerrando...");
        sc.close();
    }
}
