/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package br.com.pedromayer.poo.atv_06_11;

/**
 *
 * @author alves.7924
 */
public interface IPagamento {
    boolean autorizarPagamento();
    boolean capturarPagamento();
    boolean estornarPagamento();
    String getStatus();
    void setStatus(String situacao);
}
