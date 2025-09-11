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


    // ----- GETTERS AND SETTERS ---- //


    public String getRua () {
        return email;
    }

    public void setRua (String Rua) {
        this.email = email;
    }

    public String getCidade () {
        return cidade;
    }

    public void setRua (String cidade) {
        this.cidade = cidade;
    }


}