//Faça um algoritmo que peça para o usuário inserir uma quantidade em horas, 
//outra em minutos e mais uma em segundos e mostre quantos segundos esse horário contém.

package lista1;

import javax.swing.JOptionPane;

public class Exercicio1 {

	public static void main(String[] args) {
		
		int qtdSegundos = 0;
		int horas;
		int minutos;
		int segundos;
		
		JOptionPane.showMessageDialog(null, "Olá usuário, vamos criar um algoritmo que mostre a quantidade de segundos "
				+ " que uma determinada hora contém:");
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
		
		
		JOptionPane.showMessageDialog(null,qtdSegundos, "Quantidade de segundos que constam nesse horário é:",JOptionPane.
				INFORMATION_MESSAGE);

	}

}
