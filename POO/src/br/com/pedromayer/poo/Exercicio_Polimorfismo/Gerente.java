/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.pedromayer.poo.Exercicio_Polimorfismo;

/**
 *
 * @author alves.7924
 */
public class Gerente extends Funcionario {

    private double bonus;

    public Gerente(double bonus, String nome, double salarioBase) {
        super(nome, salarioBase);
        this.bonus = bonus;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    @Override
    public double calcularSalarioTotal() {
        return this.getSalarioBase()+ this.getBonus();
    }

}
