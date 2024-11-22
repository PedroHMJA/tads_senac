/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.pedromayer.agosto.q2;

import java.util.List;

/**
 *
 * @author alves.7924
 */
public class Biblioteca {

    private List<Livro> livros;
    private List<Usuario> usuarios;

    public void adiciona(Livro livro) {
        livros.add(livro);
    }

    public void cadastraUsuario(Usuario usuario) {
        usuarios.add(usuario);
    }

    public boolean emprestarLivro(String titulo, int numId) {
        for (Livro livro : livros) {
            if (livro.getTitulo().equalsIgnoreCase(titulo)) {
                if (livro.isDisponibilidade()) {
                    livro.setDisponibilidade(false);
                    System.out.println("Livro " + livro + " emprestado ao usuario " + numId);
                    return true;
                } else {
                    System.out.println("Livro " + livro + " nao disponivel");
                    return false;
                }
            }
        }

        System.out.println("Livro " + titulo + " nao encontrado");
        return false;
    }

    public boolean devolverLivro(String titulo, int numId, boolean atrasado) {
        for (Livro livro : livros) {
            if (livro.getTitulo().equalsIgnoreCase(titulo) && !livro.isDisponibilidade()) {
                livro.setDisponibilidade(true);
                if (atrasado) {
                    System.out.println("Livro " + titulo + " devolvido com atraso. Multa aplicada.");
                } else {
                    System.out.println("Livro " + titulo + " devolvido no prazo.");
                }
                return true;
            }
        }
        System.out.println("Livro "+titulo+" nao encontrado ou ja foi devolvido");
        return false;
    }
    public void consultaLivrosDisponiveis(){
        System.out.println("Livros Disponiveis");
        for(Livro livro : livros){
            if(livro.isDisponibilidade()){
                System.out.println(livro);
            }
        }
    }
}
