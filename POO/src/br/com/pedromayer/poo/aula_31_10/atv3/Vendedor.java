/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.pedromayer.poo.aula_31_10.atv3;

/**
 *
 * @author alves.7924
 */
public class Vendedor extends Funcionario {

    public Vendedor() {
    }

    @Override
    public void trabalhar() {
        System.out.println("Vendedor esta trabalhando");
    }

    @Override
    public void descansar() {
        System.out.println("Vendedor esta descansando");
    }
    
}
