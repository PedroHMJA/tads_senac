/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exerciciosPOO.julho.atv2;

/**
 *
 * @author alves.7924
 */
public class Principal {
    
    public static void main(String[] args) {
        
        Padaria minhaPadaria = new Padaria();
    
        Bolo bolo1 = new Bolo("Chocolate", "Grande", 79.99);
    
        Pao pao1 = new Pao("Frances", 0.5, 5.99);
    
        minhaPadaria.addBolo(bolo1);
        minhaPadaria.addPao(pao1);

        minhaPadaria.relatorioBolos();
        minhaPadaria.relatorioPaes();
        
    }
    
}
