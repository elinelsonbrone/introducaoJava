//Faça um algoritmo que peça ao usuário 10 números e mostre posteriormente quantos são pares e a soma deles, 
//bem como quantos são ímpares e a soma deles.

package lista1;

import javax.swing.JOptionPane;

public class Exercicio5 {

	public static void main(String[] args) {
		
		JOptionPane.showMessageDialog(null,"Olá usuário. Este programa foi desenvolvido com intuito de mostrar a quantidade de "
				+ " números pares e ímpares no intervalo de 10 números e a soma desses números. Vamos começar? ");
	
	int[] numeros = new int[10];
	
	int somaPares = 0;
	int somaImpares = 0;
	int qtdPares= 0; 
	int qtdImpares = 0;
	
	for(int i = 0; i < 10; i++) {
		
		numeros[i] = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe o " +(i+1)+ "º valor"));
		if(numeros[i] %2==0) {
			qtdPares = qtdPares + 1;
			somaPares =  somaPares + numeros[i]; 
			
		}else {
			qtdImpares = qtdImpares+1;
			somaImpares = somaImpares + numeros[i];
			
		}
	   
	}
	JOptionPane.showMessageDialog(null, qtdPares, " Quantidade de números pares é:", JOptionPane.INFORMATION_MESSAGE);
	JOptionPane.showMessageDialog(null, somaPares, " A soma dos números pares é:", JOptionPane.INFORMATION_MESSAGE);
	JOptionPane.showMessageDialog(null, qtdImpares, " Quantidade de números ímpares é:", JOptionPane.INFORMATION_MESSAGE);
	JOptionPane.showMessageDialog(null, somaImpares, " A soma dos números ímpares é:", JOptionPane.INFORMATION_MESSAGE);


	}

}
