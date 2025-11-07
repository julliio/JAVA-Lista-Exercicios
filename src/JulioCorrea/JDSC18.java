package JulioCorrea;

public class JDSC18 {
    public static void main(String[] args) {
        System.out.println();
        System.out.println("**************************************************************");
        System.out.println("* Aluno: JÚLIO DA SILVA CORRÊA - RA 0025250                  *");
        System.out.println("* Programa JDSC-18 - Múltiplos de 3 entre 1 e 30             *");
        System.out.println("**************************************************************");
        System.out.println();

        System.out.println("Múltiplos de 3 entre 1 e 30:");
        for (int i = 1; i <= 30; i++) {
            if (i % 3 == 0) {
                System.out.println(i);
            }
        }
    }
}
