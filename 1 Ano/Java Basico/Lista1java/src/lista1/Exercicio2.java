//Desenvolva um programa que pergunte qual é a maioridade civil do seu “estado/país”
//e que posteriormente o usuário informe sua idade. Como resultado, o programa deve informar se ele é ou não maior de idade.
package lista1;
import javax.swing.JOptionPane;

public class Exercicio2 {

	public static void main(String[] args) {
	
		JOptionPane.showMessageDialog(null, "Olá usuário! Este programa tem como objetivo \n de mostrar a maior idade civil de um determinado estado/país "
				+ " e verificar se o cidadão deste \n Estado/País é maior de idade ou não. Vamos começar? ");
		int idade ;		
		int maiorIdade;
		do {
			maiorIdade = Integer.parseInt(JOptionPane.showInputDialog("Por gentileza, informe a maior idade civil do"
					+ " seu  Estado/país:"));


		} while (maiorIdade < 0);
		
			do {
				idade = Integer.parseInt(JOptionPane.showInputDialog("Por gentileza, informe a sua idade atual:"));
			}while  (idade < 0);
				
					
		
		if(idade >= maiorIdade) {
			JOptionPane.showMessageDialog(null, "Você é maior de idade!");
		}else {
			JOptionPane.showMessageDialog(null, "Você é menor de idade!");
		}

	}

}
