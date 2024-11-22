/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.pedromayer.poo.ADO_Atividade_Heranca_2.atv7;

/**
 *
 * @author alves.7924
 */
public class Smartphone extends Eletronico{

    private String sistemaOperacional;

    public Smartphone(String sistemaOperacional, String marca, String modelo) {
        super(marca, modelo);
        this.sistemaOperacional = sistemaOperacional;
    }        
    
    public String getSistemaOperacional() {
        return sistemaOperacional;
    }

    public void setSistemaOperacional(String sistemaOperacional) {
        this.sistemaOperacional = sistemaOperacional;
    }
    
    
    @Override
    public void ligar() {
        System.out.println("Ligando o smartphone da marca: "+this.getMarca()+" modelo: "+this.getModelo()+" com o SO: "+this.getSistemaOperacional());
    }
    
}
