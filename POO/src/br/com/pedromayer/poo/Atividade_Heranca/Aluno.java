/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.pedromayer.poo.Atividade_Heranca;

/**
 *
 * @author alves.7924
 */
public class Aluno extends Pessoa {
    private long matricula;
    
    private double[] notas;

    public long getMatricula() {
        return matricula;
    }

    public void setMatricula(long matricula) {
        this.matricula = matricula;
    }
    
    public double[] getNota() {
        return notas;
    }

    public void setNota(double [] notas) {
        this.notas = notas;
        
    }
    public Aluno() {
    }
    
    
}
