/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.pedromayer.poo.ADO_Atividade_Interface_e_Generics._2;

/**
 *
 * @author alves.7924
 */
public class TestaTributavel {

    public static void main(String[] args) {
        ContaCorrente testa = new ContaCorrente(2500.00);
        Tributavel testa2 = new SeguroDeVida();
        ContaPoupanca testa3 = new ContaPoupanca(2500.00);

        System.out.println("Conta Corrente");
        System.out.println("Saque");
        testa.sacar(500.00);
        System.out.println("Extrato");
        System.out.println(testa.obterSaldo());
        System.out.println("Deposito");
        testa.depositar(1000.00);
        System.out.println("Extrato");
        System.out.println(testa.obterSaldo());
        System.out.println("Tributos");
        System.out.println(testa.calculaTributos());

        System.out.println("Conta Poupanca");
        System.out.println("Saque");
        testa3.sacar(500.00);
        System.out.println("Extrato");
        System.out.println(testa3.obterSaldo());
        System.out.println("Deposito");
        testa3.depositar(1000.00);
        System.out.println("Extrato");
        System.out.println(testa3.obterSaldo());

        System.out.println("Seguro de Vida");
        System.out.println(testa2.calculaTributos());
    }
}
