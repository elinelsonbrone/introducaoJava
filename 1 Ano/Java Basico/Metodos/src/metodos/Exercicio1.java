package metodos;

import javax.swing.JOptionPane;

public class Exercicio1 {

//Faça um programa que solicite o ano de nascimento de um usuário e seja mostrada a sua idade em 2021.
//Não é necessário considerar se o usuário já fez ou não aniversário. Um método deve ser criado para solicitar
//o ano de nascimento ao usuário e retorná-lo, e outro método deve ser criado para receber o ano de nascimento, 
//calcular a idade atual e mostrá-la.

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JOptionPane.showMessageDialog(null, "Olá, usuário. Neste programa iremos solicitar \n o ano de nascimento e "
				+ "mostrar a sua idade atual.");
		int nascimento = anoNascimento();
		calculaIdade(nascimento);
	}

	public static int anoNascimento() {
		int nascimento = Integer.parseInt(JOptionPane.showInputDialog("Qual o ano do seu nascimento?"));

		while (nascimento <= 0) {
			mostrarErroanoNascimento();
			nascimento = Integer.parseInt(JOptionPane.showInputDialog("Qual o ano do seu nascimento?"));
		}
		return nascimento;
	}

	public static void calculaIdade(int nascimento) {
		double idade = (2021 - nascimento);
		JOptionPane.showMessageDialog(null, " idade atual " + idade);

	}

	public static void mostrarErroanoNascimento() {
		JOptionPane.showMessageDialog(null, " O ano digitado é inválido ");
	}

}
