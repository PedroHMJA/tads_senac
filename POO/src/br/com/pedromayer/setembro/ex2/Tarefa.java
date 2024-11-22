/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.pedromayer.setembro.ex2;

/**
 *
 * @author alves.7924
 */
public class Tarefa {
    private String descricao;

    private Prioridade prioridade;

    public Tarefa(String descricao, Prioridade prioridade) {
        this.descricao = descricao;
        this.prioridade = prioridade;
    }
    
    
    
    
    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Prioridade getPrioridade() {
        return prioridade;
    }

    public void setPrioridade(Prioridade prioridade) {
        this.prioridade = prioridade;
    }
    
    public void comparaTarefa(Tarefa tarefa){
        if(this.prioridade.getValor() > tarefa.prioridade.getValor()){
            System.out.println("A tarefa com a maior prioridade e a: "+this.descricao);
        }
        else if(this.prioridade.getValor() == tarefa.prioridade.getValor()){
            System.out.println("Ambas as tarefas tem as mesmas prioridades");
        }
        else{
            System.out.println("A tarefa com a maior prioridade e a: "+tarefa.descricao);
        }
    }
    
    
}
