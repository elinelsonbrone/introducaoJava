package modelo;

import java.util.ArrayList;

public class Loja {
	
	private String codigo;
	private int quantidade;
	
	private ArrayList<Produto>listaDeProdutos = new ArrayList<Produto>();
	
	

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

	public ArrayList<Produto> getListaDeProdutos() {
		return listaDeProdutos;
	}

	public void setListaDeProdutos(ArrayList<Produto> listaDeProdutos) {
		this.listaDeProdutos = listaDeProdutos;
	}
	
	public void cadastroDeProdutos(Produto produto) {
		listaDeProdutos.add(produto);
	}

}
