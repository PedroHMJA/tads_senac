/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.pedromayer.agosto.poo.ex5;

/**
 *
 * @author alves.7924
 */
public class Livro {
    String titulo;
    String autor;
    int anoPublicacao;

    public Livro(String titulo, String autor, int anoPublicacao) {
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicacao = anoPublicacao;
    }
    
    public void relatorioLivros(){
        System.out.printf("Titulo: %s%nAutor: %s%nAno de publicacao: %d%n", titulo, autor, anoPublicacao);
    }

}
