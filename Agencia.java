import java.util.ArrayList;

public class Agencia {
	
	private int numero;
	private String nome,endereco;
	
	 ArrayList<Conta> contas = new ArrayList<Conta>();
	ArrayList<Cliente> clientes = new ArrayList<Cliente>();
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	
}
