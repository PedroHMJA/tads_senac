/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.pedromayer.poo.Atividade_Heranca;

/**
 *
 * @author alves.7924
 */
public class Principal {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno();
        Professor professor1 = new Professor();
        Diretor diretor1 = new Diretor();
        
        aluno1.setNome("Joao");
        professor1.setNome("Lucio");
        diretor1.setNome("Evandro");
        
        System.out.println(aluno1.getNome());
        System.out.println(professor1.getNome());
        System.out.println(diretor1.getNome());
        
        
        aluno1.setNota(new double[]{5.00,3.0,20.0});
        for(double nota: aluno1.getNota()){
            System.out.println(nota);
        }

    }
}
