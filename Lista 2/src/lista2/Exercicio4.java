package lista2;

import javax.swing.JOptionPane;

public class Exercicio4 {

//4) Sabe-se que o lat�o � constitu�do de 70% de cobre e 30% de zinco. 
//Fa�a um programa que permita ao usu�rio informar uma quantidade de lat�o em quilos 
//e forne�a o total de cobre e zinco necess�rios para fabricar essa quantidade.

	public static void main(String[] args) {
		double zinco = 0;
		double cobre = 0;
		double qtdlatao = 0;
		JOptionPane.showMessageDialog(null,"Ol� usu�rio.\n Este programa foi desenvolvido com o objetivo de "
				+ "mostrar a \n quantidade necess�ria de materias para produzir um produto.");
		
		qtdlatao = Double.parseDouble(JOptionPane.showInputDialog("Informe a quantidade de lat�o."));
		
		cobre = qtdlatao * 0.7;
		zinco = qtdlatao * 0.3;
		
		JOptionPane.showMessageDialog(null, cobre, "Quantidade de Cobre", JOptionPane.INFORMATION_MESSAGE);
		JOptionPane.showMessageDialog(null, zinco, "Quantidade de zinco", JOptionPane.INFORMATION_MESSAGE);
	}
	}


