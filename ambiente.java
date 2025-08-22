public class ambiente {
    public static void main (String[] args) {
        String env = "PROD";
        if(args.length > 0 && args [0].toUpperCase().equals(env)) {
            System.out.println("Ambiente de produção");
        }else {
            System.out.println("Ambiente de Desenvolvimento");
        }
    }
}