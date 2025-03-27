package br.com.classes;

public class Pessoa {
    private String nome;
    private int idade;

    public Pessoa(String nome){
        this.nome = nome;
        idade = 20;
        imprimirDados();
    }

    public void imprimirDados(){
        System.out.format(
            "Nome: %s, idade = %d \n",
            nome, 
            idade
        );
    }

    public String getNome(){
       return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public int getIdade(){
        return idade;
    }

    public void setIdade(int idade){
        this.idade = idade;
    }
}
