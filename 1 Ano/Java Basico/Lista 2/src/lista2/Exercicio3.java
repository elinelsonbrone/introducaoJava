package lista2;

import javax.swing.JOptionPane;


public class Exercicio3 {

//Escreva um programa que leia um número inteiro e apresente um menu para o usuário escolher:
//1.	Verificar se o número é múltiplo de algum outro número (pedir ao usuário esse número);
//2.	Verificar se o número é par;
//3.	Verificar se o número está entre 0 e 1000;
//4.	Sair
//	Após as entradas de dados, deve ser mostrado ao usuário o resultado da respectiva opção escolhida,
//	e novamente o menu. Para a opção “4- Sair”, utilize System.exit(0);

	public static void main(String[] args) {
		JOptionPane.showMessageDialog(null, "Olá usuário. Este programa tem como objetivo apresentar \n" + "um menu.");
		int opcao;
		int numero;
		int multiplo;
        String retornar = "";
		numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um número inteiro:"));

		// Iniciando o menu
		do {
			opcao = Integer.parseInt(JOptionPane.showInputDialog("Selecione a opção desejada:"
					+ "\n 1 - Verificar se é multiplo:" + "\n 2 - Verificar se é um valor par:"
					+ "\n 3 - Verificar se está entre 0 e 1000" + "\n 4 - Sair: "));
			switch (opcao) {
			//verificar se o número é multiplo.
			case 1:
				multiplo = Integer.parseInt(JOptionPane.showInputDialog("Insira um número:"));
					if (numero % multiplo == 0) {
						JOptionPane.showMessageDialog(null, "É multiplo");
						
					}else {
						JOptionPane.showMessageDialog(null, "Não é multiplo.");
					}
				// Verificar se é valor par.
				break;
			case 2:
				if (numero % 2 == 0) {
					JOptionPane.showMessageDialog(null, "O número é par:");
				} else {
					JOptionPane.showMessageDialog(null, "O número não é par:");
				}
				break;
				//verificar se esta no intervalo
			case 3:
				if ((numero > 0) && (numero < 1000)) {
					JOptionPane.showMessageDialog(null, "O número se encontra nesse intervalo.");
				}else {
					JOptionPane.showMessageDialog(null, "Não se encontra no intervalo:");
				}
			break;
			// utilizar esse método para encerrar o programa.
			case 4:
				System.exit(0);
				
			break;
			default:
				JOptionPane.showMessageDialog(null, "Opção inválida.");
			break;
			}
			//perguntar se o usuário deseja retornar ao menu.
			
          retornar = JOptionPane.showInputDialog(" Deseja Voltar ao menu?"
          		+ " Digite S ou s para sim outro para não.");
		} while (retornar.equals("S")||(retornar.equals("s")));
	}

}
