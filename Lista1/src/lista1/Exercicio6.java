//Crie uma calculadora que permita o cálculo de uma equação, sem limite de execuções definido, da seguinte maneira:
//1. Peça o primeiro valor ,
//2. Peça o cálculo que deseja fazer (entre as 4 operações básicas),
//3. Peça um segundo valor 
//4. Efetue o cálculo,
//5. Peça se o usuário quer continuar calculando. Se ele responder 
//que sim, volte para o passo 2 usando o resultado do cálculo da linha 4 como primeiro valor,
//e se disser que não, mostre o resultado final . 
//Exemplo de uso para o algoritmo: 4 + 3 = 7 x 4 = 28 / 14 = 2.



package lista1;

import javax.swing.JOptionPane;

public class Exercicio6 {
	
	public static void main(String[] args) {
		
		JOptionPane.showMessageDialog(null, "Olá usuário. Este programa foi desenvolvido com objetivo de mostrar uma calculadora"
				+ "\n pra  você usar todas as operações matemáticas quantas vezes achar necessário. \n Quando você não quiser continuar "
				+ " calculando ela irá mostrar o valor da  \n soma entre os valores escolhidos por você. Vamos começar? ");
		
		int soma = 0;
		int numero1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe um número:"));
		String repetir = "";
		int opcao = 0;
	do {
		do {
			 opcao = Integer.parseInt(JOptionPane.showInputDialog("Qual operação você deseja usar?"
					+ "\n 1 = +"
					+ "\n 2 = - "
					+ "\n 3 =  * "
					+ "\n 4 = / "));
		}while (opcao > 4);
		
		
		int numero2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe um segundo número:"));
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
		 JOptionPane.showMessageDialog(null,"Digito Inválido, tente novamente");
	 }
	 
	 repetir = JOptionPane.showInputDialog("Deseja Continuar?"
	    		+ "\n Digite S ou s para sim ou outro caractere para encerrar:");
	 numero1 = soma;
	}while (repetir.equals("S")||(repetir.equals("s")));
	
	JOptionPane.showMessageDialog(null, soma," Resultado", JOptionPane.INFORMATION_MESSAGE);		
	}
	
	}


