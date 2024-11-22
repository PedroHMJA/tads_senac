/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.pedromayer.agosto.poo.q1;

/**
 *
 * @author alves.7924
 */
public class Principal {
    public static void main(String[] args) {
        Imovel casa = new Imovel("Pedro", "Rua ABC, 9192", 200000.00, 2020);
        
        System.out.println(casa.calcularValorVenda(2022, 5.00));
    }
}
