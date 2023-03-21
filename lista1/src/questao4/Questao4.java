package questao4;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Questao4 extends JFrame implements ActionListener {
    private JTextField field1, field2;
    private JButton button1, button2, button3, button4;

    public Questao4() {
        super("Calculo");
        setLayout(new FlowLayout());
        
        field1 = new JTextField(10);
        add(field1);
        
        field2 = new JTextField(10);
        add(field2);
        
        button1 = new JButton("+");
        button1.addActionListener(this);
        add(button1);
        
        button2 = new JButton("-");
        button2.addActionListener(this);
        add(button2);
        
        button3 = new JButton("/");
        button3.addActionListener(this);
        add(button3);
        
        button4 = new JButton("*");
        button4.addActionListener(this);
        add(button4);
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(250, 150);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        double num1 = Double.parseDouble(field1.getText());
        double num2 = Double.parseDouble(field2.getText());
        double result = 0;
        
        if (e.getSource() == button1) {
            result = num1 + num2;
        } else if (e.getSource() == button2) {
            result = num1 - num2;
        } else if (e.getSource() == button3) {
            result = num1 / num2;
        } else if (e.getSource() == button4) {
            result = num1 * num2;
        }
        
        JOptionPane.showMessageDialog(null, "Resultado: /n" + result);
    }

    public static void main(String[] args) {
        new Questao4();
    }
    
}
	
	


