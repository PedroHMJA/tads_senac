/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.pedromayer.poo.ADO_Interface.atv2;

/**
 *
 * @author alves.7924
 */
public class Passaro implements Animal {

    public Passaro() {
    }

    @Override
    public void emitirSom() {
        System.out.println("Passaro esta cantando");
    }

    @Override
    public void mover() {
        System.out.println("Passsaro esta voando");
    }
    
}
