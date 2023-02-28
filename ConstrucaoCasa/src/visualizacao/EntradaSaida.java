package visualizacao;

import java.util.ArrayList; //exibido na ot9

import javax.swing.JComboBox;//classe JComboBox (exibido na ot8)
import javax.swing.JOptionPane;

import modelo.Aberturas;

public class EntradaSaida {//ot8

	public static int solicitaOpcao() {// criação do método solicitaOpcao. -OT8
		// criando um array para armazenar as opcoes para usuário escolher.
	
			   String[] opcoes = { "Construir casa", "Movimentar portas ou janelas", " Ver informações da casa",
						"" + "Sair do programa" }; 
			// fazendo a instanciação do menu pela classe JComboBox do tipo Srtring e usuando como parametro
				// a variável OPCOES no método contrutor new.
			   JComboBox<String> menu = new JComboBox<String>(opcoes);
			   JOptionPane.showConfirmDialog(null, menu, "Selecione a opção desejada", JOptionPane.OK_CANCEL_OPTION);
				return menu.getSelectedIndex();// retorno do método getSelectedIndex() para menu. Utilizado somente com o uso
			 //da classe JComboBox
			        

	}

	public static void exibeMsgEncerraPrograma() { //OT8
		JOptionPane.showMessageDialog(null, "O programa será encerrado");
	}
//------------OT-9----------------
	public static String solicitaDescricao(String descricao, int ordem) {
		if (ordem == 0) {
			return JOptionPane.showInputDialog("Informe a descrição da " + descricao);

		} else {
			return JOptionPane.showInputDialog("" + ordem + " " + descricao);
		}
	}

	public static String solicitaCor() {
		return JOptionPane.showInputDialog("Informe a cor da casa");
	}

	public static int solicitaQtdeAberturas(String texto) { //mudei a variável
		int abertura = Integer.parseInt(JOptionPane.showInputDialog(" Informe a quantidade de " + texto));
		while (abertura <= 0) { //validação para aceitar somente numeros positivos e diferentes de 0.
			abertura = Integer.parseInt(JOptionPane.showInputDialog("Tente novamente!"));
		} 
		return abertura;
	}
	
	public static int solicitaEstado(String tipoAbertura) {
		String[] opcoes = { "Fechada", "Aberta" };
		

		return JOptionPane.showOptionDialog(null, "Informe o estado da " + tipoAbertura, "Estado",
				JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, opcoes, opcoes[1]);// opcoes[1]
																										// mostra a
																										// posição que
																										// comeca o
																										// vetor.

	}
//----- OT-10
	public static String solicitaTipoAbertura() {// método para onde o usuário informará o que deseja movimentar.
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
		int qtdeAbertura = listaDeAberturas.size();// o método size() mostra o tamanho da lista nos permitindo criar o string
													// descricoesAberturas.
		String[] descricoesAberturas = new String[qtdeAbertura];

		for (int i = 0; i < qtdeAbertura; i++) { // repetirar a qtdeAbertura e preencherá cada uma das posições do vetor
													// descricoesAberturas;
			descricoesAberturas[i] = listaDeAberturas.get(i).getDescricao();
		}

		String msg = "Escolha  a" + tipoAbertura + " a ser movimentada";
		JComboBox<String> exibicaoAberturas = new JComboBox<String>(descricoesAberturas);// Nos permitirar saber exatamente a posição da
																			// porta/janela que o usuario deseja
																			// movimentar. Teremos acesso a exatemente
																			// qual posição das opcoes o usuário selecionou.
		int confirmacao = JOptionPane.showConfirmDialog(null, exibicaoAberturas, msg, JOptionPane.OK_CANCEL_OPTION);
		if (confirmacao == 0) {
			return exibicaoAberturas.getSelectedIndex();// mostrar a posicao que o usario escolheu de 0 ou superior,
														// caso o usuário cancele, o getSelectedIndex() me retornara -1
														// que não é valida.
		} else {
			return -1;
		}
	}

	public static void exibeMsgAbertura() {
		JOptionPane.showMessageDialog(null, "Nenhuma abertura será movimentada");
	}

	public static void exibeInfoCasa(String informacoes) {
		JOptionPane.showMessageDialog(null, informacoes, "Informações da casa", JOptionPane.INFORMATION_MESSAGE);

	}
	
	public static void validaConstrucao() {//criando um método para
		
		JOptionPane.showMessageDialog(null,"A casa não foi construída!");
	}
}
