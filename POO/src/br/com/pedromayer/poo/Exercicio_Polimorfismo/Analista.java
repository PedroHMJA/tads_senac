/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.pedromayer.poo.Exercicio_Polimorfismo;

/**
 *
 * @author alves.7924
 */
public class Analista extends Funcionario {

    public Analista(String nome, double salarioBase) {
        super(nome, salarioBase);
    }
    
    @Override
    public double calcularSalarioTotal() {
        return this.getSalarioBase();
    }
    
}
