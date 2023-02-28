package lista2;

import javax.swing.JOptionPane;

public class Exercicio4 {

//4) Sabe-se que o latão é constituído de 70% de cobre e 30% de zinco. 
//Faça um programa que permita ao usuário informar uma quantidade de latão em quilos 
//e forneça o total de cobre e zinco necessários para fabricar essa quantidade.

	public static void main(String[] args) {
		double zinco = 0;
		double cobre = 0;
		double qtdlatao = 0;
		JOptionPane.showMessageDialog(null,"Olá usuário.\n Este programa foi desenvolvido com o objetivo de "
				+ "mostrar a \n quantidade necessária de materias para produzir um produto.");
		
		qtdlatao = Double.parseDouble(JOptionPane.showInputDialog("Informe a quantidade de latão."));
		
		cobre = qtdlatao * 0.7;
		zinco = qtdlatao * 0.3;
		
		JOptionPane.showMessageDialog(null, cobre, "Quantidade de Cobre", JOptionPane.INFORMATION_MESSAGE);
		JOptionPane.showMessageDialog(null, zinco, "Quantidade de zinco", JOptionPane.INFORMATION_MESSAGE);
	}
	}


