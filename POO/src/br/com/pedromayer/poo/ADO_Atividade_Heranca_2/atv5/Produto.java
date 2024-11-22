/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.pedromayer.poo.ADO_Atividade_Heranca_2.atv5;

/**
 *
 * @author alves.7924
 */
/*public class Produto {
    private String identificacao;
    private double custoDeFabricacao;

    public Produto(String identificacao, double custoDeFabricacao) {
        this.identificacao = identificacao;
        this.custoDeFabricacao = custoDeFabricacao;
    }


}
*/
public class Produto {
    private String identificacao;
    private double custoDeFabricacao;

    public Produto(String identificacao, double custoDeFabricacao) {
        this.identificacao = identificacao;
        this.custoDeFabricacao = custoDeFabricacao;
    }

    public String getIdentificacao() {
        return identificacao;
    }

    public double getCustoDeFabricacao() {
        return custoDeFabricacao;
    }
}
