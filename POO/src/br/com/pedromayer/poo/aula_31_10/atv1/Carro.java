/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.pedromayer.poo.aula_31_10.atv1;

/**
 *
 * @author alves.7924
 */
public class Carro implements Veiculo {

    public Carro() {
    }

            
    @Override
    public void acelerar() {
        System.out.println("Acelerando o carro");
    }

    @Override
    public void frear() {
        System.out.println("Freando o carro");
    }

    @Override
    public void virar(String direcao) {
        System.out.printf("Virando o carro para a %s", direcao);
    }
    
}
