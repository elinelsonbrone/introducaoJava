package modelo;

import java.util.ArrayList;
import javax.swing.JOptionPane;
// 1� A fabrica deve receber um arraylist de carros
// 2� o m�todo fabricar carro n�o � static, porque?
// 3� o metodo fabricar carro, deve receber como par�metro um carro e deve adicionar esse carro no array

public class Fabrica {

	private ArrayList<Carro> listaDeCarros = new ArrayList<Carro>();// fazendo a instancia��o do listadeCarros no
																	// arraylist usando
																	// a classe Carro como parametro.

	public ArrayList<Carro> getListaDeCarros() {// m�todo para ler o array de carros e recuperar os carros e imprimir as
												// informacoes
		return listaDeCarros;
	}

	public void setListaDeCarros(ArrayList<Carro> listaDeCarros) {
		this.listaDeCarros = listaDeCarros;

	}

	public void fabricarCarro(Carro carro) {
		listaDeCarros.add(carro);// m�todo que adicionar� o objeto no array

	}

// parametros cor e modelo
	public void venderCarro(String cor, String modelo) {

		boolean verifica = false;

		for (int i = 0; i < listaDeCarros.size(); i++) { // percorrendo o array e verificando se h� o modelo de carro
															// escolhido
			Carro carro = listaDeCarros.get(i);// recebendo todos os modelos de carro disponiveis.

			if (carro.getCor().equals(cor) && carro.getModelo().equals(modelo)) {
				verifica = true;
				listaDeCarros.remove(carro);// m�todo responsavel pela remocao do item no array.

			}

		}
		if(verifica==true) {
			JOptionPane.showMessageDialog(null,"Carro Vendido");
		}else {
			JOptionPane.showMessageDialog(null, "Carro n�o existe");
		}

	}

	// JOptionPane.showMessageDialog(null, "O carro n�o existe");

	public String infoCarros() {// aplicando as informa�oes do carro
		String informacoes = "";
		for (Carro carro : this.listaDeCarros) {

			informacoes += "Modelo : " + carro.getModelo() + "\n";
			informacoes += "Cor : " + carro.getCor() + "\n";

		}

		return informacoes;
	}

}
