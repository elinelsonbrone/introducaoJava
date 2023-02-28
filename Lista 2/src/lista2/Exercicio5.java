package lista2;

import java.text.DecimalFormat;

import javax.swing.JOptionPane;

public class Exercicio5 {

//Faça um programa que solicite alguns dados dos usuários que frequentam um clube.
//	O programa deve solicitar a idade, se a pessoa é fumante ou não (1- SIM, 2- NÃO),
//seu salário líquido e há quanto tempo frequenta o clube (em meses). O usuário deverá digitar “encerrar” 
//quando não tiver mais pessoas para registrar.  Como dados de saída, o programa deve exibir:
//	A média das idades das pessoas;
//	A média salarial das pessoas;
//	Quantos são fumantes e quantos não são fumantes;
//	A porcentagem de pessoas que frequentam o clube há mais de 03 meses. 

	public static void main(String[] args) {

		JOptionPane.showMessageDialog(null, "Olá usuário. Este programa tem como objetivo fazer um cadastro de uma \n"
				+ "quantidade de pessoas que frequentam um clube. Vamos começar?");
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
				Fumante = Integer.parseInt(JOptionPane.showInputDialog(null, "Você é fumante? 1 - SIM, 2 -NÃO:"));
				switch (Fumante) {
				case 1:
					qtdeFumantes = qtdeFumantes + 1;
					break;
				case 2:
					NaoFumantes = NaoFumantes + 1;
					break;
				default:
					JOptionPane.showMessageDialog(null, "Opção inválida.");
					break;
				}
			} while ((Fumante == 1) && (Fumante == 2));

		
				salarioLiquido = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe o seu salário:"));
				somaSalario = somaSalario + salarioLiquido;
				
			 while (salarioLiquido <= 0){
				 salarioLiquido = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe o seu salário:"));  
			 }

			FrequenciaUsuario = Integer
					.parseInt(JOptionPane.showInputDialog(null, "A quantos meses você frequenta o clube?"));

			// criar um if FrequenciaUsuario > 3 soma um em maistresmeses, senao soma um em
			// menostresmeses
			if (FrequenciaUsuario > 3) {
				maistresmeses += 1;
				// JOptionPane.showMessageDialog(null, maistresmeses);
			} 
			

			retornar = JOptionPane.showInputDialog(
					"Ainda possui pessoas para o cadastro?" + " Digite outro para sim e encerrar para não.");

		} while (retornar.equals("encerrar") == false);
		// }while(!retornar.equals("encerrar"));

		porcentagem = (maistresmeses / qtdeUsuarios) * 100.0;

		mediaIdade = somaIdade /qtdeUsuarios;
		JOptionPane.showMessageDialog(null, mediaIdade, "Média de idade", JOptionPane.INFORMATION_MESSAGE);

		mediaSalario =  somaSalario /qtdeUsuarios ;
		JOptionPane.showMessageDialog(null, " Média salarial R$ " + df.format(mediaSalario));

		JOptionPane.showMessageDialog(null, qtdeFumantes, "Fumantes", JOptionPane.INFORMATION_MESSAGE);

		JOptionPane.showMessageDialog(null, NaoFumantes, "Não fumantes:", JOptionPane.INFORMATION_MESSAGE);

		JOptionPane.showMessageDialog(null, porcentagem, "Usuários com mais de 3 meses no clube:",
				JOptionPane.INFORMATION_MESSAGE);

	}

}
