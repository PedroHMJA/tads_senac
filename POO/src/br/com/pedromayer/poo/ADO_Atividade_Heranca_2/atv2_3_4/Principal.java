/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package br.com.pedromayer.poo.ADO_Atividade_Heranca_2.atv2_3_4;

/**
 *
 * @author alves.7924
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Onibus onibus = new Onibus(3, "AZS-000", 2000);
        
        onibus.exibirDados();
        
        Caminhao caminhao = new Caminhao(4, "YXQ-2005", 2006);
        
        caminhao.exibirDados();
    }
    
}
