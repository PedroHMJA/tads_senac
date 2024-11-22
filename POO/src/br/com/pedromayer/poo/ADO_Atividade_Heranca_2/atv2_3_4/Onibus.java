/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.pedromayer.poo.ADO_Atividade_Heranca_2.atv2_3_4;

/**
 *
 * @author alves.7924
 */
public class Onibus extends Veiculo {
    private int assentos;

    public Onibus(int assentos) {
        this.assentos = assentos;
    }

    public Onibus(int assentos, String placa, int ano) {
        super(placa, ano);
        this.assentos = assentos;
    }

    public int getAssentos() {
        return assentos;
    }

    public void setAssentos(int assentos) {
        this.assentos = assentos;
    }

    @Override
    public void exibirDados() {
        System.out.printf("Veiculo: Onibus%nAno: %d%nAssentos: %d%nPlaca: %s%n",this.getAno(),this.getAssentos(),this.getPlaca());
    }


    

    
    
    
}
