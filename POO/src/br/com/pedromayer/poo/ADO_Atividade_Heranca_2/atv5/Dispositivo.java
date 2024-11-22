/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.pedromayer.poo.ADO_Atividade_Heranca_2.atv5;

/**
 *
 * @author alves.7924
 */
/*public abstract class Dispositivo {
    private String nome;
    private long capacidadeEmBytes;

    public Dispositivo(String nome, long capacidadeEmBytes) {
        this.nome = nome;
        this.capacidadeEmBytes = capacidadeEmBytes;
    }
    
    @Override
    abstract public String toString();
    abstract public double capacidadeEmMegabytes ();
}
*/public abstract class Dispositivo {
    protected String nome;
    protected long capacidadeEmBytes;

    public Dispositivo(String nome, long capacidadeEmBytes) {
        this.nome = nome;
        this.capacidadeEmBytes = capacidadeEmBytes;
    }

    @Override
    abstract public String toString();

    abstract public double capacidadeEmMegabytes();
}
