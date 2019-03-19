package kmnbblj;

public class Movimentacao {
	
	private String descricao;
	public Movimentacao(String descricao, double valor) {
		super();
		this.descricao = descricao;
		this.valor = valor;
	}
	private double valor;
	
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
}
