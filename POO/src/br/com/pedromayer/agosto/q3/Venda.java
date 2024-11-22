/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.pedromayer.agosto.q3;

/**
 *
 * @author pedro
 */
public class Venda {

    private Cliente cliente;
    private Carrinho carrinho;

    public Venda(Cliente cliente, Carrinho carrinho) {
        this.cliente = cliente;
        this.carrinho = carrinho;
    }


    public String getNomeCliente() {
        return cliente.getNome();
    }

    public double getValorVenda() {
        return carrinho.getValorTotal();
    }
}
