/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.pedromayer.poo.aula_31_10.atv5;

/**
 *
 * @author alves.7924
 */
public class ArquivoAudio implements Arquivo {

    public ArquivoAudio() {
    }
    

    @Override
    public void abrir() {
        System.out.println("Abrindo o arquivo de audio.");
    }

    @Override
    public void fechar() {
        System.out.println("Fechando o arquivo de audio.");
    }

    @Override
    public void ler() {
        System.out.println("Lendo o arquivo de audio. ou ouvindo...");
    }
    
}
