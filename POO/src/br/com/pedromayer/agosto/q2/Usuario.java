/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.pedromayer.agosto.q2;

/**
 *
 * @author alves.7924
 */
public class Usuario {
    String nome;
    int idade;
    int numId;

    public Usuario(String nome, int idade, int numId) {
        this.nome = nome;
        this.idade = idade;
        this.numId = numId;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getNumId() {
        return numId;
    }

    public void setNumId(int numId) {
        this.numId = numId;
    }
    
    
}
