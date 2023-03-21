package questao1;

import javax.swing.JOptionPane;

//1. Faça um programa que lê precoLitro (tipo Double) e quantidadeLitros (tipo Integer) usando o método showInputDialog 
//da classe JOptionPane. Crie um método (função) que calcule o totalPagamento e use ele para calcular os valores inseridos.
//Exiba o valor final utilizando o método showMessageDialog da classe JOptionPane.
//Crie uma lista (ArrayList) de String. Preencha 10 (dez) elementos nesta lista fazendo a leitura com o método showInputDialog 
//da classe JOptionPane em um for array. Em seguida, exiba todos os dados de uma só vez utilizando o método showMessageDialog 
//da classe JOptionPane.

	public class Questao1{
	
	public static void main1(String[] args){

			double precoLitro = Double.parseDouble(JOptionPane.showInputDialog("Preço do Litro: "));
			int quantidadeLitros = Integer.parseInt(JOptionPane.showInputDialog("Quantidade de litros: "));

			double totalPagamento = calcularTotalPagamento(precoLitro, quantidadeLitros);

			JOptionPane.showMessageDialog(null, "Total a pagar: R$ " + totalPagamento);
		}

		public static double calcularTotalPagamento(double precoLitro, int quantidadeLitros) {
			return precoLitro * quantidadeLitros;
			
		}
}
