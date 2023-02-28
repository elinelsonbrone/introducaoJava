package lista2;

import java.text.DecimalFormat;

import javax.swing.JOptionPane;

public class Exercicio2 {
//Escreva um programa que receba quatro notas do aluno e as insira em um vetor. 
//Depois, calcule a m�dia aritm�tica entre as quatro notas e mostre o "conceito" do aluno conforme as instru��es: 
//9.0 ou maior = Conceito A
//entre 8.0 e 8.9 = Conceito B
//entre 7.0 e 7.9 = Conceito C
//menor que 7.0 = Conceito D

	public static void main(String[] args) {

		JOptionPane.showMessageDialog(null, "Ol� usu�rio. Este programa foi desenvolvido para receber 4 notas \n"
				+ " de um aluno e mostrar o conceito que esse aluno recebeu de acordo com suas notas.");
		double[] nota = new double[4];

		double media = 0;
		double soma = 0;
		DecimalFormat df = new DecimalFormat("0.00");
		for (int i = 0; i < 4; i++) {
			// usando o while para verificar se o usu�rio usa n�meros negativos
			do {

				nota[i] = Double
						.parseDouble(JOptionPane.showInputDialog("Digite a " + (i + 1) + "� nota" + "\n 1- Portugu�s:"
								+ "\n 2- Matem�tica:" + "\n 3- L�gica de programa��o:" + "\n 4- Banco de Dados:"));
			} while ((nota[i] < 0)||(nota[i] > 10));
			// fazendo a soma das notas
		}
		for (int i = 0; i < 4; i++) {
			soma = soma + nota[i];
		}
		media = soma / 4;
		JOptionPane.showMessageDialog(null, " media: " + df.format(media));
		// Fazendo a verifica��o da m�dia .

		if ((media >= 9.0) && (media <= 10)) {

			JOptionPane.showMessageDialog(null, "Conceito A");

		} else if ((media >= 8.0) && (media <= 8.9)) {
			JOptionPane.showMessageDialog(null, "Conceito B");

		} else if ((media >= 7.0) && (media <= 7.9)) {
			JOptionPane.showMessageDialog(null, "Conceito C");

		} else {
			JOptionPane.showMessageDialog(null, "Conceito D");

		}
	}
}
