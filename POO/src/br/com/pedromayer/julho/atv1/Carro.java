/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exerciciosPOO.julho.atv1;

import java.util.List;

/**
 *
 * @author alves.7924
 */
public class Carro {
    private  Modelo modelo;
    private String cor;
    private String tipo;
    private int numeroDePortas;
    private String motor;
    private List<String> opcionais;

    public Carro(Modelo modelo, String cor, String tipo, int numeroDePortas, String motor, List<String> opcionais) {
        this.modelo = modelo;
        this.cor = cor;
        this.tipo = tipo;
        this.numeroDePortas = numeroDePortas;
        this.motor = motor;
        this.opcionais = opcionais;
    }

    void imprimirRelatorio() {
        System.out.println("Modelo: "+ modelo.getNome());
        System.out.println("Marca: "+ modelo.getMarca().getNome());
        System.out.println("Cor: "+ cor);
        System.out.println("Tipo: "+ tipo);
        System.out.println("Numero de portas: "+ numeroDePortas);
        System.out.println("Motor: "+ motor);
        System.out.println("Opcionais: ");
        for (String op : opcionais) {
            System.out.println(op);
        }
        
        
    }
    
    
}
