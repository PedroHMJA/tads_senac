/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exerciciosPOO.julho.atv2;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author alves.7924
 */
public class Padaria {
    
    private List<Bolo> bolos;
    private List<Pao> paes;

    public Padaria() {
        this.bolos = new ArrayList<>();
        this.paes = new ArrayList<>();
    }
    
    

    public List<Bolo> getBolos() {
        return bolos;
    }

    public List<Pao> getPaes() {
        return paes;
    }
    
    public void addBolo(Bolo bolo){
        bolos.add(bolo);
    }
    public void addPao(Pao pao){
        paes.add(pao);
    }
    public void relatorioBolos(){
        System.out.println("Bolos disponiveis: ");
        for(int i =0; i < bolos.size();i++){
            System.out.println(bolos.get(i).getSabor());
            System.out.println(bolos.get(i).getPreco());
            System.out.println(bolos.get(i).getTamanho());
        }
    }
    public void relatorioPaes(){
        System.out.println("Paes disponiveis: ");
        for(int i =0; i < paes.size();i++){
            System.out.println(paes.get(i).getPeso());
            System.out.println(paes.get(i).getTipo());
            System.out.println(paes.get(i).getPreco());
        }
    }
    
    
}
