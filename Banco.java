
import java.util.ArrayList;

public class Banco {
	int u = 0, contadorContas = 0;
	
	 ArrayList<Conta> c = new ArrayList<Conta>();
	 ArrayList<Cliente> clientes = new ArrayList<Cliente>();
	 ArrayList<Agencia> agencias = new ArrayList<Agencia>();	

	public int addConta(int tipo, boolean temCheq) { // boolean pra tratamento de erro, caso não crie a conta (ver chamada do metodo no main)
		int nconta = -1;
		boolean criou = true;
		if (tipo == 1)
			c.add(new ContaCorrente(contadorContas, temCheq));
		else
			if (tipo == 2)
				c.add(new ContaPoupanca(contadorContas));
			else {
				System.out.println("Opcao invalida");
				criou = false;
			}
		if (criou)
		{
			nconta = this.contadorContas; // OK! >PROBLEMA AQUI : CASO APAGUE UMA CONTA, BAGUNCA o NUMERO DA CONTA EM RELACAO A POSICAO NO ARRAYLIST
			this.contadorContas++;
			// pra que serve a variavel p ????
			//int p = 0;
			/*//if(p < 0) { 							
				for(int i = 0; i<c.size();i++) {
					System.out.println(c.get(i).getNumero());
					if(c.get(i) != null) {
						c.get(i).setNumero(i);
						nconta = i;
						System.out.println(nconta);

			//		}
				}
			}*/
		}
		else
			System.out.println("Criacao de conta cancelada\n");
		return nconta;
	}
	
	// não entendi pra q serve esse metodo \/
	/*public void contas() {
		for(int i = 0; i < c.size(); i++) {
				c.get(i).getNumero();
			}
	}*/ 

	public void removeConta(int n) {
		c.remove(n);
	}
	
	//otimizei o metodo pra lidar com os 2 tipos de conta
	public void saques(int nconta, double valor) { 
		if (valor <= c.get(nconta).getLimiteSaque() && valor <= c.get(nconta).getSaldo()) {
			c.get(nconta).setSaldo(c.get(nconta).getSaldo() - valor);
			c.get(nconta).getMovimentacoes().add(new Movimentacao("saque", valor));
		}
		else
			System.out.println("Saldo ou limite de saque insuficiente");
		if (c.get(nconta) instanceof ContaCorrente && ((ContaCorrente)c.get(nconta)).isStatusCheque()) {
			if (valor <= c.get(nconta).getSaldo()
					&& valor <= c.get(nconta).getLimiteSaque() + ((ContaCorrente)c.get(nconta)).getLimiteEspecial()) {
				c.get(nconta).setSaldo(c.get(nconta).getSaldo() - valor);
				c.get(nconta).getMovimentacoes().add(new Movimentacao("saque", valor));
				/*int n = 0; // pra q esse n e o if msm?
				if (n < 1) {
					c.get(nconta).getMovimentacoes().add(new Movimentacao("saque", valor));
					n++;
				} */
			}
			else
				System.out.println("Saldo insuficiente");	
			}
	}

	public void deposito(int nconta, double valor) {
		c.get(nconta).setSaldo(c.get(nconta).getSaldo() + valor);
		c.get(nconta).getMovimentacoes().add(new Movimentacao("deposito",valor));
		// pq não direto /\ em vez desse n e o if \/ ?
		/* int n = 0;  
		if (n < 1) {
			c.get(nconta).getMovimentacoes().add(new Movimentacao("deposito",valor));
			n++;
			} */
	}

	public void emissaoSaldo(int nconta) {
		System.out.println(c.get(nconta).getSaldo()+"\n"); 
		//System.out.println(); substituido pelo \n /\
	}

	public void extratoBancario(int nconta) {
		for (int i = 0; i < c.get(nconta).getMovimentacoes().size(); i++) {
			
			System.out.println(c.get(nconta).getMovimentacoes().get(i).getDescricao() + " de: "
					+ (c.get(nconta).getMovimentacoes().get(i).getValor())+"\n");
			// System.out.println(); substituido por um \n -----------------/\
		}
	}
	
	// *metodo novo*
	public int contaExiste (int nconta) 
	{
		int existe = -1;
		for (int i = 0; i < c.size(); i++)
			if (nconta == c.get(i).getNumero())
				existe = i;
		return existe;
	}
	
	public void transferir(int origem, int receptora, double valor)
	{
		if (c.size() >= 2)
		{
			Movimentacao mov = new Movimentacao();
			mov.setDescricao("transferência");
			if (valor > 0 && valor <= c.get(origem).getLimiteSaque() && valor <= c.get(origem).getSaldo())
			{
				c.get(origem).setSaldo(c.get(origem).getSaldo() - valor);
				c.get(receptora).setSaldo(c.get(receptora).getSaldo() + valor);
				mov.setValor(valor);
				mov.setDescricao("Transferência da conta Nº "+origem+" para a conta Nº "+receptora);	
				c.get(origem).getMovimentacoes().add(mov);
				c.get(receptora).getMovimentacoes().add(mov);
			}
			else
				System.out.println("Saldo ou limite de saque insuficiente! Operacao cancelada");	
		}
		else
			System.out.println("ERRO! Devem haver ao menos 2 contas registradas p/ fazer uma transferencia!");		
	}
}
