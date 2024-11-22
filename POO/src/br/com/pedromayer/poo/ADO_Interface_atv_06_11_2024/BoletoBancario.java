/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.pedromayer.poo.ADO_Interface_atv_06_11_2024;

/**
 *
 * @author alves.7924
 */
public class BoletoBancario implements IPagamento {

    private double valor;
    private String status;

    public BoletoBancario(double valor) {
        this.valor = valor;
    }

    @Override
    public boolean autorizarPagamento() {
        if (this.valor > 0) {
            setStatus("Gerado");
            return true;
        }
        setStatus("Falha na Autorizacao");
        return false;
    }

    @Override
    public boolean capturarPagamento() {
        if (autorizarPagamento()) {
            setStatus("Pago");
            return true;
        }
        setStatus("Falha na Captura");
        return false;
    }

    @Override
    public boolean estornarPagamento() {
        if (capturarPagamento()) {
            setStatus("Estornado");
            return true;
        }
        setStatus("Falha no Estorno");
        return false;
    }

    @Override
    public String getStatus() {
        return this.status;
    }

    @Override
    public void setStatus(String situacao) {
        this.status = situacao;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

}
