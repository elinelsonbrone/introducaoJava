package controle;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.JOptionPane;

import modelo.Cupom;
import modelo.Loja;
import modelo.Produto;
import visualizacao.EntradaSaida;

public class Controladora {
	SimpleDateFormat formato = new SimpleDateFormat("dd 'de' MMMM 'de' yyyy '|' HH: mm:ss");
	private Loja loja = null;
	private Produto produto = new Produto();

	public void exibirMenu() {

		int qtdProdutoVendido;
		String codigoVenda;
		String codigo = "";
		double preco = 0;
		int opcao;

		do {
			opcao = EntradaSaida.solicitarOpcoes();

			switch (opcao) {
			case 0:
				this.loja = new Loja();

				codigo = EntradaSaida.codigoProduto("Código");
				preco = EntradaSaida.valorProduto();
				this.produto = new Produto();
				produto.setCodigo(codigo);
				produto.setDescricao(EntradaSaida.descricaoDoProduto());
				produto.setPreco(preco);
				loja.produtosCadastrados(produto);

				System.out.println("\nCódigo : " + produto.getCodigo() + "\nDescrição : " + produto.getDescricao()
						+ "\nPreço : " + produto.getPreco());

				break;

			case 1:
				/* Produtos cadastrados */

				if (loja == null) {
					EntradaSaida.exibirMsgError("Cadastrar");
				} else {
					String informacoes = loja.produtosCadastrados();
					EntradaSaida.exibirInformacoes(informacoes);
				}

				break;
			case 2:
				/* Adicionar ao estoque */

				if (loja == null) {
					EntradaSaida.exibirMsgError("Cadastrar");
				} else {
					codigo = EntradaSaida.codigo("código");
					int quantidade = EntradaSaida.qtdProduto();
					loja.adicionarProduto(codigo, quantidade);
				}

				break;
			case 3:
				/* Informacoes de estoque */
				if (loja == null) {
					EntradaSaida.exibirMsgError("Cadastrar");
				} else {
					String informacoes = loja.produtosEstoque();
					EntradaSaida.exibirEstoque(informacoes);
				}

				break;

			case 4:
				/* Venda */

				if (loja == null) {
					EntradaSaida.exibirMsgError("Cadastrar");
				} else {

					Date date = new Date();

					codigoVenda = EntradaSaida.codigo("código");

					boolean verifica = loja.validarProduto(codigoVenda);

					if (verifica == true) {
						qtdProdutoVendido = EntradaSaida.qtdProduto();
						boolean validaQuantidade = loja.validar(qtdProdutoVendido, codigoVenda);
						if (validaQuantidade) {
							JOptionPane.showMessageDialog(null, "Produto Insuficiente");

						} else {
							loja.venderProduto(codigoVenda, qtdProdutoVendido);
							Cupom cupom = new Cupom();

							cupom.setData(formato.format(date));
							cupom.setQuantidade(qtdProdutoVendido);
							cupom.setDescricao(EntradaSaida.descricaoDoProduto());
							double valorFinal = loja.somaVenda(preco, codigoVenda, qtdProdutoVendido);
							cupom.setValorTotal(valorFinal);
							loja.criarCupom(cupom);
							String CupomFiscal = loja.criarCupom();
							EntradaSaida.exibirCupomGeral(CupomFiscal);
						}

					}

				}

				break;

			case 5:

				if (loja == null) {
					EntradaSaida.exibirMsgError("Cadastrar");
				} else {

					String CupomFiscal = loja.criarCupom() + loja.valorTotalCupons();
					EntradaSaida.exibirCupomGeral(CupomFiscal);
					// double valorTotalNotas = loja.valorTotalCupons();
					// EntradaSaida.CupomGeral(valorTotalNotas);
				}
				break;
			case 6:
				EntradaSaida.exibeMsgEncerraPrograma();
				System.exit(0);

			}

		} while (opcao != 6);

	}

}
