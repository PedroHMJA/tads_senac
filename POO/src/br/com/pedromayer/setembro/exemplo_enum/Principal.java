/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.pedromayer.setembro.exemplo_enum;

/**
 *
 * @author alves.7924
 */
public class Principal {
    public static void main(String[] args) {
        Dia hoje  = Dia.QUARTA;
        System.out.println(hoje);
        
        Time barcelona = new Time();
        
        Jogador jogador1 = new Jogador("cr7", 1, PosicaoTatica.GOLEIRO); 
        Jogador jogador2 = new Jogador("messi", 2,PosicaoTatica.LATERAL);
        Jogador jogador3 = new Jogador("neymar", 3, PosicaoTatica.LATERAL);
        Jogador jogador4 = new Jogador("amaral", 4, PosicaoTatica.MEIA);
        Jogador jogador5 = new Jogador("folden", 5, PosicaoTatica.ZAGUEIRO);
        Jogador jogador6 = new Jogador("bento", 6, PosicaoTatica.ZAGUEIRO);
        Jogador jogador7 = new Jogador("rivaldo", 7, PosicaoTatica.ZAGUEIRO);
        Jogador jogador8 = new Jogador("ronaldinho", 8, PosicaoTatica.ZAGUEIRO);
        Jogador jogador9 = new Jogador("pele", 9, PosicaoTatica.ATACANTE);
        Jogador jogador10 = new Jogador("dimaria", 10, PosicaoTatica.ATACANTE);
        Jogador jogador11 = new Jogador("roni", 11, PosicaoTatica.ATACANTE);
        
        barcelona.adicionarJogador(jogador1);
        barcelona.adicionarJogador(jogador2);
        barcelona.adicionarJogador(jogador3);
        barcelona.adicionarJogador(jogador4);
        barcelona.adicionarJogador(jogador5);
        barcelona.adicionarJogador(jogador6);
        barcelona.adicionarJogador(jogador7);
        barcelona.adicionarJogador(jogador8);
        barcelona.adicionarJogador(jogador9);
        barcelona.adicionarJogador(jogador10);
        barcelona.adicionarJogador(jogador11);
        
        System.out.println("Jogadores do time: ");
        barcelona.consultarJogadores();
        
        Jogador reserva1 = new Jogador("zezinho", 18, PosicaoTatica.ATACANTE);
        barcelona.susbstituirJogador(9, reserva1);
        
        System.out.println("Jogaodres do time depois da substituicao");
        barcelona.consultarJogadores();
        
    }
}
