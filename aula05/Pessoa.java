public class Pessoa {
    private String nome;
    private int idade;
    private String cpf;
    private Contato contato;
    private Endereco endereco;

    public Pessoa (String nome, int idade, String cpf, Contato contato, Endereco endereco) {
        this.nome = nome;
        this.idade = idade;
        this.cpf = cpf;
        this.contato = contato;
        this.endereco = endereco;
    }

    public String apresentar () {
        return String.format("Nome: %s\n Idade: %d\n CPF: %s\n Contato: %s\n Endereco: %s", nome,
        idade, cpf, contato, endereco);
    }

    // (devo criar) getters e setters tal como no CONTATO.JAVA 
}