//Fa�a um algoritmo que pe�a para o usu�rio inserir uma quantidade em horas, 
//outra em minutos e mais uma em segundos e mostre quantos segundos esse hor�rio cont�m.

import javax.swing.JOptionPane;

public class Lista {

	public static void main(String[] args) {
		
		int qtdSegundos = 0;
		JOptionPane.showMessageDialog(null, "Ol�, vams criar um algoritmo que mostre a quantidade de segundos "
				+ " que uma determinada hora cont�m:");
		
		int horas = Integer.parseInt(JOptionPane.showInputDialog("Informe  as horas:"));
		int minutos = Integer.parseInt(JOptionPane.showInputDialog("Informe os  minutos:"));
		int segundos = Integer.parseInt(JOptionPane.showInputDialog("Informe os segundos:"));
		
		qtdSegundos = (horas * 3600) + (minutos * 60) + (segundos * 1);
		
		
		JOptionPane.showMessageDialog(null,qtdSegundos, "Quantidade de segundos que constam nesse hor�rio �:",JOptionPane.
				INFORMATION_MESSAGE);

	}

}
