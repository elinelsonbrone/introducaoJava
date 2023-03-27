package modelo;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Loja {

	private String codigo;
	private int quantidade;
	private String descricao;
	

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	private ArrayList<Produto> listaDeProdutos = new ArrayList<Produto>();
	private ArrayList<Cupom> listaDeCupons = new ArrayList<Cupom>();

	public ArrayList<Produto> getListaDeProdutos() {
		return listaDeProdutos;
	}

	public void setListaDeProdutos(ArrayList<Produto> listaDeProdutos) {
		this.listaDeProdutos = listaDeProdutos;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public ArrayList<Cupom> getListaDeCupons() {
		return listaDeCupons;
	}

	public void setListaDeCupons(ArrayList<Cupom> listaDeCupons) {
		this.listaDeCupons = listaDeCupons;
	}

	public void produtosCadastrados(Produto produto) {
		listaDeProdutos.add(produto);
	}

	public void criarCupom(Cupom cupom) {
		listaDeCupons.add(cupom);
	}

	public void adicionarProduto(String codigo, int quantidade) {

		boolean validar = false;

		for (int i = 0; i < listaDeProdutos.size(); i++) {

			Produto produto = this.listaDeProdutos.get(i);
			if (produto.getCodigo().equals(codigo)) {
				validar = true;
				produto.setQuantidade(produto.getQuantidade() + quantidade);

			}

		}

		if (validar == true) {
			JOptionPane.showMessageDialog(null, "Produto Adicionado");
		} else {
			JOptionPane.showMessageDialog(null, "Quantidade de produtos Insuficiente");
		}

	}

	public String produtosCadastrados() {

		String informacoes = "";

		for (Produto produto : this.listaDeProdutos) {
			informacoes += "\n Informações de Cadastro\n";
			informacoes += "\nCódigo : " + produto.getCodigo();
			informacoes += "\nDescricao : " + produto.getDescricao();
			informacoes += "\nValor:" + produto.getPreco();

		}

		return informacoes;

	}

	public String produtosEstoque() {

		String informacoes = "";

		for (Produto produto : this.listaDeProdutos) {
			informacoes += "\n Informações de Estoque\n";
			informacoes += "\nCódigo : " + produto.getCodigo();
			informacoes += "\nDescricao : " + produto.getDescricao();
			informacoes += "\nValor R$ : " + produto.getPreco();
			informacoes += "\nQuantidade : " + produto.getQuantidade();

		}

		return informacoes;

	}

	public boolean validarProduto(String codigoProduto) {

		boolean verifica = false;

		for (int i = 0; i < listaDeProdutos.size(); i++) {

			Produto produto = this.listaDeProdutos.get(i);

			if (produto.getCodigo().equals(codigoProduto)) {
				verifica = true;
			}

		}
		return verifica;

	}

	public boolean validar(int qtdProdutoVendido, String codigoVenda) {

		boolean vericaEstoque = false;

		for (int i = 0; i < listaDeProdutos.size(); i++) {

			Produto produto = this.listaDeProdutos.get(i);
			int quantEstoque = qtdProdutoVendido - produto.getQuantidade();

			if ((quantEstoque > 0) && (produto.getCodigo().equals(codigoVenda))) {

				vericaEstoque = true;
			}
		}

		return vericaEstoque;

	}

	public String venderProduto(String codigoVenda, int qtdProdutoVendido) {

		String infoVenda = "";

		for (int i = 0; i < listaDeProdutos.size(); i++) {

			Produto produto = listaDeProdutos.get(i);

			if (codigoVenda.equals(produto.getCodigo())) {

				produto.setQuantidade(produto.getQuantidade() - qtdProdutoVendido);

			}

		}

		return infoVenda;

	}

	public double somaVenda(double valor, String codigoVenda, int qtdProdutoVendido) {

		double valorTotal = 0;

		for (int i = 0; i < listaDeProdutos.size(); i++) {

			Produto produto = this.listaDeProdutos.get(i);
			if (produto.getCodigo().equals(codigoVenda)) {
				valorTotal = produto.getPreco() * qtdProdutoVendido;
			}

		}

		return valorTotal;

	}

	public String criarCupom() {

		String infoCupons = "";

		for (int i = 0; i < listaDeCupons.size(); i++) {

			infoCupons += "\n ------------------------------------------------------\n";

			infoCupons += "\nData: " + listaDeCupons.get(i).getData() + "\nDescrição: "
					+ listaDeCupons.get(i).getDescricao() + "\nQuantidade : " + listaDeCupons.get(i).getQuantidade()
					+ "\nValor : R$ " + listaDeCupons.get(i).getValorTotal();

			infoCupons += "\n ------------------------------------------------------\n";
		}
		return infoCupons;

	}

	public double valorTotalCupons() {
		double valorTotalNotas = 0;

		for (int i = 0; i < listaDeCupons.size(); i++) {

			Cupom cupom = listaDeCupons.get(i);

			valorTotalNotas += cupom.getValorTotal();

		}
		return valorTotalNotas;
	}

}
