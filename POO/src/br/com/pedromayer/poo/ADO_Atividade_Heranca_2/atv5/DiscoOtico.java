/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.pedromayer.poo.ADO_Atividade_Heranca_2.atv5;

/**
 *
 * @author alves.7924
 */
public class DiscoOtico extends Dispositivo {

    public DiscoOtico(long capacidadeEmBytes) {
        super("Disco Otico", capacidadeEmBytes);
    }

    @Override
    public String toString() {
        return "DiscoOtico{" + "nome='" + nome + '\'' + ", Capacidade: " + capacidadeEmMegabytes() + " MB}";
    }

    @Override
    public double capacidadeEmMegabytes() {
        return capacidadeEmBytes / (1024.0 * 1024.0); // Convertendo de bytes para megabytes
    }
}
