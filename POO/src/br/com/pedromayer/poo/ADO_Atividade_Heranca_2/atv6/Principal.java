/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package br.com.pedromayer.poo.ADO_Atividade_Heranca_2.atv6;

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
        
        Aluno aluno1 = new Aluno("TADS", "Juca", 23);
        
        Professor professor1 = new Professor("Banco de Dados", "Jerson", 45);
        
        professor1.aprensentar();
        aluno1.aprensentar();
        
    }
    
}
