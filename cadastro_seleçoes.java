package projetof;

import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JComboBox;
import javax.swing.ImageIcon;
import java.awt.Color;

public class cadastro_seleçoes extends JFrame {

    private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    private JTextField txtSelecao;
    private JTextField txtTecnico;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    cadastro_seleçoes frame = new cadastro_seleçoes();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public cadastro_seleçoes() {
        setTitle("Cadastro de Seleções");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 450, 300);

        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        // TÍTULO
        JLabel lblTitulo = new JLabel("CADASTRO DE SELEÇÕES");
        lblTitulo.setFont(new Font("Arial", Font.BOLD, 18));
        lblTitulo.setBounds(100, 10, 300, 30);
        contentPane.add(lblTitulo);

        // SELEÇÃO
        JLabel lblSelecao = new JLabel("Seleção:");
        lblSelecao.setForeground(Color.BLACK);
        lblSelecao.setBounds(30, 60, 80, 20);
        contentPane.add(lblSelecao);

        txtSelecao = new JTextField();
        txtSelecao.setBounds(120, 60, 150, 25);
        contentPane.add(txtSelecao);

        // CONTINENTE
        JLabel lblContinente = new JLabel("Continente:");
        lblContinente.setForeground(Color.BLACK);
        lblContinente.setBounds(30, 95, 80, 20);
        contentPane.add(lblContinente);

        JComboBox<String> comboContinente = new JComboBox<>();
        comboContinente.addItem("América do Sul");
        comboContinente.addItem("América do Norte");
        comboContinente.addItem("Europa");
        comboContinente.addItem("África");
        comboContinente.addItem("Ásia");
        comboContinente.addItem("Oceania");
        comboContinente.setBounds(120, 95, 150, 25);
        contentPane.add(comboContinente);

        // TÉCNICO
        JLabel lblTecnico = new JLabel("Técnico:");
        lblTecnico.setForeground(Color.BLACK);
        lblTecnico.setBounds(30, 130, 80, 20);
        contentPane.add(lblTecnico);

        txtTecnico = new JTextField();
        txtTecnico.setBounds(120, 130, 150, 25);
        contentPane.add(txtTecnico);

        // BOTÃO CADASTRAR
        JButton btnCadastrar = new JButton("Cadastrar");
        btnCadastrar.setBounds(150, 170, 120, 30);

        btnCadastrar.addActionListener(e -> {
            String selecao = txtSelecao.getText();
            String tecnico = txtTecnico.getText();
            String continente = comboContinente.getSelectedItem().toString();

            JOptionPane.showMessageDialog(
                null,
                "Seleção cadastrada com sucesso!\n\n" +
                "Seleção: " + selecao +
                "\nTécnico: " + tecnico +
                "\nContinente: " + continente
            );

            txtSelecao.setText("");
            txtTecnico.setText("");
            comboContinente.setSelectedIndex(0);
        });

        contentPane.add(btnCadastrar);

        // =========================
        // BOTÃO VOLTAR
        // =========================
        JButton btnVoltar = new JButton("Voltar");
        btnVoltar.setBounds(40, 173, 100, 25);

        btnVoltar.addActionListener(e -> {
            titulo_tela tela = new titulo_tela();
            tela.setVisible(true);
            dispose();
        });

        contentPane.add(btnVoltar);
        
        JLabel lblNewLabel = new JLabel("New label");
        lblNewLabel.setIcon(new ImageIcon("C:\\Users\\Aluno\\Downloads\\selecao-brasil-wallpaper-pc5-1024x576-1.jpg"));
        lblNewLabel.setBounds(0, 10, 436, 268);
        contentPane.add(lblNewLabel);
    }
}