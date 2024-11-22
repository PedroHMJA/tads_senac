/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.pedromayer.poo.ADO_Atividade_Heranca_2.atv2_3_4;

/**
 *
 * @author alves.7924
 */
public class Caminhao extends Veiculo {

    private int eixos;

    public Caminhao(int eixos) {
        this.eixos = eixos;
    }

    public Caminhao(int eixos, String placa, int ano) {
        super(placa, ano);
        this.eixos = eixos;
    }

    public int getEixos() {
        return eixos;
    }

    public void setEixos(int eixos) {
        this.eixos = eixos;
    }

    @Override
    public void exibirDados() {
        System.out.printf("Veiculo: Caminhao%nAno: %d%nEixos: %d%nPlaca: %s%n", this.getAno(), this.getEixos(), this.getPlaca());
    }

}
