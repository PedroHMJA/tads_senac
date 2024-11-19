
package control;

import modelo.State;
import dao.StateDAO;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.List;
import view.StateView;

/**
 *
 * @author Pedro
 */
public class StateController {

    private StateView view;
    private StateDAO dao;

    public StateController(StateView view) {
        this.view = view;
        this.dao = new StateDAO();
        this.view.addSalvarListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    salvarState();
                } catch (SQLException ex) {
                    System.out.println(ex.getMessage());
                }
                listarStates(); //atualizado em 28/10
            }
        });
        this.view.addListarListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                listarStates();
            }

        });
        this.view.addDeletarListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                deletarState();
                listarStates();
            }
        });
    }

    public void salvarState() throws SQLException {
        State state = new State(view.getNome());
        dao.salvarState(state); //atualizado em 28/10
        view.exibirMensagem("Estado " + state.getNome() + " salvo com sucesso!");
    }

    public void listarStates() {
        List<State> states = dao.listarState();
        view.atualizarTabela(states);
    }

    public void deletarState() {
        dao.deletarState();
    }

}


