//Objetivo -->Extrair último algarismo e três últimos algarismos de um número long

public class UltimosAlgarismos {
    public static void main (String [] args) {
        long numero = 63274682736234L;
        int x , y = 0;

        //resolução 
        x = (int) (numero%10);
        y = (int) (numero%1000);

        System.out.println ("O último algarismo é: " + x);
        System.out.println ("Os três últimos algarismos são: " + y);
    }
}