//Faça um programa que peça ao usuário para informar 03 números e mostre o 
//menor entre eles. Considere que o usuário não poderá informar números iguais.
package lista1;

import javax.swing.JOptionPane;

public class Exercicio3 {
	
	public static void main(String[] args) {
		
		JOptionPane.showMessageDialog(null, "Olá, este programa foi desenvolvido para você saber qual dos três números escolhidos"
				+ " é o menor e também verificar se há números repetidos estre eles. Vamos começar? ");
		
		int numero1 = Integer.parseInt(JOptionPane.showInputDialog("Por gentileza informe um número:"));
		int numero2 = Integer.parseInt(JOptionPane.showInputDialog("Por gentileza informe um segundo número:"));
		int numero3 = Integer.parseInt(JOptionPane.showInputDialog("Por gentileza informe um terceiro número:"));
		
		if((numero1!=numero2)&& (numero2!=numero3)&& (numero1!=numero3)) {
			
			if((numero1 < numero2)&&(numero2<numero3)){
				JOptionPane.showMessageDialog(null, numero1, "É o menor número",JOptionPane.INFORMATION_MESSAGE);
				
			}else {
				if((numero2<numero1)&& (numero2<numero3)) {
					
					JOptionPane.showMessageDialog(null, numero2, "É o menor número",JOptionPane.INFORMATION_MESSAGE);	
					
				}else {
					JOptionPane.showMessageDialog(null, numero3, "É o menor número",JOptionPane.INFORMATION_MESSAGE);
				}
			}
		
	}else {
		JOptionPane.showMessageDialog(null, "Existem números iguais tente novamente");
		
	}
		
	}
}
