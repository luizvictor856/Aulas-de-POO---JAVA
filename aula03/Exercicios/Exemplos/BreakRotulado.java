package Exercicios.Exemplos;
public class BreakRotulado {
    public static void main(String[] args) {
        int i = 0;

        externo: // rótulo do laço externo
        for (; true ;) { // laço infinito
            interno: // rótulo do laço interno
            for (; i < 10; i++) {
                System.out.println("i = " + i);

                if (i == 2) {
                    prt("continue");
                    continue; // continua o laço interno
                }

                if (i == 3) {
                    System.out.println("break");
                    i++;
                    break; // interrompe o laço interno
                }

                if (i == 7) {
                    System.out.println("continue externo");
                    i++;
                    continue externo; // continua o laço externo
                }

                if (i == 8) {
                    System.out.println("break externo");
                    break externo; // interrompe o laço externo
                }

                for (int k = 0; k < 5; k++) {
                    if (k == 3) {
                        System.out.println("continue interno");
                        continue interno; // volta ao início do laço interno (for de i)
                    }
                }
            }
        }

        // não é possível usar break ou continue
        // para os rótulos neste ponto do programa
    }

    static void prt(String s) {
        System.out.println(s);
    }
}
