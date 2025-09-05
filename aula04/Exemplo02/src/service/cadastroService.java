package service;

import model.pessoa;

public class cadastroService () {
    public Pessoa cadastrarPessoa (String nome, int idade){
        return new Pessoa (nome, idade);
    } 

    public String mostrarPessoa(Pessoa pessoa) {
        return pessoa.exibirDados();
    }

}