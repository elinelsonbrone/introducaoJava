package modelo;

//servirá de referencia para as classes porta e janela. OT9

public abstract class Aberturas{
	//protected é usado na classe mae como este exemplo;
	protected String descricao;
	protected int estado;
	
	public String getDescricao() { //retornando o objeto.
		return descricao;
	}
	public void setDescricao(String descricao) {//acessando esse objeto
		this.descricao = descricao;
	}
	public int getEstado() {
		return estado;
	}
	public void setEstado(int estado) {
		this.estado = estado;
	}
	
}



