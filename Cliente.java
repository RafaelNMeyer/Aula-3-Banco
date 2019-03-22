
import java.util.ArrayList;

public class Cliente {
	
	private String nome, endereco,telefone,email;
	ArrayList<Conta> contas = new ArrayList<Conta>();
	
	public Cliente(String nome, String endereco, String telefone, String email, ArrayList<Conta> contas) {
		super();
		this.nome = nome;
		this.endereco = endereco;
		this.telefone = telefone;
		this.email = email;
		this.contas = contas;
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
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public ArrayList<Conta> getContas() {
		return contas;
	}
	public void setContas(ArrayList<Conta> contas) {
		this.contas = contas;
	}

}
