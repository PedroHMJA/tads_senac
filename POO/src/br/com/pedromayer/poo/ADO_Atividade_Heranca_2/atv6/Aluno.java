/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.pedromayer.poo.ADO_Atividade_Heranca_2.atv6;

/**
 *
 * @author alves.7924
 */
public class Aluno extends Pessoa {

    private String curso;

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public Aluno(String curso, String nome, int idade) {
        super(nome, idade);
        this.curso = curso;
    }

    @Override
    public void aprensentar() {
        System.out.println("Sou o aluno: "+this.getNome()+" e estou fazendo o curso de: "+this.getCurso());
    }
}
