//Fa�a uma solu��o que alimente um vetor com 10 valores inteiros e tamb�m que solicite ao
//usu�rio a entrada de dados de um valor inteiro qualquer.
//A solu��o dever� fazer uma busca do valor, informado pelo usu�rio,
//no vetor e imprima a posi��o em que este foi encontrado ou se n�o foi encontrado.

package lista1;

import javax.swing.JOptionPane; 

public class Exercicio7 {

	public static void main(String[] args) {
		
		JOptionPane.showMessageDialog(null, " Ol� usu�rio. Este algoritmo foi desenvolvido para mostrar "
				+ " a posi��o de um determinado n�mero em um vetor de 10 posi��es e tamb�m verificar se este n�mero se "
				+ " encotra no vetor ou n�o.");
		
		int[] vet = new int[10];
	    int posiVet = -1;
		int valor = Integer.parseInt(JOptionPane.showInputDialog(null,"Informe um valor qualquer:"));
       
		for (int i =0; i <10; i++) {
			 vet[i] = Integer.parseInt(JOptionPane.showInputDialog("Informe o " +(i+1)+" � valor:"));
			if(valor == vet[i]) {
				posiVet = i+1 ; 
				
				JOptionPane.showMessageDialog(null," Posicao do vetor " + posiVet," resultado", JOptionPane.INFORMATION_MESSAGE);	
			}
		}
		
		if(posiVet==-1) {
				JOptionPane.showMessageDialog(null," O valor n�o se encontra no vetor.");
			
		}

	}
	
}
