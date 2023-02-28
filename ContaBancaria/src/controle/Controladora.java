package controle;

import visualizacao.EntradaSaida;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import modelo.Conta;
import modelo.Movimentacao;

public class Controladora {
	SimpleDateFormat formato = new SimpleDateFormat("dd 'de' MMMM 'de' yyyy '|' HH: mm:ss");

	public void exibirMenu() {

		int opcao;

		JOptionPane.showMessageDialog(null, "***** Banco Senai *****");

		Conta conta = new Conta();
		conta.setTitularDaConta(Conta.nomeDoTitular());
		conta.setTipo(Conta.tipoConta());
		conta.setSaldo(Conta.saldoDeposito());

		System.out.println("Nome:" + conta.getTitularDaConta());
		System.out.println("Tipo da conta:" + conta.getTipo());
		System.out.println("Valor da transação R$:" + conta.getSaldo());

		do {
			opcao = EntradaSaida.solicitaOpcao();

			switch (opcao) {

			case 0:
				// deposito

				double valor = EntradaSaida.valorMovimentacao();
				Date date = new Date();
				Movimentacao movimentacao = new Movimentacao();// criando o objeto movimentação e instanciando
				movimentacao.setValor(valor);
				movimentacao.setTipo("Depósito");
				movimentacao.setData(formato.format(date));
				conta.gerarMovimentacao(movimentacao);// armazenando as informações do objeto movimentacao
				conta.depositar(valor); // armazendo o valor no método depósitar.

				// System.out.println("\nvalor " + movimentacao.getValor() + "\n " +
				// movimentacao.getTipo() + "\n" + movimentacao.getData())

				break;

			case 1:
				// Saque

				valor = EntradaSaida.valorMovimentacao();
				if ((conta.getSaldo() - valor) > -1000) { // validação para limite de saques
					date = new Date();
					movimentacao = new Movimentacao();
					movimentacao.setValor(valor);
					movimentacao.setTipo("Saque");
					movimentacao.setData(formato.format(date));
					conta.gerarMovimentacao(movimentacao);// armazenando as informações do objeto movimentacao
					conta.sacar(valor); // armazenando o valor no método sacar.
				} else {
					EntradaSaida.limiteDeSaque();
				}

				break;
			case 2:

				// Saldo

				double saldo = conta.gSaldo();
				EntradaSaida.exibirSaldo(saldo);

				break;
			case 3:
				// Extrato de depósito

				String depositos = conta.ExtratoDeposito();
				EntradaSaida.exibirDeposito(depositos);

				break;
			case 4:
				// Extrato de Saque

				String sacado = conta.ExtratoSaques();
				EntradaSaida.exibirSaque(sacado);

				break;

			case 5:
				// Extrato geral da conta

				String informacoes = conta.gerarExtratoConta();
				EntradaSaida.exibirInfoConta(informacoes);

				break;
			case 6:

				EntradaSaida.encerrarPrograma();
				System.exit(0);

				break;

			}

		} while (opcao != 7);

	}

}
