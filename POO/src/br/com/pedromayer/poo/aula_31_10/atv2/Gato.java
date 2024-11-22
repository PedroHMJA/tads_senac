/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.pedromayer.poo.aula_31_10.atv2;

/**
 *
 * @author alves.7924
 */
public class Gato implements Animal {

    public Gato() {
    }
    
    @Override
    public void emitirSom() {
        System.out.println("Miaau");
    }

    @Override
    public void mover() {
        System.out.println("Gato está correndo.");
    }
    
}
