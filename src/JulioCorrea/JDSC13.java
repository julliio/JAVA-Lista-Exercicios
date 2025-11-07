package JulioCorrea;

public class JDSC13 {
    public static void main(String[] args) {

        System.out.println();
        System.out.println("**************************************************************");
        System.out.println("* Aluno: JÚLIO DA SILVA CORRÊA - RA 0025250                  *");
        System.out.println("* Programa JDSC-13 - Soma dos 100 primeiros números naturais *");
        System.out.println("**************************************************************");
        System.out.println();

        int soma = 0;

        for (int i = 1; i <= 100; i++) {
            soma += i;
        }

        System.out.println("\nA soma dos 100 primeiros números naturais é: " + soma);
    }
}
