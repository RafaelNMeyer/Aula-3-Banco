import java.util.ArrayList;

public class PessoaFisica extends Cliente {
	private String CPF;
	private String estadoCivil;

	public PessoaFisica(String nome, String endereco, String telefone, String email, ArrayList<Conta> contas,
			String cPF, String estadoCivil) {
		super(nome, endereco, telefone, email, contas);
		CPF = cPF;
		this.estadoCivil = estadoCivil;
	}


	public String getCPF() {
		return CPF;
	}
	public void setCPF(String cPF) {
		CPF = cPF;
	}
	public String getEstadoCivil() {
		return estadoCivil;
	}
	public void setEstadoCivil(String estadoCivil) {
		this.estadoCivil = estadoCivil;
	}
}
