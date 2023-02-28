package metodos;

import java.text.DecimalFormat;

import javax.swing.JOptionPane;

public class Exercicio2 {
//Fa�a um programa que receba as tr�s notas de um aluno e pergunte ao professor qual m�dia ele deseja calcular:
//aritm�tica ou ponderada. Se for a m�dia ponderada, os pesos de cada nota devem ser informados.
//Cada m�dia dever� ser calculada por um m�todo;
//Os dois m�todos devem receber como par�metros as notas;
//No caso do m�todo da m�dia ponderada, al�m das notas, o m�todo dever� receber tamb�m os pesos,
//que devem ser previamente solicitados ao usu�rio;
//Os dois m�todos devem retornar a m�dia
//Um m�todo deve ser criado para receber a m�dia final e mostrar se o aluno est� aprovado ou reprovado,
//considerando que a m�dia m�nima para aprova��o � 7.

	public static void main(String[] args) {
		
		double media = 0;
		double[] nota = new double[3];
	    double[] peso = new double[3];
		
		int i;
		for (i = 0; i < 3; i++) {
			
			nota[i] = Double.parseDouble(JOptionPane.showInputDialog("Insira a " + (i + 1) + "� nota do aluno"));
          
			while ((nota[i] < 0) || (nota[i] > 10)) {
				mostrarErronota();
				nota[i] = Double.parseDouble(JOptionPane.showInputDialog("Insira a " + (i + 1) + "� nota do aluno"));
			}
			// media += nota[i];

		}
		
		

		int opcao = Integer.parseInt(JOptionPane.showInputDialog(
				"Qual das m�dias voc� gostaria de calcular? \n" + "1- M�dia Aritm�tica, 2 - M�dia Ponderda:"));
		switch (opcao) {
		case 1:
			// calcularMedia(nota);
			media = calcularMedia(nota);
			mostrarResultado(media);
			
			break;
		case 2:
			for (i = 0; i < 3; i++) {
				peso[i] = Double.parseDouble(JOptionPane.showInputDialog("O peso " + (i + 1) + "� nota"));
				
				while(peso[i] < 0) {
					mostrarErronota();
					peso[i] = Double.parseDouble(JOptionPane.showInputDialog("O peso " + (i + 1) + "� nota"));	
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
		JOptionPane.showMessageDialog(null, " A nota digitada � inv�lida! ");
	}

}
