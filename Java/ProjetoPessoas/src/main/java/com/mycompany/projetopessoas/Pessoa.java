package com.mycompany.projetopessoas;

public class Pessoa {
    
    private String nome;
    private int idade;
    private String sexo;
    
    public void fazerAniversario(){
        this.idade ++;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public String getSexo() {
        return sexo;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    
    
}
