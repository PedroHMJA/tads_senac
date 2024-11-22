/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package br.com.pedromayer.poo.ADO_Interface.atv3;

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
        Engenheiro eng = new Engenheiro();
        Vendedor vend = new Vendedor();
        
        eng.setSalario(5000.00);
        vend.setSalario(4000.00);
        
        eng.trabalhar();
        System.out.println("Eng: "+eng.getSalario());
        eng.descansar();
        
        vend.trabalhar();
        System.out.println("Vend: "+vend.getSalario());
        vend.descansar();
    }
    
    
}
