/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.pedromayer.agosto.poo.ex6;

import java.util.Scanner;

/**
 *
 * @author alves.7924
 */
public class Principal {
    public static void main(String[] args){
        
        Scanner leia = new Scanner(System.in);
        
        System.out.println("Informe o numero para saber a sua tabuada: ");
        int numero = leia.nextInt();
        
        Tabuada numero1 = new Tabuada(numero);
        
        numero1.calculaTabuada();
    }
}
