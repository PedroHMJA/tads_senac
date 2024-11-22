/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package br.com.pedromayer.poo.Exercicio_Polimorfismo;

/**
 *
 * @author alves.7924
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Funcionario gerente = new Gerente(500.00, "Gerente", 7000.00);
        Funcionario desenvolvedor = new Desenvolvedor(500, "Desenvolvedor", 4500.00);
        Funcionario analista = new Analista("Analista", 2500.00);
        
        System.out.println(gerente.getNome() + " salario: " + gerente.calcularSalarioTotal());
        System.out.println(desenvolvedor.getNome() + " salario: " + desenvolvedor.calcularSalarioTotal());
        System.out.println(analista.getNome() + " salario: " + analista.calcularSalarioTotal());
    }
    
}
