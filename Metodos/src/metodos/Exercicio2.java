package metodos;

import java.text.DecimalFormat;

import javax.swing.JOptionPane;

public class Exercicio2 {
//Faça um programa que receba as três notas de um aluno e pergunte ao professor qual média ele deseja calcular:
//aritmética ou ponderada. Se for a média ponderada, os pesos de cada nota devem ser informados.
//Cada média deverá ser calculada por um método;
//Os dois métodos devem receber como parâmetros as notas;
//No caso do método da média ponderada, além das notas, o método deverá receber também os pesos,
//que devem ser previamente solicitados ao usuário;
//Os dois métodos devem retornar a média
//Um método deve ser criado para receber a média final e mostrar se o aluno está aprovado ou reprovado,
//considerando que a média mínima para aprovação é 7.

	public static void main(String[] args) {
		
		double media = 0;
		double[] nota = new double[3];
	    double[] peso = new double[3];
		
		int i;
		for (i = 0; i < 3; i++) {
			
			nota[i] = Double.parseDouble(JOptionPane.showInputDialog("Insira a " + (i + 1) + "ª nota do aluno"));
          
			while ((nota[i] < 0) || (nota[i] > 10)) {
				mostrarErronota();
				nota[i] = Double.parseDouble(JOptionPane.showInputDialog("Insira a " + (i + 1) + "ª nota do aluno"));
			}
			// media += nota[i];

		}
		
		

		int opcao = Integer.parseInt(JOptionPane.showInputDialog(
				"Qual das médias você gostaria de calcular? \n" + "1- Média Aritmética, 2 - Média Ponderda:"));
		switch (opcao) {
		case 1:
			// calcularMedia(nota);
			media = calcularMedia(nota);
			mostrarResultado(media);
			
			break;
		case 2:
			for (i = 0; i < 3; i++) {
				peso[i] = Double.parseDouble(JOptionPane.showInputDialog("O peso " + (i + 1) + "ª nota"));
				
				while(peso[i] < 0) {
					mostrarErronota();
					peso[i] = Double.parseDouble(JOptionPane.showInputDialog("O peso " + (i + 1) + "ª nota"));	
				}
			}
			
			 media = solicitaMediaponderada(nota, peso);
			mostrarResultado(media);
			break;
		}

	}

	public static double calcularMedia(double nota[]) {

		double media = (nota[0] + nota[1] + nota[2]) / 3;
		return media;

	}
   
	public static void mostrarResultado (double media) {
		
		DecimalFormat df = new DecimalFormat("0.00");
		if(media<7) {
			JOptionPane.showMessageDialog(null," Reprovado " + df.format(media));
		}else {
			JOptionPane.showMessageDialog(null," Aprovado " + df.format(media));
		}
		
	}
	
	
	public static double solicitaMediaponderada(double nota[], double peso[]) {
		double notaPeso =  (nota[0] * peso[0])+ (nota[1] * peso[1]) + (nota[2] * peso[2]); 
		double somaPeso= (peso[0]+ peso[1]+ peso[2]);
		double media = notaPeso / somaPeso;
		
		return media;
	}

	public static void mostrarErronota() {
		JOptionPane.showMessageDialog(null, " A nota digitada é inválida! ");
	}

}
