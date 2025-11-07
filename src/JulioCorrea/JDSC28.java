package JulioCorrea;

public class JDSC28 {
    public static void main(String[] args) {
        System.out.println("\n**************************************************************");
        System.out.println("* Aluno: JÚLIO DA SILVA CORRÊA - RA 0025250                  *");
        System.out.println("* Programa JDSC-28 - Soma dos pares entre 1 e 100            *");
        System.out.println("**************************************************************");

        int i = 1, soma = 0;

        while (i <= 100) {
            if (i % 2 == 0) {
                soma += i;
            }
            i++;
        }

        System.out.println("\nA soma dos números pares de 1 até 100 é: " + soma);
    }
}

