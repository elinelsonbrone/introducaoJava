
package lista2;

import javax.swing.JOptionPane;

//Faça um programa que receba um vetor de valores e mostre a quantidade de  valores negativos.
//Os valores e o tamanho do vetor devem ser informados pelo usuário.

public class Exercicio1 {

	public static void main(String[] args) {

		int n = 0;
		int qtdNegativos = 0;

		JOptionPane.showMessageDialog(null, "Olá usuário. Este programa foi desenvolvido com intuito de mostrar \n a "
				+ "quantidade de valores negativos em um vetor. Vamos começar? ");

		n = Integer.parseInt(JOptionPane.showInputDialog("Informe a quantidade de números:"));

		int[] valor = new int[n];

		for (int i = 0; i < n; i++) {

			valor[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite o " + (i + 1) + "º valor"));

			if (valor[i] < 0) {
				qtdNegativos = qtdNegativos + 1;
			}

		}
		JOptionPane.showMessageDialog(null, qtdNegativos, "Resultado", JOptionPane.INFORMATION_MESSAGE);

	}

}
