/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.pedromayer.poo.aula_31_10.atv4;

/**
 *
 * @author alves.7924
 */
public class Piano implements InstrumentoMusical {

    @Override
    public void tocar() {
        System.out.println("Tocando piano");
    }

    @Override
    public void afinar() {
        System.out.println("Afinando piano");
    }
}
