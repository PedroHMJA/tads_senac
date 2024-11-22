/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.pedromayer.agosto.poo.ex5;

/**
 *
 * @author alves.7924
 */
public class Principal {
    public static void main(String[] args) {
        
        Livro livro1 = new Livro("Livro 1", "Fulano 1", 2021);
        Livro livro2 = new Livro("Livro 2", "Fulano 2", 2022);
        Livro livro3 = new Livro("Livro 3", "Fulano 3", 2023);
        
        livro1.relatorioLivros();
        System.out.println("");
        livro2.relatorioLivros();
        System.out.println("");
        livro3.relatorioLivros();
    }
}
