// como está tudo dentro do mesmo diretório, não será necessário importar.

public class ClassPrincipal { // metodo main sempre vai recever um array
    public static void main (String[] args) {
        Contato contato1 = new Contato ("luizvictor856@gmail.com", "45454");
        System.out.println(contato1.mostrarContato());
        contato1.setEmail("Luizvicti4545")
        System.out.println(contato1.mostrarContato());

        Endereco endereco1 = new Endereco("Dolores", "Bolsonaro"); // posso instanciar quantos eu quiser
        System.out.println(endereco1.mostrarEndereco);

        Endereco endereco2 = new Endereco ("saturno", "jardim planetario");

        Pessoa pessoa1 = new Pessoa ("Luiz", 23, "54544545", contato1, endereco1);
        System.out.println(pessoa1.apresentar())

    }
}