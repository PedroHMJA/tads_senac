/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.pedromayer.poo.ADO_Atividade_Heranca_2.atv1;

/**
 *
 * @author alves.7924
 */
public class Circulo extends Figura {

    private double raio;

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    public Circulo(double raio, String cor) {
        super(cor);
        this.raio = raio;
    }

    @Override
    public double area() {
        return 3.14 * (this.raio * this.raio);
    }

    @Override
    public String toString() {
        return "Circulo: " + "area = " +this.area();
    }
    
    

}
