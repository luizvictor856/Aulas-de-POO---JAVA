public class Endereco {
    private String rua;
    private String cidade;

    public Endereco(String rua, String cidade) {
        this.rua = rua;
        this.cidade = cidade;
    }


    public String mostrarEndereco() {
        return String.format ("Rua: %\n Cidade: %s", rua, cidade);
    }

    //toDO getters and setters (devo criar)
}