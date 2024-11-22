/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.pedromayer.poo.ADO_Atividade_Interface_e_Generics._4;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Pedro
 * @param <T>
 */
public class SimpleList<T> {

    List<T> lista = new ArrayList<>();

    public void adiciona(T obj) {
        lista.add(obj);
    }

    public T achaPeloIndice(int n) {
        return lista.get(n);
    }

    public int tamanho() {
        return lista.size();
    }
     public void exibirElementos(){
         for(int i =0;i<tamanho();i++){
             System.out.println(lista.get(i));
         }
     }
}
