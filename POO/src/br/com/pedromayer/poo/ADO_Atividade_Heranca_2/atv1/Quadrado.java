/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.pedromayer.poo.ADO_Atividade_Heranca_2.atv1;

/**
 *
 * @author alves.7924
 */
public class Quadrado extends Retangulo {
    
    public Quadrado(double lado1, double lado2, String cor) {
        super(lado1, lado2, cor);
    }

    @Override
    public double area() {
        return (this.getLado1()+this.getLado2())*2;
    }
    
    

    @Override
    public String toString() {
        return "Quadrado: " + "area = " +this.area();
    }

    
    
    
}
