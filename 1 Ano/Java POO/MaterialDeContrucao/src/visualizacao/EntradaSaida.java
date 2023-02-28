package visualizacao;

import javax.swing.JComboBox;
import javax.swing.JOptionPane;

public class EntradaSaida {

	public static int solicitarOpcoes() {

		String[] opcoes = { " Cadastrar produtos ", " Produtos cadastrados ", " Estoque ", " Venda ",
				"Produtos em estoque", "Exibir cupom fical", "Valor total de Vendas ", " Sair " };
		JComboBox<String> menu = new JComboBox<String>(opcoes);
		JOptionPane.showConfirmDialog(null, menu, "Selecione a op��o desejada" , JOptionPane.OK_CANCEL_OPTION );
		return menu.getSelectedIndex();
	}
	
	public static void exibeMsgEncerraPrograma() {
		JOptionPane.showMessageDialog(null, "O programa ser� encerrado");
	}
	
	public static String codigoProduto() {
		String codigoP = JOptionPane.showInputDialog("Informe o c�digo do produto");
		
		return codigoP;
	}
	
	public static String descricaoDoProduto() {
		String descProduto = JOptionPane.showInputDialog("Informe a descr��o do produto");
		
		return descProduto;
	}
	
	public static double precoProduto() {
		double valor = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o pre�o do produto"));
		
		return valor;
	}


}
