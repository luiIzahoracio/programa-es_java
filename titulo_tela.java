package projetof;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.SwingConstants;

public class titulo_tela extends JFrame {

    private static final long serialVersionUID = 1L;
    private JPanel contentPane;

    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            try {
                titulo_tela frame = new titulo_tela();
                frame.setVisible(true);
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    }

    public titulo_tela() {
        setTitle("Central da Copa");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 420, 380);

        contentPane = new JPanel();
        contentPane.setBackground(new Color(0, 120, 0)); // verde Copa
        contentPane.setBorder(new EmptyBorder(10, 10, 10, 10));
        contentPane.setLayout(null);
        setContentPane(contentPane);

        // =========================
        // TÍTULO
        // =========================
        JLabel lblTitulo = new JLabel("🏆 CENTRAL DA COPA 🏆");
        lblTitulo.setHorizontalAlignment(SwingConstants.CENTER);
        lblTitulo.setFont(new Font("Arial", Font.BOLD, 20));
        lblTitulo.setBounds(40, 20, 320, 30);
        lblTitulo.setForeground(Color.YELLOW);
        contentPane.add(lblTitulo);

        // =========================
        // BOTÃO JOGOS
        // =========================
        JButton btnJogos = new JButton("Cadastro de Jogos");
        btnJogos.setBounds(100, 107, 200, 35);
        styleButton(btnJogos);

        btnJogos.addActionListener(e -> {
            Cadastro_Jogos tela = new Cadastro_Jogos();
            tela.setVisible(true);
            dispose();
        });

        contentPane.add(btnJogos);

        // =========================
        // BOTÃO SIMULADOR
        // =========================
        JButton btnSimulador = new JButton("Simulador");
        btnSimulador.setBounds(100, 153, 200, 35);
        styleButton(btnSimulador);

        btnSimulador.addActionListener(e -> {
            simulador tela = new simulador();
            tela.setVisible(true);
            dispose();
        });

        contentPane.add(btnSimulador);

        // =========================
        // BOTÃO SELEÇÕES
        // =========================
        JButton btnSelecoes = new JButton("Cadastro de Seleções");
        btnSelecoes.setBounds(100, 61, 200, 35);
        styleButton(btnSelecoes);

        btnSelecoes.addActionListener(e -> {
            cadastro_seleçoes tela = new cadastro_seleçoes();
            tela.setVisible(true);
            dispose();
        });

        contentPane.add(btnSelecoes);

        // =========================
        // BOTÃO BOLÃO
        // =========================
        JButton btnBolao = new JButton("Bolão da Copa");
        btnBolao.setBounds(100, 199, 200, 35);
        styleButton(btnBolao);

        btnBolao.addActionListener(e -> {
            bolão tela = new bolão();
            tela.setVisible(true);
            dispose();
        });

        contentPane.add(btnBolao);

        // =========================
        // BOTÃO SAIR
        // =========================
        JButton btnSair = new JButton("Sair do Sistema");
        btnSair.setBounds(100, 245, 200, 35);
        btnSair.setBackground(Color.YELLOW);
        btnSair.setForeground(new Color(0, 100, 0));
        btnSair.setFont(new Font("Arial", Font.BOLD, 14));
        btnSair.setFocusPainted(false);

        btnSair.addActionListener(e -> System.exit(0));

        contentPane.add(btnSair);
    }

    // =========================
    // ESTILO PADRÃO DOS BOTÕES
    // =========================
    private void styleButton(JButton btn) {
        btn.setBackground(Color.WHITE);
        btn.setForeground(new Color(0, 120, 0)); // verde
        btn.setFont(new Font("Arial", Font.BOLD, 13));
        btn.setFocusPainted(false);
    }
}