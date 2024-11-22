/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.pedromayer.agosto.poo.q1;

/**
 *
 * @author alves.7924
 * Escreva uma classe em Java chamada de Imovel com 4 atributos: uma string
contendo o nome do proprietário, uma string contendo o endereço do imóvel,
um número real representando o valor da compra e um inteiro representando o
ano de construção do imóvel.
Declare e implemente um construtor que receba como parâmetros: o nome do
proprietário, o endereço, o valor da compra e o ano de construção, e inicialize os
respectivos atributos.
Declare também um método chamado calcularValorVenda que recebe como
parâmetros um inteiro que representa o ano de venda, e um número real que
representa a taxa de correção monetária, e retorna um valor real.
Implementar o método calcularValorVenda. O cálculo depende do ano de
construção e do valor de compra original. Suponha que pra cada ano de construção
do imóvel seja aplicado um acréscimo de 2% sobre o valor do imóvel.
 */
public class Imovel {
    String nomeProprietario;
    String endereco;
    double valorCompra;
    int anoConstrucao;

    public Imovel(String nomeProprietario, String endereco, double valorCompra, int anoConstrucao) {
        this.nomeProprietario = nomeProprietario;
        this.endereco = endereco;
        this.valorCompra = valorCompra;
        this.anoConstrucao = anoConstrucao;
    }
    
    double calcularValorVenda(int anoVenda, double taxaCorrecaoMonetaria){
        
        int tempo = anoVenda - anoConstrucao;
        
        for(int i=0;i<tempo;i++){
            valorCompra = valorCompra  + (valorCompra * (taxaCorrecaoMonetaria/100));
        }
    return valorCompra;
    }
    
}
