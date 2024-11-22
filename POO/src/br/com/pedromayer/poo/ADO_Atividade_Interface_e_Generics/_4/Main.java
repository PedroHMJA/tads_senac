/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package br.com.pedromayer.poo.ADO_Atividade_Interface_e_Generics._4;

/**
 *
 * @author Pedro
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        SimpleList lista = new SimpleList();
        String st1 = "Olá";
        String st2 = "Oi";
        String st3 = "Hello";
        
        lista.adiciona(st1);
        lista.adiciona(st2);
        lista.adiciona(st3);
        
        lista.exibirElementos();
        System.out.println(lista.tamanho());
    }
    
}
