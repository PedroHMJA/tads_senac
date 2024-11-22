/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.pedromayer.setembro.exemplo_enum;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author alves.7924
 *
 *
 * adicionar jogadores - máximo 11 substituir jogadores listar jogadores
 */
public class Time {

    private List<Jogador> jogadores;

    public Time() {
        this.jogadores = new ArrayList<>();
    }

    public void adicionarJogador(Jogador jogador) {
        if (jogadores.size() < 11) {
            jogadores.add(jogador);
            System.out.println("Jogador " + jogador + " adicionado!");
        } else {
            System.out.println("O time ja tem 11 jogadores!");
        }
    }

    public void susbstituirJogador(int numero, Jogador reserva) {
        for (int i = 0; i < jogadores.size(); i++) {
            if (jogadores.get(i).getNumero() == numero) {
                jogadores.set(i, reserva);
                System.out.println("Jogador substituido!");
                break;
            }
        }
    }

    public void consultarJogadores() {
        for (Jogador jogador : jogadores) {
            System.out.println(jogador);
        }
    }

}
