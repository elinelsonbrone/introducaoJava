//Faça uma solução que alimente um vetor com 10 valores inteiros e também que solicite ao
//usuário a entrada de dados de um valor inteiro qualquer.
//A solução deverá fazer uma busca do valor, informado pelo usuário,
//no vetor e imprima a posição em que este foi encontrado ou se não foi encontrado.

package lista1;

import javax.swing.JOptionPane; 

public class Exercicio7 {

	public static void main(String[] args) {
		
		JOptionPane.showMessageDialog(null, " Olá usuário. Este algoritmo foi desenvolvido para mostrar "
				+ " a posição de um determinado número em um vetor de 10 posições e também verificar se este número se "
				+ " encotra no vetor ou não.");
		
		int[] vet = new int[10];
	    int posiVet = -1;
		int valor = Integer.parseInt(JOptionPane.showInputDialog(null,"Informe um valor qualquer:"));
       
		for (int i =0; i <10; i++) {
			 vet[i] = Integer.parseInt(JOptionPane.showInputDialog("Informe o " +(i+1)+" º valor:"));
			if(valor == vet[i]) {
				posiVet = i+1 ; 
				
				JOptionPane.showMessageDialog(null," Posicao do vetor " + posiVet," resultado", JOptionPane.INFORMATION_MESSAGE);	
			}
		}
		
		if(posiVet==-1) {
				JOptionPane.showMessageDialog(null," O valor não se encontra no vetor.");
			
		}

	}
	
}
