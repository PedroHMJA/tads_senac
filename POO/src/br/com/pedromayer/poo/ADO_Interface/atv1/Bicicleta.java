/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.pedromayer.poo.ADO_Interface.atv1;

/**
 *
 * @author alves.7924
 */
public class Bicicleta implements Veiculo{

    @Override
    public void acelerar() {
        System.out.println("Acelerando a bicicleta");
    }

    @Override
    public void frear() {
        System.out.println("Freando a bicicleta");
    }

    @Override
    public void virar(String direcao) {
        System.out.printf("Virando a bicicleta para a %s", direcao);
    }
    
}
