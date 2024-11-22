/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.pedromayer.poo.aula_31_10.atv3;

/**
 *
 * @author alves.7924
 */
public class Engenheiro extends Funcionario {

    public Engenheiro() {
    }

    @Override
    public void trabalhar() {
        System.out.println("Engenheiro esta trabalhando");
    }

    @Override
    public void descansar() {
        System.out.println("Engenheiro esta descansando");
    }
    
}
