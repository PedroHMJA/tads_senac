/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.pedromayer.poo.ADO_Atividade_Interface_e_Generics._2;

/**
 *
 * @author alves.7924
 */
public class Conta {
    
    private double saldo;

    public Conta(double saldo) {
        this.saldo = saldo;
    }
       
    
    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void sacar(double valor) {
        setSaldo(getSaldo() - valor);
    }

    public void depositar(double valor) {
        setSaldo(getSaldo() + valor);
    }

    public double obterSaldo() {
        return getSaldo();
    }

}
