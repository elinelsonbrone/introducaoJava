//Fa�a um algoritmo que pe�a para o usu�rio inserir uma quantidade em horas, 
//outra em minutos e mais uma em segundos e mostre quantos segundos esse hor�rio cont�m.

package lista1;

import javax.swing.JOptionPane;

public class Exercicio1 {

	public static void main(String[] args) {
		
		int qtdSegundos = 0;
		int horas;
		int minutos;
		int segundos;
		
		JOptionPane.showMessageDialog(null, "Ol� usu�rio, vamos criar um algoritmo que mostre a quantidade de segundos "
				+ " que uma determinada hora cont�m:");
		do {
			horas = Integer.parseInt(JOptionPane.showInputDialog("Informe  as horas:"));
		}while (horas <0);
		
		do {
			minutos = Integer.parseInt(JOptionPane.showInputDialog("Informe  os minutos:"));
		}while (minutos <0);
		
		do {
			segundos = Integer.parseInt(JOptionPane.showInputDialog("Informe os segundos:"));
		}while (segundos <0);
		 
		
		qtdSegundos = (horas * 3600) + (minutos * 60) + (segundos * 1);
		
		
		JOptionPane.showMessageDialog(null,qtdSegundos, "Quantidade de segundos que constam nesse hor�rio �:",JOptionPane.
				INFORMATION_MESSAGE);

	}

}
