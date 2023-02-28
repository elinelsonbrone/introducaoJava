package lista2;

import javax.swing.JOptionPane;

public class Exercicio6 {
// Uma empresa deseja saber alguns dados sobre suas vendas no passado. Faça um programa que armazene em um
//vetor o valor total das vendas de cada um dos 12 meses do ano (que deverá ser informado pelo usuário) e mostre:
//	O mês com a maior venda;
//	O mês com a menor venda;
//	A média das vendas do ano todo;
//	A média das vendas dos meses pares;
//	A média das vendas do 2º semestre.

	public static void main(String[] args) {

		JOptionPane.showMessageDialog(null,
				"Olá usuário. Este programa tem como finalidade mostrar o valor total das \n vendas"
						+ " de cada um dos 12 meses do ano.");
		String[] mesesAno = new String[12];

		double[] vendas = new double[12];
		double Valoresvendas = 0;
		double mesesPares = 0;
		double qtdeVendas = 0;
		double maiorVenda = 0;
		double menorVenda = 0;
		double mediaVendasano = 0;
		double mediaMesespares = 0;
		double segundoSemestre = 0;
		double mediaSegundosemestre = 0;
		double valoresPares = 0;
		double somaVendas = 0;
	
		
		mesesAno[0] = "Janeiro";
        mesesAno[1] = "Fevereiro";
        mesesAno[2] = "Março";
        mesesAno[3] = "Abril";
        mesesAno[4] = "Maio";
        mesesAno[5] = "Junho";
        mesesAno[6] = "Julho";
        mesesAno[7] = "Agosto";
        mesesAno[8] = "Setembro";
        mesesAno[9] = "Outubro";
        mesesAno[10] = "Novembro";
        mesesAno[11] = "Dezembro";
      String mensageMenor = "";
      String mensageMaior = "";
		for (int i = 0; i < 12; i++) {

			qtdeVendas = qtdeVendas + 1;

			vendas[i] = Double.parseDouble(
					JOptionPane.showInputDialog("Digite o valor de vendas de " + mesesAno[i]  + " "));
			somaVendas += vendas[i];

			while (vendas[i] < 0) {
				vendas[i] = Double.parseDouble(
						JOptionPane.showInputDialog("Digite o valor de vendas do "  + mesesAno[i]  + " "));
			}

			if (vendas[i] > maiorVenda) {
				maiorVenda = vendas[i];
				mensageMaior = mesesAno[i] + " é o mês com maior venda: R$" + maiorVenda;
			}
			
				if (i == 0) {
					menorVenda = vendas[i];
					mensageMenor =  mesesAno[i] + " é o mês com menor venda: R$" + menorVenda;

				}else if (vendas[i] < menorVenda) {
						menorVenda = vendas[i];
						//posicaoMenor = i;
						mensageMenor =  mesesAno[i] + " é o mês com menor venda: R$" + menorVenda;
					} else if (vendas[i] % 2 == 0) {
					valoresPares += vendas[i];
					mesesPares = mesesPares + 1;
				} else if (vendas[i] > 6) {
					Valoresvendas += vendas[i];
					segundoSemestre = segundoSemestre + 1;

				}
			}
		
		JOptionPane.showMessageDialog(null, mensageMaior + "\n" + mensageMenor);
		
		mediaVendasano = somaVendas / qtdeVendas;
		JOptionPane.showMessageDialog(null, mediaVendasano, "Média de vendas do ano todo.",
				JOptionPane.INFORMATION_MESSAGE);

		mediaMesespares = valoresPares / mesesPares;
		JOptionPane.showMessageDialog(null, mediaMesespares, "Média de vendas dos meses pares",
				JOptionPane.INFORMATION_MESSAGE);

		mediaSegundosemestre = Valoresvendas / segundoSemestre;

		JOptionPane.showMessageDialog(null, mediaSegundosemestre, "Média de vendas do segundo semestre.",
				JOptionPane.INFORMATION_MESSAGE);
	}

}
