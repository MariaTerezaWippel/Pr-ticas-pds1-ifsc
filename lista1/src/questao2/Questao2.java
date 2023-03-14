package questao2;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Questao2 {
		
	public static void main(String[] args) {


    ArrayList<String> listaNomes = new ArrayList<String>();

   
    for (int i = 0; i < 10; i++) {
        String nome = JOptionPane.showInputDialog("Insira seu nome: \n" + (i + 1) + ":");
        listaNomes.add(nome);
    }

    JOptionPane.showMessageDialog(null, "Nomes inseridos: \n" + listaNomes);
    
	}
}
