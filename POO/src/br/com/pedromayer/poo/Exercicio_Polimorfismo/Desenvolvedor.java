/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.pedromayer.poo.Exercicio_Polimorfismo;

/**
 *
 * @author alves.7924
 */
public class Desenvolvedor extends Funcionario {

    private double desconto;

    public Desenvolvedor(double desconto, String nome, double salarioBase) {
        super(nome, salarioBase);
        this.desconto = desconto;
    }

    public double getDesconto() {
        return desconto;
    }

    public void setDesconto(double desconto) {
        this.desconto = desconto;
    }

    @Override
    public double calcularSalarioTotal() {
        return this.getSalarioBase() - this.getDesconto();
    }

}
