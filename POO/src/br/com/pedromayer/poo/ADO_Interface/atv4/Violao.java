/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.pedromayer.poo.ADO_Interface.atv4;

/**
 *
 * @author alves.7924
 */
public class Violao implements InstrumentoMusical{

    @Override
    public void tocar() {
        System.out.println("Tocando o violao");
    }

    @Override
    public void afinar() {
        System.out.println("Afinando o  violao");
    }
    
    
    
}
