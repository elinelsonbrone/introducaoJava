package modelo;
import java.util.ArrayList;//importando a classe arraylist -OT9

public class Casa { //classe concreta o private;-OT9
	
	private String descricao;//atributos da classe casa
	private String cor;
	//instanciando os objetos listadePortas e listadejanelas com a classe arrayList e usando como parametro a classe abstrata Aberturas.
	//arrayList é uma classe do tipo generico que usa o object como parametro.
	private ArrayList<Aberturas> listaDePortas = new ArrayList<Aberturas>();
	private ArrayList<Aberturas> listaDeJanelas = new ArrayList<Aberturas>();
	
	public String getDescricao() {//consultado o estado do objeto e retornando essas informacoes
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;//modificando o estado do objeto, e alterando os campos de instancia.
	}
	
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	//criando o método ListaDePortas do tipo ArrayList que usa como parametro a classe abstrata aberturas
	public ArrayList<Aberturas> getListaDePortas(){
		
		return listaDePortas;//o objeto ListaDeportas retorna para o método getListaDePortas().
		
	}
	public void setListaDePortas(ArrayList<Aberturas> listaDePortas) {
		this.listaDePortas = listaDePortas;
		
	}
	public ArrayList<Aberturas> getListaDeJanelas(){
		return listaDeJanelas;
		
	}
	public void setListaDeJanelas(ArrayList<Aberturas> listaDeJanelas) {//OT-9
		this.listaDeJanelas = listaDeJanelas;
	}
	public void constroiCasa(String descricao, String cor, ArrayList<Aberturas> listaDePortas,
			ArrayList<Aberturas> listaDeJanelas) { //ot9 método responsavel por gurardar as informacoes de entrada.
		setDescricao(descricao);
		setCor(cor);
		setListaDePortas(listaDePortas);
		setListaDeJanelas(listaDeJanelas);	
	}
	public Aberturas retornaAbertura(int posicao, String tipoAbertura) {//método recebe como parametro a posição do objeto
		if(tipoAbertura.equals("porta")) {                               //a ser retornado o tipo de abertura, para que seja possível acessar a lista correta, retornando o objeto daquela posição.
			return this.listaDePortas.get(posicao);
		}else {
			return this.listaDeJanelas.get(posicao);
		}
	}
	public void moverAbertura(Aberturas abertura, int novoEstado) {
		abertura.setEstado(novoEstado);//método que exibe as descrições das janelas ou portas, facilitando a escolha do usuário.
		
	}
	public String geraInfoCasa() {
		
		String informacoes="Descrição: "+this.descricao+"\nCor: "+this.cor+"\nLista de portas:\n";
		String estadoAbertura =""; //criei a variável para receber o estado da porta/janela
		
		for(Aberturas abertura:this.listaDePortas) {
			int estado = abertura.getEstado();
			if (estado==0) {//verificando o estado porta escolhido pelo usuário. 
				estadoAbertura = "Fechado";
			} else {
				estadoAbertura = "Aberto";
			}
			informacoes+=abertura.getDescricao()+"Estado: "+estadoAbertura+"\n";
		}
		
		informacoes+="\nLista de janelas:\n";
		
		for(Aberturas abertura:this.listaDeJanelas) {
			int estado = abertura.getEstado();
			if(estado==0) {//verificando o estado Janela escolhido pelo usuário. 
				estadoAbertura="Fechado";
			}else {
				estadoAbertura="Aberto";
			}
			
			informacoes+=abertura.getDescricao()+"Estado: "+estadoAbertura+"\n";
		}
		
		return informacoes;
	}
	
	
	
	
	
	
}
