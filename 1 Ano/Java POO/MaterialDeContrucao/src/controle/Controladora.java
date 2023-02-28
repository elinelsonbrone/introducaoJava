package controle;

import javax.swing.JOptionPane;

import modelo.Loja;
import modelo.Produto;
import visualizacao.EntradaSaida;

public class Controladora {

private Loja loja = new Loja();	
	
	public void exibirMenu() {

		int opcao;

		do {
			opcao = EntradaSaida.solicitarOpcoes();

			switch (opcao) {
			case 0:
				/* Cadastro de produtos */
				
				int qtdProdutos = Integer.parseInt(JOptionPane.showInputDialog("Informe a quantidade de produtos para cadastro"));
				for(int i = 0; i < qtdProdutos; i++ ) {
					Produto produto = new Produto();
					produto.setCodigo(EntradaSaida.codigoProduto());
					produto.setDescricao(EntradaSaida.descricaoDoProduto());
					produto.setPreço(EntradaSaida.precoProduto());
					this.loja.cadastroDeProdutos(produto); /*Listando produtos cadastrados*/
					System.out.println("\nCodigo : " + produto.getCodigo() + "\nDescrição : " + produto.getDescricao() 
					+ "\nPreço : R$" + produto.getPreço());
				}
				

				break;

			case 1:
				
				
				break;
			case 2:
				break;
			case 3:
				break;
			case 4:
				break;
			case 5:
				break;
			case 6:
				break;
			case 7:
				EntradaSaida.exibeMsgEncerraPrograma();
				System.exit(0);
				break;
			}

		} while (opcao != 8);

	}

}
