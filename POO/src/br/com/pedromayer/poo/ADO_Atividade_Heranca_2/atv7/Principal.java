/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.pedromayer.poo.ADO_Atividade_Heranca_2.atv7;

/**
 *
 * @author alves.7924
 */
public class Principal {

    public static void main(String[] args) {
        Televisao tv1 = new Televisao(32, "xamxung", "maibarato");
        Smartphone smartPhone1 = new Smartphone("Android", "rg", "cinematica");
        
        tv1.ligar();
        smartPhone1.ligar();
    }
}
