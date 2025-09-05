

public class pessoa {
    private String nome;
    private int idade;


    public pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    //get 


    public String getNome () {
        return nome;
    }

    public int getIdade () {
        return idade;
    }


    // set

    
    public void setNome(String nome){
    this.nome = nome; //guardando valor do nome 
   }

   public void setIdade (int idade){
    this.idade = idade;
   }

   public String showAluno(){
    return "Nome: " + this.getNome() + "\n" + "Idade: ";
   }



}