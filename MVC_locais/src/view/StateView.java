
package view;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import java.util.List;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import modelo.State;

/**
 *
 * @author alves.7924
 */

public class StateView extends JFrame {

    private JTextField nomeField = new JTextField(20);
    private JButton salvarButton = new JButton("Salvar");
    private JButton listarButton = new JButton("Listar");//atualizado em 28/10
    private JButton deletarButton = new JButton("Deletar");
    
    
    private JTable stateTable;
    private DefaultTableModel tableModel;

    public StateView() {
        setTitle("Cadastro de Estados");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(600, 400);
        
        
        //inicializa o tableModel com um vetor de String que 
        //contém os títulos das colunas da JTable
        tableModel = new DefaultTableModel(new String[]{"Id","Nome"},0);
        stateTable = new JTable(tableModel);
        
        
        JPanel inputPanel = new JPanel(new GridLayout(4, 2));
        inputPanel.add(new JLabel("Nome"));
        inputPanel.add(nomeField);
        
        
        JPanel buttonPanel = new JPanel();
        buttonPanel.add(salvarButton);
        buttonPanel.add(listarButton);
        buttonPanel.add(deletarButton);
        
        add(inputPanel, BorderLayout.NORTH);
        add(new JScrollPane(stateTable),BorderLayout.CENTER);
        add(buttonPanel,BorderLayout.SOUTH);
    }

    public void atualizarTabela(List<State> states){
        tableModel.setRowCount(0);
        for( State state : states){
            tableModel.addRow(new Object[]{
                state.getId(),
                state.getNome()});
        }
    }
    
    public String getNome() {
        return nomeField.getText();
    }

    public void addSalvarListener(ActionListener listener) {
        salvarButton.addActionListener(listener);
    }
    public void addListarListener(ActionListener listener){
        listarButton.addActionListener(listener);
    }
    public void addDeletarListener(ActionListener listener){
        deletarButton.addActionListener(listener);
    }

    public void exibirMensagem(String mensagem) {
        JOptionPane.showMessageDialog(this, mensagem);
    }

}


