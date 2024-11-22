/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.pedromayer.poo.atv_06_11;

/**
 *
 * @author alves.7924
 */
public class CartaoCredito implements IPagamento {
    
    private float valor;
    private int numeroDoCartao;
    private int codigoCvv;
    private String status;

    public CartaoCredito(int valor, int numeroDoCartao, int codigoCvv) {
        this.valor = valor;
        this.numeroDoCartao = numeroDoCartao;
        this.codigoCvv = codigoCvv;
    }

    @Override
    public boolean autorizarPagamento() {
        if ((numeroDoCartao != 0) && (codigoCvv != 0)) {
            setStatus("Autorizado");
            return true;
        }
        setStatus("Falha na autorizacao");
        return false;
    }

    @Override
    public boolean capturarPagamento() {
        if(autorizarPagamento()){
            setStatus("Capturado");
            return true;
        }
        setStatus("Falha na Captura");
        return false;
    }

    @Override
    public boolean estornarPagamento() {
        if((autorizarPagamento()) && (capturarPagamento())){
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

}
