/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.pedromayer.poo.ADO_Atividade_Heranca_2.atv1;

/**
 *
 * @author alves.7924
 */
public class Principal {
    public static void main(String[] args) {
        Quadrado q1 = new Quadrado(5.00, 5.00, "Azul");
        Retangulo r1 = new Retangulo(10, 25, "Vermelho");
        Triangulo t1 = new Triangulo(5, 9, "Amarelo");
        Circulo c1 = new Circulo(6.94, "Verde");
        
        System.out.println(q1.toString());
        System.out.println(r1.toString());
        System.out.println(t1.toString());
        System.out.println(c1.toString());
        
    }
}
