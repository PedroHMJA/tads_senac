/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package br.com.pedromayer.poo.aula_31_10.atv2;

/**
 *
 * @author alves.7924
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Cachorro cao = new Cachorro();
        Gato gato = new Gato();
        Passaro piu = new Passaro();
        
        cao.emitirSom();
        gato.emitirSom();
        piu.emitirSom();
    }
    
}
