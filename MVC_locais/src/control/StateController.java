
package control;

import modelo.City;
import dao.CityDAO;
import view.CityView;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Pedro
 */
public class StateController {

    private CityView view;
    private CityDAO dao;

    public StateController(CityView view) {
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

}


