/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.pedromayer.agosto.poo.ex4;

/**
 *
 * @author alves.7924
 */
public class Retangulo {
    
    int largura;
    int altura;

    public Retangulo(int largura, int altura) {
        this.largura = largura;
        this.altura = altura;
    }
    
    public int calculaArea(){
        return largura*altura;
    }
    
    public int calculaPerimetro(){
        return 2*(largura+altura);
    }
    
    public void dadosDoRetangulo(){
        System.out.printf("DADOS DO RETANGULO:%nArea: %d%nPerimetro : %d%n", calculaArea(), calculaPerimetro());
    }
}
