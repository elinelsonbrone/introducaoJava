package lista2;

import javax.swing.JOptionPane;


public class Exercicio3 {

//Escreva um programa que leia um n�mero inteiro e apresente um menu para o usu�rio escolher:
//1.	Verificar se o n�mero � m�ltiplo de algum outro n�mero (pedir ao usu�rio esse n�mero);
//2.	Verificar se o n�mero � par;
//3.	Verificar se o n�mero est� entre 0 e 1000;
//4.	Sair
//	Ap�s as entradas de dados, deve ser mostrado ao usu�rio o resultado da respectiva op��o escolhida,
//	e novamente o menu. Para a op��o �4- Sair�, utilize System.exit(0);

	public static void main(String[] args) {
		JOptionPane.showMessageDialog(null, "Ol� usu�rio. Este programa tem como objetivo apresentar \n" + "um menu.");
		int opcao;
		int numero;
		int multiplo;
        String retornar = "";
		numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um n�mero inteiro:"));

		// Iniciando o menu
		do {
			opcao = Integer.parseInt(JOptionPane.showInputDialog("Selecione a op��o desejada:"
					+ "\n 1 - Verificar se � multiplo:" + "\n 2 - Verificar se � um valor par:"
					+ "\n 3 - Verificar se est� entre 0 e 1000" + "\n 4 - Sair: "));
			switch (opcao) {
			//verificar se o n�mero � multiplo.
			case 1:
				multiplo = Integer.parseInt(JOptionPane.showInputDialog("Insira um n�mero:"));
					if (numero % multiplo == 0) {
						JOptionPane.showMessageDialog(null, "� multiplo");
						
					}else {
						JOptionPane.showMessageDialog(null, "N�o � multiplo.");
					}
				// Verificar se � valor par.
				break;
			case 2:
				if (numero % 2 == 0) {
					JOptionPane.showMessageDialog(null, "O n�mero � par:");
				} else {
					JOptionPane.showMessageDialog(null, "O n�mero n�o � par:");
				}
				break;
				//verificar se esta no intervalo
			case 3:
				if ((numero > 0) && (numero < 1000)) {
					JOptionPane.showMessageDialog(null, "O n�mero se encontra nesse intervalo.");
				}else {
					JOptionPane.showMessageDialog(null, "N�o se encontra no intervalo:");
				}
			break;
			// utilizar esse m�todo para encerrar o programa.
			case 4:
				System.exit(0);
				
			break;
			default:
				JOptionPane.showMessageDialog(null, "Op��o inv�lida.");
			break;
			}
			//perguntar se o usu�rio deseja retornar ao menu.
			
          retornar = JOptionPane.showInputDialog(" Deseja Voltar ao menu?"
          		+ " Digite S ou s para sim outro para n�o.");
		} while (retornar.equals("S")||(retornar.equals("s")));
	}

}
