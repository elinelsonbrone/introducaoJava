package metodos;

import javax.swing.JOptionPane;

public class Exercicio1 {

//Fa�a um programa que solicite o ano de nascimento de um usu�rio e seja mostrada a sua idade em 2021.
//N�o � necess�rio considerar se o usu�rio j� fez ou n�o anivers�rio. Um m�todo deve ser criado para solicitar
//o ano de nascimento ao usu�rio e retorn�-lo, e outro m�todo deve ser criado para receber o ano de nascimento, 
//calcular a idade atual e mostr�-la.

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JOptionPane.showMessageDialog(null, "Ol�, usu�rio. Neste programa iremos solicitar \n o ano de nascimento e "
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
		JOptionPane.showMessageDialog(null, " O ano digitado � inv�lido ");
	}

}
