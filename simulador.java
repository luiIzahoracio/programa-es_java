package projetof;

import java.awt.EventQueue;
import java.awt.Font;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import java.awt.Color;

public class simulador extends JFrame {

    private static final long serialVersionUID = 1L;
    private JPanel contentPane;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    simulador frame = new simulador();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public simulador() {
        setTitle("Simulador da Copa");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 450, 300);

        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        // TÍTULO
        JLabel lblTitulo = new JLabel("SIMULADOR DA COPA");
        lblTitulo.setForeground(Color.WHITE);
        lblTitulo.setFont(new Font("Arial", Font.BOLD, 18));
        lblTitulo.setBounds(110, 10, 250, 30);
        contentPane.add(lblTitulo);

        // SELEÇÃO A
        JLabel lblTimeA = new JLabel("Seleção A:");
        lblTimeA.setForeground(Color.WHITE);
        lblTimeA.setBounds(30, 60, 80, 20);
        contentPane.add(lblTimeA);

        JComboBox<String> comboA = new JComboBox<>();
        comboA.addItem("Brasil");
        comboA.addItem("Argentina");
        comboA.addItem("França");
        comboA.addItem("Alemanha");
        comboA.addItem("Portugal");
        comboA.setBounds(120, 60, 150, 25);
        contentPane.add(comboA);

        // SELEÇÃO B
        JLabel lblTimeB = new JLabel("Seleção B:");
        lblTimeB.setForeground(Color.WHITE);
        lblTimeB.setBounds(30, 100, 80, 20);
        contentPane.add(lblTimeB);

        JComboBox<String> comboB = new JComboBox<>();
        comboB.addItem("Brasil");
        comboB.addItem("Argentina");
        comboB.addItem("França");
        comboB.addItem("Alemanha");
        comboB.addItem("Portugal");
        comboB.setBounds(120, 100, 150, 25);
        contentPane.add(comboB);

        // BOTÃO SIMULAR
        JButton btnSimular = new JButton("Simular");
        btnSimular.setBounds(150, 150, 120, 30);

        JLabel lblResultado = new JLabel("");
        lblResultado.setForeground(Color.WHITE);
        lblResultado.setBounds(297, 75, 350, 30);
        contentPane.add(lblResultado);

        btnSimular.addActionListener(e -> {
            String timeA = comboA.getSelectedItem().toString();
            String timeB = comboB.getSelectedItem().toString();

            if (timeA.equals(timeB)) {
                JOptionPane.showMessageDialog(null, "Escolha seleções diferentes!");
                return;
            }

            Random rand = new Random();
            int golsA = rand.nextInt(5);
            int golsB = rand.nextInt(5);

            String resultado;

            if (golsA > golsB) {
                resultado = timeA + " venceu!";
            } else if (golsB > golsA) {
                resultado = timeB + " venceu!";
            } else {
                resultado = "Empate!";
            }

            lblResultado.setText(timeA + " " + golsA + " x " + golsB + " " + timeB);

            JOptionPane.showMessageDialog(
                null,
                "Resultado do jogo:\n" +
                timeA + " " + golsA + " x " + golsB + " " + timeB +
                "\n\n" + resultado
            );
        });

        contentPane.add(btnSimular);

        // BOTÃO VOLTAR
        JButton btnVoltar = new JButton("Voltar");
        btnVoltar.setBounds(10, 153, 100, 25);

        btnVoltar.addActionListener(e -> {
            titulo_tela tela = new titulo_tela();
            tela.setVisible(true);
            dispose();
        });

        contentPane.add(btnVoltar);
        
        JLabel lblNewLabel = new JLabel("New label");
        lblNewLabel.setIcon(new ImageIcon("C:\\Users\\Aluno\\Downloads\\bdbd3b901064e1e7c0f9eb8381659e3b.jpg"));
        lblNewLabel.setBounds(0, 0, 450, 275);
        contentPane.add(lblNewLabel);
    }
}