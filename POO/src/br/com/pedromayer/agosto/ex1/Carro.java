/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.pedromayer.agosto.poo.ex1;

/**
 *
 * @author alves.7924
 */
public class Carro {
    
    String marca;
    String modelo;
    int ano;

    public Carro(String marca, String modelo, int ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
    }

    public void relatorio(){
        System.out.printf("Marca: %s%nModelo: %s%nAno: %d%n", marca, modelo, ano);
    }

    
}
