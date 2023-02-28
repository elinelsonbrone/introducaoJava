package controle;

import javax.swing.JOptionPane;
import visualizacao.EntradaSaida;
import modelo.Carro;
import modelo.Fabrica;

public class Controladora {

	private Fabrica fabrica = null;

	public void exibeMenu() {
		int opcao;

		do {
			opcao = EntradaSaida.solicitaOpcao(); // Método responsável pela funcionalidade do meu Menu.

			switch (opcao) {

			case 0:
				this.fabrica = new Fabrica(); // mostrando a instancia atual da classe

				int qtdeCarros = EntradaSaida.solicitaQtdeCarros("carro");

				for (int i = 0; i < qtdeCarros; i++) { //
					Carro carro = new Carro(); // instanciando o objeto carro
					carro.setModelo(EntradaSaida.solicitarModelo("modelo ", (i + 1)));
					carro.setCor(EntradaSaida.solicitarCor());
					this.fabrica.fabricarCarro(carro);// mostrando a instancia atual e chamando o método fabaricarCarro
														// que usa o objeto carro como parâmetro
				}

				// JOptionPane.showMessageDialog(null, "Fabricar carros");
				break;
			case 1:

				if (fabrica == null) {
					EntradaSaida.fabricaCarros(); // verificar se o objeto carro foi construido

				} else {

					String modelo = EntradaSaida.modelo("");
					String cor = EntradaSaida.solicitarCor();
					fabrica.venderCarro(modelo, cor);
					JOptionPane.showMessageDialog(null, "Vender um carro");
				}

				break;

			case 2:
				if (fabrica == null) {
					EntradaSaida.fabricaCarros();

				} else {
					String informacoes = this.fabrica.infoCarros(); // mostrando as informacoes do obejto carro
					EntradaSaida.exibeInfoCarro(informacoes);// trazendo o método exibeInfoCarro com a variavel informação como prametro
					JOptionPane.showMessageDialog(null, "Ver informações do carro");
				}

				break;
			case 3:
				EntradaSaida.exibeMsgEncerraPrograma();
				System.exit(0);
				break;
			}

		} while (opcao != 4);

	}
}
