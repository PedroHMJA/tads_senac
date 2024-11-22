package main;

import view.CityView;
import control.CityController;


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
/**
 *
 * @author Pedro
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        CityView view = new CityView();
        CityController control = new CityController(view);
        view.setVisible(true);
        control.listarCities();
        /*StateView view = new StateView();
        StateController control = new StateController(view);
        view.setVisible(true);
        control.listarStates();*/
    }

}
