/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package br.com.pedromayer.setembro.ex2;

/**
 *
 * @author alves.7924
 */
public enum Prioridade {
    BAIXA(1),
    MEDIA(2),
    ALTA(3),
    URGENTE(4);
    
    private int valor;

    private Prioridade(int valor) {
        this.valor = valor;
    }

    public int getValor() {
        return valor;
    }

    
    
    
}


