
package lista2;

import javax.swing.JOptionPane;

//Fa�a um programa que receba um vetor de valores e mostre a quantidade de  valores negativos.
//Os valores e o tamanho do vetor devem ser informados pelo usu�rio.

public class Exercicio1 {

	public static void main(String[] args) {

		int n = 0;
		int qtdNegativos = 0;

		JOptionPane.showMessageDialog(null, "Ol� usu�rio. Este programa foi desenvolvido com intuito de mostrar \n a "
				+ "quantidade de valores negativos em um vetor. Vamos come�ar? ");

		n = Integer.parseInt(JOptionPane.showInputDialog("Informe a quantidade de n�meros:"));

		int[] valor = new int[n];

		for (int i = 0; i < n; i++) {

			valor[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite o " + (i + 1) + "� valor"));

			if (valor[i] < 0) {
				qtdNegativos = qtdNegativos + 1;
			}

		}
		JOptionPane.showMessageDialog(null, qtdNegativos, "Resultado", JOptionPane.INFORMATION_MESSAGE);

	}

}
