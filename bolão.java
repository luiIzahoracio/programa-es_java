package projetof;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Color;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;

public class bolão extends JFrame {

    private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    private JTextField txtNome;
    private JTextField txtPalpiteA;
    private JTextField txtPalpiteB;

    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            try {
                bolão frame = new bolão();
                frame.setVisible(true);
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    }

    public bolão() {
        setTitle("Bolão da Copa");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 450, 330);

        contentPane = new JPanel();
        contentPane.setBackground(new Color(0, 120, 0)); // verde campo
        contentPane.setBorder(new EmptyBorder(10, 10, 10, 10));
        contentPane.setLayout(null);
        setContentPane(contentPane);

        // =========================
        // TÍTULO
        // =========================
        JLabel lblTitulo = new JLabel("🏆 BOLÃO DA COPA 🏆");
        lblTitulo.setHorizontalAlignment(SwingConstants.CENTER);
        lblTitulo.setFont(new Font("Arial", Font.BOLD, 18));
        lblTitulo.setForeground(Color.YELLOW);
        lblTitulo.setBounds(80, 10, 280, 30);
        contentPane.add(lblTitulo);

        // =========================
        // NOME
        // =========================
        JLabel lblNome = new JLabel("Nome:");
        lblNome.setForeground(Color.YELLOW);
        lblNome.setBounds(30, 60, 80, 20);
        contentPane.add(lblNome);

        txtNome = new JTextField();
        txtNome.setBounds(100, 60, 180, 25);
        contentPane.add(txtNome);

        // =========================
        // SELEÇÃO A
        // =========================
        JLabel lblA = new JLabel("Seleção A:");
        lblA.setForeground(Color.YELLOW);
        lblA.setBounds(30, 95, 80, 20);
        contentPane.add(lblA);

        JComboBox<String> comboA = new JComboBox<>();
        comboA.addItem("Brasil");
        comboA.addItem("Argentina");
        comboA.addItem("França");
        comboA.addItem("Alemanha");
        comboA.setBounds(100, 95, 180, 25);
        contentPane.add(comboA);

        // =========================
        // SELEÇÃO B
        // =========================
        JLabel lblB = new JLabel("Seleção B:");
        lblB.setForeground(Color.YELLOW);
        lblB.setBounds(30, 130, 80, 20);
        contentPane.add(lblB);

        JComboBox<String> comboB = new JComboBox<>();
        comboB.addItem("Brasil");
        comboB.addItem("Argentina");
        comboB.addItem("França");
        comboB.addItem("Alemanha");
        comboB.setBounds(100, 130, 180, 25);
        contentPane.add(comboB);

        // =========================
        // PALPITE
        // =========================
        JLabel lblPalpite = new JLabel("Palpite:");
        lblPalpite.setForeground(Color.YELLOW);
        lblPalpite.setBounds(30, 165, 80, 20);
        contentPane.add(lblPalpite);

        txtPalpiteA = new JTextField();
        txtPalpiteA.setBounds(100, 165, 40, 25);
        contentPane.add(txtPalpiteA);

        JLabel x = new JLabel("X");
        x.setForeground(Color.YELLOW);
        x.setBounds(145, 165, 20, 25);
        contentPane.add(x);

        txtPalpiteB = new JTextField();
        txtPalpiteB.setBounds(160, 165, 40, 25);
        contentPane.add(txtPalpiteB);

        // =========================
        // BOTÃO APOSTAR
        // =========================
        JButton btnApostar = new JButton("Apostar");
        btnApostar.setBounds(150, 205, 120, 30);

        btnApostar.addActionListener(e -> {

            String nome = txtNome.getText();
            String timeA = comboA.getSelectedItem().toString();
            String timeB = comboB.getSelectedItem().toString();

            if (timeA.equals(timeB)) {
                JOptionPane.showMessageDialog(null, "Seleções devem ser diferentes!");
                return;
            }

            try {
                int palpiteA = Integer.parseInt(txtPalpiteA.getText());
                int palpiteB = Integer.parseInt(txtPalpiteB.getText());

                Random rand = new Random();
                int golsA = rand.nextInt(5);
                int golsB = rand.nextInt(5);

                String resultadoReal = timeA + " " + golsA + " x " + golsB + " " + timeB;

                String msg = "Jogador: " + nome +
                        "\n\nResultado do jogo:\n" + resultadoReal;

                if (palpiteA == golsA && palpiteB == golsB) {
                    msg += "\n\n🎉 Você acertou o placar!";
                } else {
                    msg += "\n\n❌ Você errou o placar!";
                }

                JOptionPane.showMessageDialog(null, msg);

            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "Digite um palpite válido!");
            }
        });

        contentPane.add(btnApostar);

        // =========================
        // BOTÃO VOLTAR
        // =========================
        JButton btnVoltar = new JButton("Voltar");
        btnVoltar.setBounds(10, 205, 100, 30);

        btnVoltar.addActionListener(e -> {
            titulo_tela tela = new titulo_tela();
            tela.setVisible(true);
            dispose();
        });

        contentPane.add(btnVoltar);
    }
}