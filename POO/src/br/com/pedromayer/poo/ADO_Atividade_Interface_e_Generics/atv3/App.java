/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package br.com.pedromayer.poo.ADO_Atividade_Interface_e_Generics.atv3;

/**
 *
 * @author alves.7924
 */
public class App {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Carro carro1 = new Carro("Corsa");
        Carro carro2 = new Carro("Gol");
        
        Par pares = new Par(carro1, carro2);
        
        System.out.println(pares.getObjUm());
        System.out.println(pares.getObjDois());
        
        
        
    }
    
}
