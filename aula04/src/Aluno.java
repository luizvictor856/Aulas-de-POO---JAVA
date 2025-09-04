package model; //ele precisa reconhecer o pacote; 

public class Aluno {
   public String nome; // por padrao ele é protect (visivel apenas dentro do pacote)
   public int idade;


   public Aluno() {}

   public Aluno (String nome, int idade) {
    this.nome = nome;
    this.idade = idade;
   }

   public String getNome(){
    return nome; // this é desnecessário pq não está colidindo com nenhuma outra nomenclatura;
   }

   public int getIdade(){
    return idade;
   }

   //SET guardará os valores

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