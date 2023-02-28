//Faça um algoritmo que mostre a soma de todos os valores pares entre o intervalo de dois números digitados pelo usuário.

package lista1;

import javax.swing.JOptionPane;

public class Exercicio4 {

	public static void main(String[] args) {
	
		JOptionPane.showMessageDialog(null,"Olá usuário.\n Este programa foi desenvolvido com intuito de mostrar a soma entre os "
				+ " valores pares no intervalo de dois números.\n Vamos começar? ");
	int somaPares= 0;
	
	int num1 = Integer.parseInt(JOptionPane.showInputDialog("Por gentileza informe um valor:"));
	int num2 = Integer.parseInt(JOptionPane.showInputDialog("Por gentileza informe um segundo valor:")); 
	
	if (num1>num2) {
		int aux = num1;
		num1 = num2;
		num2 = aux;			
	}
	
	for (int i =(num1+1); i <num2; i++){
		if(i%2==0) {
			somaPares =( somaPares + i);
		}
		
	}
	JOptionPane.showMessageDialog(null, somaPares, "Resultado da soma dos pares",JOptionPane.INFORMATION_MESSAGE);
	}

}
