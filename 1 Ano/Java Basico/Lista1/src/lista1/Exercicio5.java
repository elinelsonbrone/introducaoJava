//Fa�a um algoritmo que pe�a ao usu�rio 10 n�meros e mostre posteriormente quantos s�o pares e a soma deles, 
//bem como quantos s�o �mpares e a soma deles.

package lista1;

import javax.swing.JOptionPane;

public class Exercicio5 {

	public static void main(String[] args) {
		
		JOptionPane.showMessageDialog(null,"Ol� usu�rio. Este programa foi desenvolvido com intuito de mostrar a quantidade de "
				+ " n�meros pares e �mpares no intervalo de 10 n�meros e a soma desses n�meros. Vamos come�ar? ");
	
	int[] numeros = new int[10];
	
	int somaPares = 0;
	int somaImpares = 0;
	int qtdPares= 0; 
	int qtdImpares = 0;
	
	for(int i = 0; i < 10; i++) {
		
		numeros[i] = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe o " +(i+1)+ "� valor"));
		if(numeros[i] %2==0) {
			qtdPares = qtdPares + 1;
			somaPares =  somaPares + numeros[i]; 
			
		}else {
			qtdImpares = qtdImpares+1;
			somaImpares = somaImpares + numeros[i];
			
		}
	   
	}
	JOptionPane.showMessageDialog(null, qtdPares, " Quantidade de n�meros pares �:", JOptionPane.INFORMATION_MESSAGE);
	JOptionPane.showMessageDialog(null, somaPares, " A soma dos n�meros pares �:", JOptionPane.INFORMATION_MESSAGE);
	JOptionPane.showMessageDialog(null, qtdImpares, " Quantidade de n�meros �mpares �:", JOptionPane.INFORMATION_MESSAGE);
	JOptionPane.showMessageDialog(null, somaImpares, " A soma dos n�meros �mpares �:", JOptionPane.INFORMATION_MESSAGE);


	}

}
