package questao3;

import javax.swing.JOptionPane;

public class Questao3 {
	
public static void main(String[] args) {
        
        
        double n1 = Double.parseDouble(JOptionPane.showInputDialog("Insira a nota 1: /n"));
        double n2 = Double.parseDouble(JOptionPane.showInputDialog("Insira a nota 2: /n"));
        double n3 = Double.parseDouble(JOptionPane.showInputDialog("Insira a nota 3: /n"));
        
        double media = (n1 + n2 + n3)/3;
        
        if (media >= 6) {
            JOptionPane.showMessageDialog(null, "Aprovado(a)");
        } else if (media >= 4 && media < 6) {
            JOptionPane.showMessageDialog(null, "Recuperação");
        } 
        else {
            JOptionPane.showMessageDialog(null, "Reprovado(a)");
        }
    }
}
