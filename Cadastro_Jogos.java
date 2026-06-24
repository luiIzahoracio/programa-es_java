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
import java.awt.Color;
import javax.swing.ImageIcon;

public class Cadastro_Jogos extends JFrame {

    private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    private JTextField txtTime1;
    private JTextField txtTime2;
    private JTextField txtData;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    Cadastro_Jogos frame = new Cadastro_Jogos();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public Cadastro_Jogos() {
        setTitle("Cadastro de Jogos");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 450, 300);

        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        JLabel lblTitulo = new JLabel("CADASTRO DE JOGOS");
        lblTitulo.setForeground(Color.GREEN);
        lblTitulo.setFont(new Font("Arial", Font.BOLD, 20));
        lblTitulo.setBounds(68, 19, 260, 30);
        contentPane.add(lblTitulo);

        JLabel lblTime1 = new JLabel("Time 1:");
        lblTime1.setForeground(Color.WHITE);
        lblTime1.setBounds(30, 60, 80, 20);
        contentPane.add(lblTime1);

        txtTime1 = new JTextField();
        txtTime1.setBounds(100, 60, 150, 25);
        contentPane.add(txtTime1);

        JLabel lblTime2 = new JLabel("Time 2:");
        lblTime2.setForeground(Color.WHITE);
        lblTime2.setBounds(30, 95, 80, 20);
        contentPane.add(lblTime2);

        txtTime2 = new JTextField();
        txtTime2.setBounds(100, 95, 150, 25);
        contentPane.add(txtTime2);

        JLabel lblData = new JLabel("Data:");
        lblData.setForeground(Color.WHITE);
        lblData.setBounds(30, 130, 80, 20);
        contentPane.add(lblData);

        txtData = new JTextField();
        txtData.setBounds(100, 130, 150, 25);
        contentPane.add(txtData);

        // BOTÃO CADASTRAR
        JButton btnCadastrar = new JButton("Cadastrar");
        btnCadastrar.setBounds(150, 170, 120, 30);

        btnCadastrar.addActionListener(e -> {
            JOptionPane.showMessageDialog(
                null,
                "Jogo cadastrado com sucesso!\n\n" +
                txtTime1.getText() + " x " + txtTime2.getText() +
                "\nData: " + txtData.getText()
            );

            txtTime1.setText("");
            txtTime2.setText("");
            txtData.setText("");
        });

        contentPane.add(btnCadastrar);

        // BOTÃO VOLTAR
        JButton btnVoltar = new JButton("Voltar");
        btnVoltar.setBounds(30, 173, 100, 25);

        btnVoltar.addActionListener(e -> {
            titulo_tela tela = new titulo_tela();
            tela.setVisible(true);
            dispose(); // fecha a tela atual
        });

        contentPane.add(btnVoltar);
        
        JLabel lblNewLabel = new JLabel("New label");
        lblNewLabel.setIcon(new ImageIcon("C:\\Users\\Aluno\\Downloads\\thumb2-brazil-national-football-team-golden-logo-4k-blue-stone-background-conmebol-national-teams.jpg"));
        lblNewLabel.setBounds(0, 0, 436, 263);
        contentPane.add(lblNewLabel);
    }
}