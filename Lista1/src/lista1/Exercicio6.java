//Crie uma calculadora que permita o c�lculo de uma equa��o, sem limite de execu��es definido, da seguinte maneira:
//1. Pe�a o primeiro valor ,
//2. Pe�a o c�lculo que deseja fazer (entre as 4 opera��es b�sicas),
//3. Pe�a um segundo valor 
//4. Efetue o c�lculo,
//5. Pe�a se o usu�rio quer continuar calculando. Se ele responder 
//que sim, volte para o passo 2 usando o resultado do c�lculo da linha 4 como primeiro valor,
//e se disser que n�o, mostre o resultado final . 
//Exemplo de uso para o algoritmo: 4 + 3 = 7 x 4 = 28 / 14 = 2.



package lista1;

import javax.swing.JOptionPane;

public class Exercicio6 {
	
	public static void main(String[] args) {
		
		JOptionPane.showMessageDialog(null, "Ol� usu�rio. Este programa foi desenvolvido com objetivo de mostrar uma calculadora"
				+ "\n pra  voc� usar todas as opera��es matem�ticas quantas vezes achar necess�rio. \n Quando voc� n�o quiser continuar "
				+ " calculando ela ir� mostrar o valor da  \n soma entre os valores escolhidos por voc�. Vamos come�ar? ");
		
		int soma = 0;
		int numero1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe um n�mero:"));
		String repetir = "";
		int opcao = 0;
	do {
		do {
			 opcao = Integer.parseInt(JOptionPane.showInputDialog("Qual opera��o voc� deseja usar?"
					+ "\n 1 = +"
					+ "\n 2 = - "
					+ "\n 3 =  * "
					+ "\n 4 = / "));
		}while (opcao > 4);
		
		
		int numero2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe um segundo n�mero:"));
	switch  (opcao) {
	case 1:
		soma = numero1 + numero2;
		JOptionPane.showMessageDialog(null, soma," Resultado", JOptionPane.INFORMATION_MESSAGE);
	 break;
	case 2:
		soma = numero1 - numero2;
		JOptionPane.showMessageDialog(null, soma," Resultado", JOptionPane.INFORMATION_MESSAGE);
	break;
	case 3:
		soma = numero1 * numero2;
		JOptionPane.showMessageDialog(null, soma," Resultado", JOptionPane.INFORMATION_MESSAGE);
	break;
	case 4:
		soma = numero1 / numero2;
		JOptionPane.showMessageDialog(null, soma," Resultado", JOptionPane.INFORMATION_MESSAGE);
	 break;
	 default:
		 JOptionPane.showMessageDialog(null,"Digito Inv�lido, tente novamente");
	 }
	 
	 repetir = JOptionPane.showInputDialog("Deseja Continuar?"
	    		+ "\n Digite S ou s para sim ou outro caractere para encerrar:");
	 numero1 = soma;
	}while (repetir.equals("S")||(repetir.equals("s")));
	
	JOptionPane.showMessageDialog(null, soma," Resultado", JOptionPane.INFORMATION_MESSAGE);		
	}
	
	}


