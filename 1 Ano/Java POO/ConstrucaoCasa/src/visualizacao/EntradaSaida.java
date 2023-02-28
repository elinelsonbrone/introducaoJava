package visualizacao;

import java.util.ArrayList; //exibido na ot9

import javax.swing.JComboBox;//classe JComboBox (exibido na ot8)
import javax.swing.JOptionPane;

import modelo.Aberturas;

public class EntradaSaida {//ot8

	public static int solicitaOpcao() {// cria��o do m�todo solicitaOpcao. -OT8
		// criando um array para armazenar as opcoes para usu�rio escolher.
	
			   String[] opcoes = { "Construir casa", "Movimentar portas ou janelas", " Ver informa��es da casa",
						"" + "Sair do programa" }; 
			// fazendo a instancia��o do menu pela classe JComboBox do tipo Srtring e usuando como parametro
				// a vari�vel OPCOES no m�todo contrutor new.
			   JComboBox<String> menu = new JComboBox<String>(opcoes);
			   JOptionPane.showConfirmDialog(null, menu, "Selecione a op��o desejada", JOptionPane.OK_CANCEL_OPTION);
				return menu.getSelectedIndex();// retorno do m�todo getSelectedIndex() para menu. Utilizado somente com o uso
			 //da classe JComboBox
			        

	}

	public static void exibeMsgEncerraPrograma() { //OT8
		JOptionPane.showMessageDialog(null, "O programa ser� encerrado");
	}
//------------OT-9----------------
	public static String solicitaDescricao(String descricao, int ordem) {
		if (ordem == 0) {
			return JOptionPane.showInputDialog("Informe a descri��o da " + descricao);

		} else {
			return JOptionPane.showInputDialog("" + ordem + " " + descricao);
		}
	}

	public static String solicitaCor() {
		return JOptionPane.showInputDialog("Informe a cor da casa");
	}

	public static int solicitaQtdeAberturas(String texto) { //mudei a vari�vel
		int abertura = Integer.parseInt(JOptionPane.showInputDialog(" Informe a quantidade de " + texto));
		while (abertura <= 0) { //valida��o para aceitar somente numeros positivos e diferentes de 0.
			abertura = Integer.parseInt(JOptionPane.showInputDialog("Tente novamente!"));
		} 
		return abertura;
	}
	
	public static int solicitaEstado(String tipoAbertura) {
		String[] opcoes = { "Fechada", "Aberta" };
		

		return JOptionPane.showOptionDialog(null, "Informe o estado da " + tipoAbertura, "Estado",
				JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, opcoes, opcoes[1]);// opcoes[1]
																										// mostra a
																										// posi��o que
																										// comeca o
																										// vetor.

	}
//----- OT-10
	public static String solicitaTipoAbertura() {// m�todo para onde o usu�rio informar� o que deseja movimentar.
		String[] opcoes = { "Porta", "Janela" };

		int tipoAbertura = JOptionPane.showOptionDialog(null, "Informe qual tipo de abertura deseja mover",
				"Mover abertura", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, opcoes, opcoes[0]);
		if (tipoAbertura == 0) {
			return "porta";
		} else {
			return "janela";
		}
	}

	public static int solicitaAberturaMover(ArrayList<Aberturas> listaDeAberturas) {// o metodo usa como parametro
																					// ArrayList<Aberturas> para
																					// localizar os objetos na classe
																					// casa.
		String tipoAbertura = listaDeAberturas.get(0).getClass().getName();//getName percorre todo o caminho da classe.
		tipoAbertura = tipoAbertura.replaceAll("modelo.", "");// replaceAll utilizamos para substituir o modelo.
																// sobrando a Porta e a Janela.
		int qtdeAbertura = listaDeAberturas.size();// o m�todo size() mostra o tamanho da lista nos permitindo criar o string
													// descricoesAberturas.
		String[] descricoesAberturas = new String[qtdeAbertura];

		for (int i = 0; i < qtdeAbertura; i++) { // repetirar a qtdeAbertura e preencher� cada uma das posi��es do vetor
													// descricoesAberturas;
			descricoesAberturas[i] = listaDeAberturas.get(i).getDescricao();
		}

		String msg = "Escolha  a" + tipoAbertura + " a ser movimentada";
		JComboBox<String> exibicaoAberturas = new JComboBox<String>(descricoesAberturas);// Nos permitirar saber exatamente a posi��o da
																			// porta/janela que o usuario deseja
																			// movimentar. Teremos acesso a exatemente
																			// qual posi��o das opcoes o usu�rio selecionou.
		int confirmacao = JOptionPane.showConfirmDialog(null, exibicaoAberturas, msg, JOptionPane.OK_CANCEL_OPTION);
		if (confirmacao == 0) {
			return exibicaoAberturas.getSelectedIndex();// mostrar a posicao que o usario escolheu de 0 ou superior,
														// caso o usu�rio cancele, o getSelectedIndex() me retornara -1
														// que n�o � valida.
		} else {
			return -1;
		}
	}

	public static void exibeMsgAbertura() {
		JOptionPane.showMessageDialog(null, "Nenhuma abertura ser� movimentada");
	}

	public static void exibeInfoCasa(String informacoes) {
		JOptionPane.showMessageDialog(null, informacoes, "Informa��es da casa", JOptionPane.INFORMATION_MESSAGE);

	}
	
	public static void validaConstrucao() {//criando um m�todo para
		
		JOptionPane.showMessageDialog(null,"A casa n�o foi constru�da!");
	}
}
