package JulioCorrea;

import java.util.Scanner;

public class JDSC08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println();
        System.out.println("**************************************************");
        System.out.println("* Aluno: JÚLIO DA SILVA CORRÊA - RA 0025250      *");
        System.out.println("* Programa JDSC-08 - Login simples               *");
        System.out.println("**************************************************");
        System.out.println();

        System.out.print("Digite o usuário: ");
        String usuario = sc.next();

        System.out.print("Digite a senha: ");
        String senha = sc.next();

        boolean userCerto = usuario.equals("Julio");
        boolean senhaCerta = senha.equals("123");

        if (userCerto && senhaCerta) {
            System.out.println("\nAcesso permitido!");
        } else {
            System.out.println("\nAcesso negado!");
        }

        sc.close();
    }
}
