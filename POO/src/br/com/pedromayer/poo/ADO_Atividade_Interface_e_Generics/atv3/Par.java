/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.pedromayer.poo.ADO_Atividade_Interface_e_Generics.atv3;

/**
 *
 * @author alves.7924
 * @param <T>
 * @param <U>
 */
public class Par<T, U> {

    private T objUm;
    private U objDois;

    public Par() {
    }

    public Par(T objUm, U objDois) {
        this.objUm = objUm;
        this.objDois = objDois;
    }

    public T getObjUm() {
        return objUm;
    }

    public void setObjUm(T objUm) {
        this.objUm = objUm;
    }

    public U getObjDois() {
        return objDois;
    }

    public void setObjDois(U objDois) {
        this.objDois = objDois;
    }

    public void imprimirPar() {
        System.out.println("Primeiro: " + this.getObjUm() + ", Segundo: " + this.getObjDois());
    }

}
