package kmnbblj;

import java.util.ArrayList;

public class Conta {
	private int numero;
	private double saldo=0.0 ,limiteSaque = 300;
	private Cliente cliente;
	private Agencia agencia;
	
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	public Agencia getAgencia() {
		return agencia;
	}
	public void setAgencia(Agencia agencia) {
		this.agencia = agencia;
	}
	ArrayList< Movimentacao > movimentacoes = new ArrayList< Movimentacao >();
	
	
	
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	public double getLimiteSaque() {
		return limiteSaque;
	}
	public void setLimiteSaque(double limiteSaque) {
		this.limiteSaque = limiteSaque;
	}
	

}