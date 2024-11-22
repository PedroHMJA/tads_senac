/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.pedromayer.agosto.poo.ex2;

/**
 *
 * @author alves.7924
 */
public class Aluno {
    
    String nome;
    int idade;
    int matricula;

    public Aluno(String nome, int idade, int matricula) {
        this.nome = nome;
        this.idade = idade;
        this.matricula = matricula;
    }
    
    public void relatorioAluno(){
        System.out.printf("Nome: %s%nIdade: %d%nMatricula: %d%n", nome, idade, matricula);
    }
    
}
