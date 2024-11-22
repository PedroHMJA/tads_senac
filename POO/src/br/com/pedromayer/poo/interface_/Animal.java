/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.pedromayer.poo.interface_;

/**
 *
 * @author alves.7924
 */
public class Animal implements SerVivo {

    @Override
    public void mover() {
        System.out.println("Movendo");
    }

    @Override
    public void comer() {
        System.out.println("comendo");
     }

    @Override
    public void info(){
        System.out.println("Info");
    }
    
}
