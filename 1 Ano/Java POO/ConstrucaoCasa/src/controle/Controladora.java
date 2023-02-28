//classe responsável no recebimento das solicitações
//receber os retornos, encaminhar as classes responsáveis por atendel-as
//Ela funciona como uma ponte entre as classes do pacote Modelo
//e as classes do pacote visualização.

package controle;
import java.util.ArrayList;

import javax.swing.JOptionPane;
import visualizacao.EntradaSaida; //implementado o pacote visualizacao e a classe EntradaSaida
import modelo.*;//implementado o pacote modelo e suas classes.

public class Controladora{
	
	private Casa casa = null; //criando o objeto casa que inicialmente recebe vazio.
	
	public void exibeMenu() { //implementação do método exibeMenu();
		int opcao=0;
	
		do {
			opcao = EntradaSaida.solicitaOpcao(); //atribuindo a variável opcao o método solicitaOpcao().
			
			
			switch(opcao) {
			
			
			case 0: 
				//OT9

				this.casa = new Casa();//fazendo a instanciação da classe casa que tem o método Casa() originário na classe Casa. Antes o atributo casa era vazio agora ele recebe todas
				// as informações da classe Casa.
				
				String descricao = EntradaSaida.solicitaDescricao("casa ",0); //implementado valores na variável descricao vindas da classe EntradaSaida 
				//do método solicitaDescricao(); Esse método nos servirá tanto para retornar a descrição da casa como de nossas portas ou janelas e para que possamos reaproveitá-lo.
				String cor = EntradaSaida.solicitaCor(); //assim como a variavel descricao a variavel cor recebe valores adivindos da mesma classe e do,
				//metodo solicitaCor
				
			    int qtdePortas = EntradaSaida.solicitaQtdeAberturas("porta");//porta
				int qtdeJanelas = EntradaSaida.solicitaQtdeAberturas("janela");// janela
				
				ArrayList<Aberturas> listaDePortas = new ArrayList<Aberturas>(); //declaração do arrayList do tipo abertura que vai receber cada uma das portas e janelas cadastradas.
				
				for(int i=0; i<qtdePortas; i++) {
					Porta porta = new Porta(); // objeto porta, onde passaremos os valores para seus atributos descricao e estado.
					porta.setDescricao(EntradaSaida.solicitaDescricao("porta",(i+1)));// passando os valores atraves da classe EntradaSaida que retorna a descricao e o estado informados pelo usuário
					porta.setEstado(EntradaSaida.solicitaEstado("porta"));
					listaDePortas.add(porta);//o objeto porta criado e valorado é adicionado ao ArrayList.
				}
				
				ArrayList<Aberturas> listaDeJanelas = new ArrayList<Aberturas>();  
				
				for (int i=0; i<qtdeJanelas; i++) {
					Janela janela = new Janela();
					janela.setDescricao(EntradaSaida.solicitaDescricao("janela",(i+1)));
					janela.setEstado(EntradaSaida.solicitaEstado("janela"));
					listaDeJanelas.add(janela);
				}
				this.casa.constroiCasa(descricao, cor, listaDePortas, listaDeJanelas);//Guardando os objetos de entrada-ot9
				
				System.out.println("Descrição da casa: "+ casa.getDescricao()+"\n");
				System.out.println("Cor da casa: "+casa.getCor()+"\n");
				
				for(Aberturas porta : casa.getListaDePortas()) {//ot9
					System.out.println("Descrição da porta: "+porta.getDescricao()+"\n");
					System.out.println("Estado da porta: "+porta.getEstado()+"\n");
			
				}
				//Aberturas janela - o que queremos procurar -OT
				//casa.getListaDeJanelas()) - a lista onde vamos procurar.
				for(Aberturas janela : casa.getListaDeJanelas()) { //usando for each para lista de objetos para percorrer de forma mais simplificada
					System.out.println("Descrição da janela: "+janela.getDescricao()+"\n");
					System.out.println("Estado da janela: "+janela.getEstado()+"\n");
			
				}
				
				
				JOptionPane.showMessageDialog(null, "Construir casa");
				break;
			case 1:
				if(casa==null) {//verificando se a casa foi construida.
				EntradaSaida.validaConstrucao();
					
				}else {//OT10
					String tipoAbertura = EntradaSaida.solicitaTipoAbertura();//pedindo para o usuário qual porta/janela ele pretende mudar o estado e pedir o novo estado
					
					ArrayList<Aberturas> listaDeAberturas = new ArrayList<>();
					
					if(tipoAbertura.equals("porta")) {
						listaDeAberturas = this.casa.getListaDePortas();//buscando a lista de todas as portas e salvamos na listaDeAberturas	
					}else {
						listaDeAberturas = this.casa.getListaDeJanelas();
					}
					
					int posicao = EntradaSaida.solicitaAberturaMover(listaDeAberturas);//solicita a mudanca de estado da porta/janela.
					int novoEstado=0;
					
					if(posicao!= -1) {//fazendo a verificação se o psoição é válida para entao sabermos o estado da porta/janela
						novoEstado = EntradaSaida.solicitaEstado(tipoAbertura);
						Aberturas abertura = this.casa.retornaAbertura(posicao, tipoAbertura);//retornará o objeto port/janela, ou seja, a abertura a ser movimentada
						this.casa.moverAbertura(abertura, novoEstado);	
						System.out.println("Novo estado da "+tipoAbertura+": "+abertura.getEstado());
					}else {
						EntradaSaida.exibeMsgAbertura();
					}
					
					JOptionPane.showMessageDialog(null," Movimentar portas ou janela");
				}
				
				break;
			case 2:
				if(casa==null) {
					EntradaSaida.validaConstrucao();
					
				}else {
					String informacoes=this.casa.geraInfoCasa();
					EntradaSaida.exibeInfoCasa(informacoes);
					JOptionPane.showMessageDialog(null,"Ver informações da casa");
				}
				
				break;
				
			}

		
		}while(opcao!=3);
		
		
		EntradaSaida.exibeMsgEncerraPrograma();//chamando o método exibeMsgEncerrarPrograma() que se encontra na classe EntradaSaida
		
		System.exit(0);
		
	}
	
}