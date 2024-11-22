/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.pedromayer.setembro.exemplo_enum;

/**
 *
 * @author alves.7924
 */
public class Jogador {
    
    private String nome;
    private int numero;
    private PosicaoTatica posicaoTatica;

    public Jogador(String nome, int numero, PosicaoTatica posicaoTatica) {
        this.nome = nome;
        this.numero = numero;
        this.posicaoTatica = posicaoTatica;
    }

    public Jogador() {
    }

    public String getNome() {
        return nome;
    }

    public int getNumero() {
        return numero;
    }

    public PosicaoTatica getPosicaoTatica() {
        return posicaoTatica;
    }



    @Override
    public String toString() {
        return "Jogador{" + "nome=" + nome + ", numero=" + numero + ", posicaoTatica=" + posicaoTatica + '}';
    }
    
    
    
}
