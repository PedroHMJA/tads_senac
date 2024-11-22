/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.pedromayer.poo.aula_31_10.atv5;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author alves.7924
 */
public class Principal {
    public static void main(String[] args) {
        List<Arquivo> lista =  new ArrayList();
        
       Arquivo arq1 = new ArquivoAudio();
       Arquivo arq2 = new ArquivoImagem();
       Arquivo arq3 = new ArquivoTexto();
       
       lista.add(0, arq1);
       lista.add(1, arq2);
       lista.add(2, arq3);
       
       for(int i = 0;i < lista.size(); i++){
           lista.get(i).abrir();
           lista.get(i).fechar();
           lista.get(i).ler();
       }
           
    }
}