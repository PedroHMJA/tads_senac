/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.pedromayer.setembro.ex2;

/**
 *
 * @author alves.7924
 */
public class Principal {
    public static void main(String[] args) {
        Tarefa tarefa1 = new Tarefa("Estudar", Prioridade.URGENTE);
        Tarefa tarefa2 = new Tarefa("Trabalhar", Prioridade.BAIXA);
        
        tarefa1.comparaTarefa(tarefa2);
        System.out.println(tarefa1.getPrioridade());
  
        System.out.println(tarefa2.getPrioridade());
        
        
        
    }
}
