/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package br.com.pedromayer.setembro.exemplo_enum;

/**
 *
 * @author alves.7924
 */
public enum Dia {
    
    
    DOMINGO(1),
    SEGUNDA(2),
    TERCA(3),
    QUARTA(4),
    QUINTA(5),
    SEXTA(6),
    SABADO(7);
    
    private int valor;
    
    Dia(int valor){
        this.valor = valor;
    }

    public int getValor() {
        return valor;
    }
    
    
}
