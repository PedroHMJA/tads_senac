/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.pedromayer.agosto.poo.ex6;

/**
 *
 * @author alves.7924
 */
public class Tabuada {
    int numero;

    public Tabuada(int numero) {
        this.numero = numero;
    }
    
    public void calculaTabuada(){
        for(int i=1; i<=10;i++){
            System.out.printf("%d x %d = %d\n", numero,  i, (numero*i));
        }
    }
}
