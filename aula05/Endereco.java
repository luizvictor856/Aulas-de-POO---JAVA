public class Endereco {
    private String rua;
    private String cidade;
    private int numero;
    private String CEP;
    private boolean casa;
    private String complemento;
    private String bairro;

    public Endereco(String rua, String cidade, Number numero, String CEP, Boolean casa, 
    String complemento, String bairro) {
        this.rua = rua;
        this.cidade = cidade;
        this.numero = numero;
        this.CEP = CEP;
        this.casa = casa;
        this.complemento = complemento;
        this.bairro = bairro
    }


    public String mostrarEndereco() {
    
        String descricao = "casa"; 

        if (!casa){
            descricao = "Apartamento";
        }

        return String.format ("Rua: %s\n Cidade: %s\n Numero: %d CEP %s\n descricao %s\n
        Complemento %s\n Bairro %s", rua, cidade, numero, CEP, descricao, complemento, bairro);
    }


    // ----- GETTERS AND SETTERS ---- //


    public String getRua () {
        return rua;
    }

    public void setRua (String Rua) {
        this.rua = rua;
    }

    public String getCidade () {
        return cidade;
    }

    public void setCidade (String cidade) {
        this.cidade = cidade;
    }


    public Int getNumero () {
        return numero;
    }

    public void setNumero (int numero) {
        this.numero = numero;
    }
    
    public String getCEP () {
        return CEP;
    }

    public void setCEP (String CEP) {
        this.CEP = CEP;
    }

    public String descricao () {
        return descricao;
    }

    public void setDescricao (String descricao) {
        this.descricao = descricao;
    }

    public String getComplemento () {
        return complemento;
    }

    public void setComplemento (String complemento) {
        this.complemnto = complemento;
    }

    public String getBairro () {
        return bairro;
    }

    public void setBairro (String bairro) {
        this.bairro = bairro;
    }



}