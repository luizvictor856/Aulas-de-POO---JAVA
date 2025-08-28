package Exercicios;
import java.util.Scanner;

public class TesteScanner {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        System.err.println("Digite alguma coisa: ");
        while (sc.hasNext()) {
            System.out.println(sc.next());
        }
        sc.close();
    }
}
