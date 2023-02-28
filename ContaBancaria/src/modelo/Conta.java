package modelo;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Conta {

	private String titularDaConta;
	private String tipo;
	private double saldo;

	private ArrayList<Movimentacao> listaDeMovimentacao = new ArrayList<Movimentacao>();

	public String getTitularDaConta() {
		return titularDaConta;
	}

	public void setTitularDaConta(String titularDaConta) {
		this.titularDaConta = titularDaConta;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public ArrayList<Movimentacao> getListaDeMovimentacao() {

		return listaDeMovimentacao;
	}

	public void setListaDeMovimentacao(ArrayList<Movimentacao> listaDeMovimentacao) {
		this.listaDeMovimentacao = listaDeMovimentacao;
	}

	public void gerarMovimentacao(Movimentacao movimentacao) {
		listaDeMovimentacao.add(movimentacao);// m�todo que adicionar� o objeto no array

	}

	public static String nomeDoTitular() {
		return JOptionPane.showInputDialog(null, "Informe seu nome");

	}

	public static String tipoConta() {
		int tipoDaConta = Integer.parseInt(JOptionPane.showInputDialog(null,
				"Informe o tipo de conta que ira abrir: \nDigite: 1 - Poupan�a | 2 - Corrente"));

		while ((tipoDaConta != 1) && (tipoDaConta != 2)) {
			tipoDaConta = Integer.parseInt(JOptionPane.showInputDialog(null, "Tente novamente"));
		}

		if (tipoDaConta == (1)) {
			return " Poupan�a";
		} else {
			return " Corrente";
		}

	}

	public static double saldoDeposito() {
		return Double.parseDouble(JOptionPane.showInputDialog(null, "Informe o valor de dep�sito inicial"));
	}

	public void depositar(double valor) {
		saldo = saldo + valor;

	}

	public void sacar(double valor) {
		saldo = saldo - valor;

	}

	public double gSaldo() {
		return saldo;

	}

	public String ExtratoDeposito() { /* Informa��es de Dep�sito */
		String depositos = "";
		boolean verifica = false; // verificando se h� movimenta��o na conta

		for (int i = 0; i < listaDeMovimentacao.size(); i++) {
			if (listaDeMovimentacao.get(i).getTipo().equalsIgnoreCase("Dep�sito")) {
				verifica = true;
				depositos += "\n" + listaDeMovimentacao.get(i).getData();
				depositos += "\n R$ " + listaDeMovimentacao.get(i).getValor();

			}

		}

		if (verifica == true) {
			return depositos;
		} else {
			return "\nN�o h� movimenta��es";
		}

	}

	public String ExtratoSaques() { /* Informa��o de Saque */
		String sacado = "";
		boolean verifica = false;

		for (int i = 0; i < listaDeMovimentacao.size(); i++) {
			if (listaDeMovimentacao.get(i).getTipo().equalsIgnoreCase("Saque")) {
				verifica = true;
				sacado += "\n" + listaDeMovimentacao.get(i).getData();
				sacado += "\n - R$ " + listaDeMovimentacao.get(i).getValor();
			}

		}
		if (verifica == true) {
			return sacado;
		} else {
			return "\nN�o h� movimenta��es";
		}

	}

	public String gerarExtratoConta() { /* M�todo que recebe informa��es geral da conta. */

		String informacoes = " ";
		boolean verifica = false;
		/*
		 * informacoes += "\n************** Dados da Conta ************** " +
		 * "\nTitular:  " + titularDaConta + "\nTipo: " + tipo + " \nSaldo Atual: R$" +
		 * saldo + "\n ************** Movimenta��es **************\n";
		 */

		for (int i = 0; i < listaDeMovimentacao.size(); i++) {
			if (listaDeMovimentacao.get(i).getTipo().equalsIgnoreCase("Dep�sito")) {
				verifica = true;
				informacoes += "\n***** Dep�sito *****" + "\n" + listaDeMovimentacao.get(i).getData()
						+ "\n R$ " + listaDeMovimentacao.get(i).getValor();

			} else if (listaDeMovimentacao.get(i).getTipo().equalsIgnoreCase("Saque")) {
				verifica = true;
				informacoes += "\n***** Saques *****" + "\n" + listaDeMovimentacao.get(i).getData()
						+ "\n - R$ " + listaDeMovimentacao.get(i).getValor();
			}
		}

		if (verifica == true) {
			return informacoes;
		}

		return "\nN�o h� movimenta��es";

	}

}
