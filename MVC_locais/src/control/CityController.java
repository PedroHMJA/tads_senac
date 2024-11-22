/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package control;

import modelo.City;
import dao.CityDAO;
import view.CityView;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author Pedro
 */
public class CityController {

    private CityView view;
    private CityDAO dao;

    public CityController(CityView view) {
        this.view = view;
        this.dao = new CityDAO();
        this.view.addSalvarListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    salvarCity();
                } catch (SQLException ex) {
                    System.out.println(ex.getMessage());
                }
                listarCities(); //atualizado em 28/10
            }
        });
        this.view.addListarListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                listarCities();
            }

        });
        this.view.addDeletarListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                deletarCity();
                listarCities();
            }
        });
        this.view.addAtualizarListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    atualizarCity();
                    listarCities();
                } catch (SQLException ex) {
                    System.out.println(ex.getMessage());
                }
            }
        });
    }

    public void salvarCity() throws SQLException {
        City city = new City(view.getNome());
        dao.salvarCity(city); //atualizado em 28/10
        view.exibirMensagem("Cidade " + city.getNome() + " salvo com sucesso!");
    }

    public void listarCities() {
        List<City> cities = dao.listarCities();
        view.atualizarTabela(cities);
    }

    public void deletarCity() {
        dao.deletarCity();
    }

    public void atualizarCity() throws SQLException {
        City city = new City(view.getNome());
        city.setId(view.getId());
        dao.atualizarCity(city);
        view.exibirMensagem("Cidade atualizada com sucesso!");

    }

}
