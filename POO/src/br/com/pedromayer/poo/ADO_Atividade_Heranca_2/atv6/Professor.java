/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.pedromayer.poo.ADO_Atividade_Heranca_2.atv6;

/**
 *
 * @author alves.7924
 */
public class Professor extends Pessoa {

    private String departamento;

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public Professor(String departamento, String nome, int idade) {
        super(nome, idade);
        this.departamento = departamento;
    }

    @Override
    public void aprensentar() {
        System.out.println("Sou o professor: " + this.getNome() + " e sou do departamento de : " + this.getDepartamento());
    }

}
