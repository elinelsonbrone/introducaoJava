//Desenvolva um programa que pergunte qual � a maioridade civil do seu �estado/pa�s�
//e que posteriormente o usu�rio informe sua idade. Como resultado, o programa deve informar se ele � ou n�o maior de idade.
package lista1;
import javax.swing.JOptionPane;

public class Exercicio2 {

	public static void main(String[] args) {
	
		JOptionPane.showMessageDialog(null, "Ol� usu�rio! Este programa tem como objetivo \n de mostrar a maior idade civil de um determinado estado/pa�s "
				+ " e verificar se o cidad�o deste \n Estado/Pa�s � maior de idade ou n�o. Vamos come�ar? ");
		int idade ;		
		int maiorIdade;
		do {
			maiorIdade = Integer.parseInt(JOptionPane.showInputDialog("Por gentileza, informe a maior idade civil do"
					+ " seu  Estado/pa�s:"));


		} while (maiorIdade < 0);
		
			do {
				idade = Integer.parseInt(JOptionPane.showInputDialog("Por gentileza, informe a sua idade atual:"));
			}while  (idade < 0);
				
					
		
		if(idade >= maiorIdade) {
			JOptionPane.showMessageDialog(null, "Voc� � maior de idade!");
		}else {
			JOptionPane.showMessageDialog(null, "Voc� � menor de idade!");
		}

	}

}
