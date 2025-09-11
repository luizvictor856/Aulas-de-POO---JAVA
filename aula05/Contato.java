public class Contato {  // isso aqui é o "arroz c/ feijão"
    private String email;           // atributos
    private Strinf telefone;        // atributos

    // uma forma, uma representação... | para colocar informações, serão necessárias outras classes.



    public Contato(String email, String telefone) {
        this.email = email;
        this.telefone = telefone;
    }   // construtor

    public String mostrarContato () {
        return String.format("Email: %\nTelefone:%s", email, telefone);
    } 

     // ------- GET AND SETTERS ------- //


    public String getEmail() {              // metodo publicos
        return email;
    }                   

    public void setEmail (String email) {    // aqui pode ter o choque nos nomes
        this.email = email;

    } // deve ser passado um parâmetro 


    public String getTelefone () {
        return telefone;
    }


    public void setTelefone (String telefone) {
        this.telefone = telefone;
    }


}