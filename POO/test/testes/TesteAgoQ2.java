/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package testes;

import br.com.pedromayer.agosto.q2.Biblioteca;
import br.com.pedromayer.agosto.q2.Livro;
import br.com.pedromayer.agosto.q2.Usuario;

/**
 *
 * @author alves.7924
 */
public class TesteAgoQ2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //instanciando objetos biblioteca e livro
        Biblioteca minhaBiblioteca = new Biblioteca();
        minhaBiblioteca.adiciona(new Livro("Livro 1", "Autor 1", 1999));
        minhaBiblioteca.adiciona(new Livro("Livro 2", "Autor 2", 2000));
        minhaBiblioteca.adiciona(new Livro("Livro 3", "Autor 3", 2001));
        
        //instanciando objetos usuarios
        minhaBiblioteca.cadastraUsuario(new Usuario("User 1", 20, 1));
        minhaBiblioteca.cadastraUsuario(new Usuario("User 2", 21, 2));
        minhaBiblioteca.cadastraUsuario(new Usuario("User 3", 22, 3));
        //consultando livros disponiveis
        minhaBiblioteca.consultaLivrosDisponiveis();
        //emprestando livros
        minhaBiblioteca.emprestarLivro("Livro 1", 1);
        minhaBiblioteca.emprestarLivro("Livro 2", 2);
        minhaBiblioteca.emprestarLivro("Livro 3", 3);
        
        //devolvendo livros
        minhaBiblioteca.devolverLivro("Livro 1", 1, true);
        minhaBiblioteca.devolverLivro("Livro 2", 2, false);
        //consultando livros
        minhaBiblioteca.consultaLivrosDisponiveis();
    }
    
}
