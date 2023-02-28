package lista2;

import java.text.DecimalFormat;

import javax.swing.JOptionPane;

public class Exercicio5 {

//Fa�a um programa que solicite alguns dados dos usu�rios que frequentam um clube.
//	O programa deve solicitar a idade, se a pessoa � fumante ou n�o (1- SIM, 2- N�O),
//seu sal�rio l�quido e h� quanto tempo frequenta o clube (em meses). O usu�rio dever� digitar �encerrar� 
//quando n�o tiver mais pessoas para registrar.  Como dados de sa�da, o programa deve exibir:
//	A m�dia das idades das pessoas;
//	A m�dia salarial das pessoas;
//	Quantos s�o fumantes e quantos n�o s�o fumantes;
//	A porcentagem de pessoas que frequentam o clube h� mais de 03 meses. 

	public static void main(String[] args) {

		JOptionPane.showMessageDialog(null, "Ol� usu�rio. Este programa tem como objetivo fazer um cadastro de uma \n"
				+ "quantidade de pessoas que frequentam um clube. Vamos come�ar?");
		DecimalFormat df = new DecimalFormat("#0.00");

		String retornar = "";

		double idade = 0;
		int Fumante = 0;
		double qtdeFumantes = 0;
		double qtdeUsuarios = 0;
		double NaoFumantes = 0;
		double FrequenciaUsuario = 0;
		double maistresmeses = 0;
		double somaIdade = 0;
		double salarioLiquido = 0;
		double mediaSalario = 0;
		double mediaIdade = 0;
		double porcentagem = 0;
        double somaSalario =0;
		do {
			
			qtdeUsuarios = qtdeUsuarios + 1;
			
           
				idade = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe sua idade:"));
				somaIdade = somaIdade + idade;
				
				while(idade <=0) {	
					idade = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe sua idade:"));
				}
			

			do {
				Fumante = Integer.parseInt(JOptionPane.showInputDialog(null, "Voc� � fumante? 1 - SIM, 2 -N�O:"));
				switch (Fumante) {
				case 1:
					qtdeFumantes = qtdeFumantes + 1;
					break;
				case 2:
					NaoFumantes = NaoFumantes + 1;
					break;
				default:
					JOptionPane.showMessageDialog(null, "Op��o inv�lida.");
					break;
				}
			} while ((Fumante == 1) && (Fumante == 2));

		
				salarioLiquido = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe o seu sal�rio:"));
				somaSalario = somaSalario + salarioLiquido;
				
			 while (salarioLiquido <= 0){
				 salarioLiquido = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe o seu sal�rio:"));  
			 }

			FrequenciaUsuario = Integer
					.parseInt(JOptionPane.showInputDialog(null, "A quantos meses voc� frequenta o clube?"));

			// criar um if FrequenciaUsuario > 3 soma um em maistresmeses, senao soma um em
			// menostresmeses
			if (FrequenciaUsuario > 3) {
				maistresmeses += 1;
				// JOptionPane.showMessageDialog(null, maistresmeses);
			} 
			

			retornar = JOptionPane.showInputDialog(
					"Ainda possui pessoas para o cadastro?" + " Digite outro para sim e encerrar para n�o.");

		} while (retornar.equals("encerrar") == false);
		// }while(!retornar.equals("encerrar"));

		porcentagem = (maistresmeses / qtdeUsuarios) * 100.0;

		mediaIdade = somaIdade /qtdeUsuarios;
		JOptionPane.showMessageDialog(null, mediaIdade, "M�dia de idade", JOptionPane.INFORMATION_MESSAGE);

		mediaSalario =  somaSalario /qtdeUsuarios ;
		JOptionPane.showMessageDialog(null, " M�dia salarial R$ " + df.format(mediaSalario));

		JOptionPane.showMessageDialog(null, qtdeFumantes, "Fumantes", JOptionPane.INFORMATION_MESSAGE);

		JOptionPane.showMessageDialog(null, NaoFumantes, "N�o fumantes:", JOptionPane.INFORMATION_MESSAGE);

		JOptionPane.showMessageDialog(null, porcentagem, "Usu�rios com mais de 3 meses no clube:",
				JOptionPane.INFORMATION_MESSAGE);

	}

}
