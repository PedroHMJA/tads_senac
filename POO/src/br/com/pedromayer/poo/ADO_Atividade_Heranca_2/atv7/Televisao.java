/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.pedromayer.poo.ADO_Atividade_Heranca_2.atv7;

/**
 *
 * @author alves.7924
 */
public class Televisao extends Eletronico {
    private int tamanhoTela;

    public Televisao(int tamanhoTela, String marca, String modelo) {
        super(marca, modelo);
        this.tamanhoTela = tamanhoTela;
    }
   

    public int getTamanhoTela() {
        return tamanhoTela;
    }

    public void setTamanhoTela(int tamanhoTela) {
        this.tamanhoTela = tamanhoTela;
    }

    @Override
    public void ligar() {
        System.out.println("Ligando a televisao da marca: "+this.getMarca()+" modelo: "+this.getModelo()+" e de "+this.getTamanhoTela()+" polegadas");
    }
    
}
