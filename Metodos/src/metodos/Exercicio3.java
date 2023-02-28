package metodos;

import java.text.DecimalFormat;

import javax.swing.JOptionPane;

public class Exercicio3 {
//Faça um programa que a partir do valor de uma compra, faça o cálculo de um desconto para o usuário.
//O programa deve solicitar o valor total da compra por meio de um método, que deverá retorná-lo. 
//Um método deve ser criado para receber o valor da compra e mostrar o valor final com desconto, considerando:
//Até R$100 - sem desconto, o valor permanece o mesmo
//De R$100,01 a R$200 - desconto de 20%
//Acima de R$200 - desconto de 30%

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JOptionPane.showMessageDialog(null, "Olá usuário, neste programa iremos mostrar o calculo de \n desconto "
				+ "no valor de uma compra.");
		double valorFinal = 0;
		double valorTotal = 0;
		
		valorFinal = valorVenda(valorTotal);
		valorDesconto(valorFinal);
	}
	
	public static double valorVenda(double valorTotal) {
		double valorFinal = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe o valor total da venda"));
		while(valorFinal <=0) {
			mostrarErrovalor();
			valorFinal = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe o valor total da venda"));
		}
		return valorFinal;
		
	}
	public static void valorDesconto(double valorFinal) {
		DecimalFormat df = new DecimalFormat("0.00");
		
		if (valorFinal <= 100) {
			JOptionPane.showMessageDialog(null," O valor a pagar é: " + df.format(valorFinal));
		}else if(valorFinal >= 101.01 && valorFinal <= 200) {
			double valorfinalDesconto = (valorFinal * 20/100);
			valorfinalDesconto = valorFinal - valorfinalDesconto;
			JOptionPane.showMessageDialog(null," O valor a pagar com desconto de 20% é: " +df.format(valorfinalDesconto));
		}else {
			double valorfinalDesconto = (valorFinal * 30/100);
			valorfinalDesconto = valorFinal - valorfinalDesconto;
			JOptionPane.showMessageDialog(null," O valor a pagar com desconto de 30% é: " +df.format(valorfinalDesconto));
		}
		
	}
	
	public static void mostrarErrovalor() {
		JOptionPane.showMessageDialog(null, " O valor digitado é inválido! ");
	}
	
}


