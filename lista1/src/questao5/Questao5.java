package questao5;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Questao5 extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;
	private JTextField Lado1;
    private JTextField Lado2;
    private JTextField Lado3;
    private JButton verificarButton;

    public Questao5() {
        super("Verificação de triângulos");

        Lado1 = new JTextField(10);
        Lado2 = new JTextField(10);
        Lado3 = new JTextField(10);

        verificarButton = new JButton("Verificar");
        verificarButton.addActionListener(this);

        JPanel panel = new JPanel(new GridLayout(4, 2));
        panel.add(new JLabel("Lado 1: /n"));
        panel.add(Lado1);
        panel.add(new JLabel("Lado 2: /n"));
        panel.add(Lado2);
        panel.add(new JLabel("Lado 3: /n"));
        panel.add(Lado3);
        panel.add(new JLabel(""));
        panel.add(verificarButton);

        add(panel);
        pack();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        try {
        	
            double a = Double.parseDouble(Lado1.getText());
            double b = Double.parseDouble(Lado2.getText());
            double c = Double.parseDouble(Lado3.getText());

            if (a + b <= c || a + c <= b || b + c <= a) {
                JOptionPane.showMessageDialog(this, "Os lados não formam um triângulo.");
            } 
            else if (a == b && b == c) {
                JOptionPane.showMessageDialog(this, "Triângulo equilátero");
            } 
            else if (a == b || a == c || b == c) {
                JOptionPane.showMessageDialog(this, "Triângulo isósceles");
            } 
            else {
                JOptionPane.showMessageDialog(this, "Triângulo escaleno");
            }

        	} 
        catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Digite apenas números válidos nos campos!");
        }
    }

    public static void main(String[] args) {
        new Questao5();
    }
}

