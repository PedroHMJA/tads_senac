/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.pedromayer.agosto.q3;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author alves.7924
 */
public class Carrinho {
    List<Produto> produtos;
    private double valorTotal;

    public Carrinho(List<Produto> produtos, double valorTotal) {
        this.produtos = new ArrayList<>();
        this.valorTotal = valorTotal;
    }

    public Carrinho() {
    }
    
    
    public void adicionarProduto(Produto produto, int quantidadeProduto){
        valorTotal += produto.getPreco() * quantidadeProduto;
        produtos.add(produto);
        
    }
        
    public double getValorTotal() {
        return valorTotal;
    }
    
        
}
