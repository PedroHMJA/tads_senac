/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exerciciosPOO.julho.atv1;

import java.util.ArrayList;

import java.util.List;

/**
 *
 * @author alves.7924
 */
public class Principal {
    public static void main(String[] args) {
        Marca marca1 = new Marca("Toyota");
        Modelo modelo1 = new Modelo("Corola", marca1);
        List<String> opcionais = new ArrayList<>();
        opcionais.add("Ar condicionado");
        opcionais.add("Direcao Eletrica");
        Carro carro1 = new Carro(modelo1,"Azul", "Sedan", 4, "1.6", opcionais);
        carro1.imprimirRelatorio();
                
    }
}
