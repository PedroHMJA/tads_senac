/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.pedromayer.agosto.poo.ex3;

/**
 *
 * @author alves.7924
 */
public class Principal {
    public static void main(String[] args) {
        
        ContaBancaria conta1 = new ContaBancaria();
        
        conta1.setNumeroDaConta(2023);
        conta1.setSaldo(0.25);
        conta1.setTitular("PEDRO H M J ALVES");
        
        System.out.printf("Numero da conta: %d%n", conta1.getNumeroDaConta());
        System.out.printf("Saldo: R$ %.2f%n", conta1.getSaldo());
        System.out.printf("Titular: %s%n", conta1.getTitular());
    }
}
