/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package br.com.pedromayer.poo.atv_06_11;

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
        //IPagamento pagamento = new CartaoCredito(100, 789, 456);
        //IPagamento pagamento = new PayPal(100.00);

        IPagamento pagamento = new BoletoBancario(0);
        
        System.out.println(pagamento.autorizarPagamento());
        System.out.println(pagamento.getStatus());

        System.out.println(pagamento.capturarPagamento());
        System.out.println(pagamento.getStatus());

        System.out.println(pagamento.estornarPagamento());
        System.out.println(pagamento.getStatus());

    }

}
