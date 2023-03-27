package visualizacao;

import javax.swing.JComboBox;
import javax.swing.JOptionPane;

public class EntradaSaida {

	public static int solicitarOpcoes() {

		String[] opcoes = { " Cadastrar produtos ", "  Produtos cadastrados ", " Adicionar ao Estoque ", " Estoque ",
				" Venda ", " Valor total ", " Sair " };
		JComboBox<String> menu = new JComboBox<String>(opcoes);
		JOptionPane.showConfirmDialog(null, menu, "Selecione a opção desejada", JOptionPane.OK_CANCEL_OPTION);
		return menu.getSelectedIndex();
	}


	public static String codigoProduto(String codigo) { //

		return JOptionPane.showInputDialog("Informe o " + codigo);
	}

	public static String codigo(String codigo) {

		return JOptionPane.showInputDialog("\nInforme o código do produto " + codigo);

	}

	public static int qtdProduto() {

		int qtdadeProduto = Integer
				.parseInt(JOptionPane.showInputDialog("Digite a quantidade de produtos para venda "));

		while (qtdadeProduto <= 0) {
			qtdadeProduto = Integer
					.parseInt(JOptionPane.showInputDialog("Digite a quantidade de produtos para venda "));
		}

		return qtdadeProduto;

	}

	public static String descricaoDoProduto() {
		String descProduto = JOptionPane.showInputDialog("Informe a descrição do produto");

		return descProduto;
	}

	public static void exibirInformacoes(String cadastrado) {
		JOptionPane.showMessageDialog(null, cadastrado, "Produtos Cadastrados", JOptionPane.INFORMATION_MESSAGE);
	}

	public static void exibirEstoque(String estoque) {
		JOptionPane.showMessageDialog(null, estoque, "Informações do estoque", JOptionPane.INFORMATION_MESSAGE);
	}

	public static void exibirCupom(String informacoes) {
		JOptionPane.showMessageDialog(null, informacoes, "Cupom Fiscal", JOptionPane.INFORMATION_MESSAGE);
	}

	public static void exibirCupomGeral(String infoCupons) {
		JOptionPane.showMessageDialog(null, infoCupons, "Cupom Fiscal", JOptionPane.INFORMATION_MESSAGE);
	}
	public static double valorProduto() {
		return Double.parseDouble(JOptionPane.showInputDialog(null, " Informe o valor do produto "));
	}

	public static void exibirMsgError(String mensagem) {
		JOptionPane.showMessageDialog(null, "Cadastrar Produto", mensagem, JOptionPane.ERROR_MESSAGE);

	}
	
	public static void exibeMsgEncerraPrograma() {
		JOptionPane.showMessageDialog(null, "O programa será encerrado");
	}

}
