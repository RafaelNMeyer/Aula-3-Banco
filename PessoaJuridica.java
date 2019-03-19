import java.util.ArrayList;

public class PessoaJuridica extends Cliente {
	private String CNPJ;
	
	public PessoaJuridica(String nome, String endereco, String telefone, String email, ArrayList<Conta> contas,
			String cNPJ) {
		super(nome, endereco, telefone, email, contas);
		CNPJ = cNPJ;
	}

	public String getCNPJ() {
		return CNPJ;
	}

	public void setCNPJ(String cNPJ) {
		CNPJ = cNPJ;
	}	
	
}
