//Faça um algoritmo que peça para o usuário inserir uma quantidade em horas, 
//outra em minutos e mais uma em segundos e mostre quantos segundos esse horário contém.

import javax.swing.JOptionPane;

public class Lista {

	public static void main(String[] args) {
		
		int qtdSegundos = 0;
		JOptionPane.showMessageDialog(null, "Olá, vams criar um algoritmo que mostre a quantidade de segundos "
				+ " que uma determinada hora contém:");
		
		int horas = Integer.parseInt(JOptionPane.showInputDialog("Informe  as horas:"));
		int minutos = Integer.parseInt(JOptionPane.showInputDialog("Informe os  minutos:"));
		int segundos = Integer.parseInt(JOptionPane.showInputDialog("Informe os segundos:"));
		
		qtdSegundos = (horas * 3600) + (minutos * 60) + (segundos * 1);
		
		
		JOptionPane.showMessageDialog(null,qtdSegundos, "Quantidade de segundos que constam nesse horário é:",JOptionPane.
				INFORMATION_MESSAGE);

	}

}
