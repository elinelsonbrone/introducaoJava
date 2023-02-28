package visualizacao;

import javax.swing.JComboBox;
import javax.swing.JOptionPane;

public class EntradaSaida {

	public static int solicitaOpcao() { // Método que solicita a opção do menu

		String[] opcoes = { " Depósitos ", " Saques ", " Saldo ", " Extrato de Depósito ", " Extrato de Saques",
				" Extrato geral ", " Sair " };
		JComboBox<String> menu = new JComboBox<String>(opcoes);
		JOptionPane.showConfirmDialog(null, menu, "Selecione a opção desejada", JOptionPane.OK_CANCEL_OPTION);
		return menu.getSelectedIndex();
	}

	public static double valorMovimentacao() {
		return Double.parseDouble(JOptionPane.showInputDialog(null, "Informe o valor da movimentação"));
	}

	public static String tipoMovimentacao() {
		String tipo = JOptionPane.showInputDialog(null, "Informe o tipo de movimentação");

		return tipo;
	}

	public static void exibirSaldo(double saldo) {
		JOptionPane.showMessageDialog(null, " Saldo: R$ " + saldo);
	}

	public static void exibirDeposito(String depositos) {
		JOptionPane.showMessageDialog(null, " Depósito " + depositos);
	}

	public static void exibirSaque(String sacado) {
		JOptionPane.showMessageDialog(null, " Saque " + sacado);
	}

	public static void exibirInfoConta(String informacoes) {
		JOptionPane.showMessageDialog(null, "***** Movimentações *****\n " + informacoes);
	}

	public static void limiteDeSaque() {
		JOptionPane.showMessageDialog(null, "Limite excedido!");
	}

	public static void encerrarPrograma() {
		JOptionPane.showMessageDialog(null, "O programa será encerrado!");
	}

}
