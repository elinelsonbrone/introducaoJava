//Fa�a um programa que pe�a ao usu�rio para informar 03 n�meros e mostre o 
//menor entre eles. Considere que o usu�rio n�o poder� informar n�meros iguais.
package lista1;

import javax.swing.JOptionPane;

public class Exercicio3 {
	
	public static void main(String[] args) {
		
		JOptionPane.showMessageDialog(null, "Ol�, este programa foi desenvolvido para voc� saber qual dos tr�s n�meros escolhidos"
				+ " � o menor e tamb�m verificar se h� n�meros repetidos estre eles. Vamos come�ar? ");
		
		int numero1 = Integer.parseInt(JOptionPane.showInputDialog("Por gentileza informe um n�mero:"));
		int numero2 = Integer.parseInt(JOptionPane.showInputDialog("Por gentileza informe um segundo n�mero:"));
		int numero3 = Integer.parseInt(JOptionPane.showInputDialog("Por gentileza informe um terceiro n�mero:"));
		
		if((numero1!=numero2)&& (numero2!=numero3)&& (numero1!=numero3)) {
			
			if((numero1 < numero2)&&(numero2<numero3)){
				JOptionPane.showMessageDialog(null, numero1, "� o menor n�mero",JOptionPane.INFORMATION_MESSAGE);
				
			}else {
				if((numero2<numero1)&& (numero2<numero3)) {
					
					JOptionPane.showMessageDialog(null, numero2, "� o menor n�mero",JOptionPane.INFORMATION_MESSAGE);	
					
				}else {
					JOptionPane.showMessageDialog(null, numero3, "� o menor n�mero",JOptionPane.INFORMATION_MESSAGE);
				}
			}
		
	}else {
		JOptionPane.showMessageDialog(null, "Existem n�meros iguais tente novamente");
		
	}
		
	}
}
