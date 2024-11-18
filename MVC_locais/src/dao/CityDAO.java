/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import modelo.City;
import java.sql.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author Pedro
 */
public class CityDAO {

    public void salvarCity(City city) throws SQLException {
        String sql = "INSERT INTO city(nome) VALUES(?)";

        try (Connection conexao = DBConnection.getConnection(); PreparedStatement stmt = conexao.prepareStatement(sql)) {
            stmt.setString(1, city.getNome());

            stmt.executeUpdate();
            stmt.close();
            conexao.close();

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public List<City> listarCities() {
        String sql = "SELECT * FROM city";
        try (Connection conexao = DBConnection.getConnection(); PreparedStatement pstmt = conexao.prepareStatement(sql); ResultSet rs = pstmt.executeQuery()) {

            List<City> cities = new ArrayList<>();

            while (rs.next()) {
                City city = new City();
                city.setId(rs.getInt("idcity"));
                city.setNome(rs.getString("nome"));
                cities.add(city);
            }

            pstmt.close();
            conexao.close();
            return cities;

        } catch (SQLException e) {
            System.out.println(e.getMessage());
            return Collections.emptyList();//só para o retorno ficar mais bonito
        }
    }

    public void deletarCity() {
        String sql
                = "DELETE FROM city WHERE idcity = (SELECT MAX(idcity) FROM city)";
        try (Connection connection = DBConnection.getConnection(); PreparedStatement pstmt = connection.prepareStatement(sql)) {

            // Executa o comando SQL 
            pstmt.executeUpdate();
            pstmt.close();
            connection.close();

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}
