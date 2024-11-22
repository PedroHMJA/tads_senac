/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.pedromayer.agosto.q3;



/**
 *
 * @author alves.7924
 */
public class Aplicacao {
    public static void main(String[] args) {
        
        
        Produto banana = new Produto("Banana", 5.00, 10);
        
        
        Cliente cliente1 = new Cliente("Pedro", "pedro@gmail.com", 12345);
        
        Carrinho carrinho1 = new Carrinho();
        
        carrinho1.adicionarProduto(banana, 5);
        
        Venda venda1 = new Venda(cliente1, carrinho1);
        
  
        
        String nome = venda1.getNomeCliente();
        
        
        System.out.println(nome);
        
        
        
        

    }
}
