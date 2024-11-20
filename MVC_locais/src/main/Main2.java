/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package main;

import control.StateController;
import view.StateView;
/**
 *
 * @author Pedro
 */
public class Main2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        StateView view = new StateView();
        StateController control = new StateController(view);
        view.setVisible(true);
        control.listarStates();
    }
    
}
