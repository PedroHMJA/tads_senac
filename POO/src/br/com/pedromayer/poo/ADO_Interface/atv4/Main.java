/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.pedromayer.poo.ADO_Interface.atv4;

/**
 *
 * @author alves.7924
 */
public class Main {
    public static void main(String[] args) {
        InstrumentoMusical v = new Violao();
        InstrumentoMusical p = new Piano();
        InstrumentoMusical f = new Flauta();
        
        v.afinar();
        v.tocar();
        
        p.afinar();
        p.tocar();
        
        f.afinar();
        f.tocar();
        
    }
}
