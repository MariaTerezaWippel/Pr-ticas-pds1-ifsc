package visao;

import javax.swing.JOptionPane;

public class Janela {

	public static void main(String[]args) {
		
		String digitado = JOptionPane.showInputDialog("Digite alguma coisa ai: "); //o que digitar no campo de txt
		//string digitado serve para algo aparecer primeiro
		if (!digitado.isEmpty()) { //retornar vazio caso o usuario nao escreva
		JOptionPane.showMessageDialog(null, digitado); //so para exibir uma msg
	} 
		
		JOptionPane.showConfirmDialog(null, "Quer cafe?"); //para confirmar com pergunta e resposta
		
	}
		int opcao = JOptionPane.showConfirmDialog(null, "Sim");
		
		if (opcao == 0) {
			JOptionPane.showMessageDialog(null, "Não");
		}
	}
}