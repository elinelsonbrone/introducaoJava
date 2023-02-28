package lista1;

import javax.swing.JOptionPane;
import java.text.DecimalFormat;

public class Exercicio8 {

	public static void main(String[] args) {
		// Faça um programa que carregue os valores das vendas de uma loja no primeiro
		// semestre do ano.
		// Considere para tal uma matriz [6,4], sendo que são 06 meses e 04 semanas por
		// mês. Ao final, mostre na tela:
		// ● Total de vendas do semestre
		// ● Total vendido em cada mês
		
		JOptionPane.showMessageDialog(null, "Olá usuário. Este programa foi desenvolvido para calcular o valor "
				+ " das vendas nos 6 primeiros meses do ano.\n Também ele irá mostrar o valor vendido em cada mês.\n Vamos começar? ");

		int l = 0;
		int c = 0;
		double[][] vendas = new double[6][4];

		double[] totalmes = new double[6];
		double totalsemestre = 0;
		DecimalFormat df = new DecimalFormat("0.00");

		for (l = 0; l < 6; l++) {
			for (c = 0; c < 4; c++) {
				
					do {
						vendas[l][c] = Double.parseDouble(JOptionPane.showInputDialog(	"Informe o valor de vendas da " + (c + 1) + "ª semana do " + (l + 1) + " ª mês "));
				
					}while (vendas[l][c]<0);
						
				
				totalmes[l] += vendas[l][c];
				
			}
			//JOptionPane.showMessageDialog(null, totalmes[l], " O Valor total de vendas de cada mês0:", JOptionPane.INFORMATION_MESSAGE);
			totalsemestre += totalmes[l];
		}
		
		JOptionPane.showMessageDialog(null, df.format(totalsemestre));
		
	}
}
