/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import modelo.State;
import java.sql.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author Pedro
 */
public class StateDAO {

    public void salvarState(State state) {
        String sql = "INSERT INTO state(nome) VALUES(?)";

        try (Connection conexao = DBConnection.getConnection(); PreparedStatement stmt = conexao.prepareStatement(sql)) {

            stmt.setString(1, state.getNome());

            stmt.executeUpdate();

            stmt.close();

            conexao.close();

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public void deletarState() {
        String sql = "DELETE FROM state WHERE idstate=(SELECT MAX(idstate) from state)";
        try (Connection conexao = DBConnection.getConnection(); PreparedStatement stmt = conexao.prepareStatement(sql)) {

            stmt.executeUpdate();

            stmt.close();

            conexao.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public List<State> listarState() {

        String sql = "SELECT * FROM state";

        try (Connection conexao = DBConnection.getConnection(); PreparedStatement stmt = conexao.prepareStatement(sql); ResultSet rs = stmt.executeQuery()) {

            List<State> states = new ArrayList();

            while (rs.next()) {
                State state = new State();
                state.setId(rs.getInt("idstate"));
                state.setNome(rs.getString("nome"));
                states.add(state);
            }

            stmt.close();
            conexao.close();
            return states;

        } catch (SQLException e) {
            System.out.println(e.getMessage());
            return Collections.emptyList();
        }
    }

    public void atualizaState(State state) {
        String sql = "UPDATE state SET nome=? WHERE idstate=?";
        try (Connection conexao = DBConnection.getConnection(); PreparedStatement pstmt = conexao.prepareStatement(sql)) {
            pstmt.setString(1, state.getNome());
            pstmt.setInt(2, state.getId());

            pstmt.executeUpdate();
            pstmt.close();
            conexao.close();

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}
