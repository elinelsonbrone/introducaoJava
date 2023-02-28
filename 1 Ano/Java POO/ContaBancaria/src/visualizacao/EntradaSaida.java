package visualizacao;

import javax.swing.JComboBox;
import javax.swing.JOptionPane;

public class EntradaSaida {

	public static int solicitaOpcao() { // M�todo que solicita a op��o do menu

		String[] opcoes = { " Dep�sitos ", " Saques ", " Saldo ", " Extrato de Dep�sito ", " Extrato de Saques",
				" Extrato geral ", " Sair " };
		JComboBox<String> menu = new JComboBox<String>(opcoes);
		JOptionPane.showConfirmDialog(null, menu, "Selecione a op��o desejada", JOptionPane.OK_CANCEL_OPTION);
		return menu.getSelectedIndex();
	}

	public static double valorMovimentacao() {
		return Double.parseDouble(JOptionPane.showInputDialog(null, "Informe o valor da movimenta��o"));
	}

	public static String tipoMovimentacao() {
		String tipo = JOptionPane.showInputDialog(null, "Informe o tipo de movimenta��o");

		return tipo;
	}

	public static void exibirSaldo(double saldo) {
		JOptionPane.showMessageDialog(null, " Saldo: R$ " + saldo);
	}

	public static void exibirDeposito(String depositos) {
		JOptionPane.showMessageDialog(null, " Dep�sito " + depositos);
	}

	public static void exibirSaque(String sacado) {
		JOptionPane.showMessageDialog(null, " Saque " + sacado);
	}

	public static void exibirInfoConta(String informacoes) {
		JOptionPane.showMessageDialog(null, "***** Movimenta��es *****\n " + informacoes);
	}

	public static void limiteDeSaque() {
		JOptionPane.showMessageDialog(null, "Limite excedido!");
	}

	public static void encerrarPrograma() {
		JOptionPane.showMessageDialog(null, "O programa ser� encerrado!");
	}

}
