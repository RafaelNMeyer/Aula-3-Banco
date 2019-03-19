package kmnbblj;

import java.util.ArrayList;

public class Banco {
	int u = 0;
	private ArrayList<ContaCorrente> cc = new ArrayList<ContaCorrente>();
	private ArrayList<ContaPoupanca> cp = new ArrayList<ContaPoupanca>();

	public void addConta() {
		cc.add(new ContaCorrente());
		int p = 0;
		if(p < 0) {
			for(int i = 0; i<cc.size();i++) {
				if(cc.get(i) == null) {
					cc.get(i).setNumero(i);
				}
			}
		}
		
	}
	public void contas() {
		for(int i = 0; i<cc.size();i++) {
				cc.get(i).getNumero();
			}
	}

	public void removeConta(int n) {

		cc.remove(n);

	}

	public void saques(int nconta, double valor) {
		if (cc.get(nconta).isStatusCheque() == true) {
			if (valor <= cc.get(nconta).getSaldo()
					&& valor <= cc.get(nconta).getLimiteSaque() + cc.get(nconta).getLimiteEspecial()) {
				cc.get(nconta).setSaldo(cc.get(nconta).getSaldo() - valor);
				int n = 0;
				if (n < 1) {
					cc.get(nconta).movimentacoes.add(new Movimentacao("saque", valor));
					n++;
					/*for (int i = 0; i < cc.get(nconta).movimentacoes.size(); i++) {
						if (cc.get(nconta).movimentacoes.get(i) == null) {
							
							cc.get(nconta).movimentacoes.get(i).setDescricao("saque");
							cc.get(nconta).movimentacoes.get(i).setValor(valor);
							n++;
						}
					}*/
				}
			} else {
				System.out.println("Saldo insuficiente");
			}

		} else {
			if (valor <= cc.get(nconta).getSaldo() && valor <= cc.get(nconta).getLimiteSaque()) {
				cc.get(nconta).setSaldo(cc.get(nconta).getSaldo() - valor);
				int n = 0;
				if (n < 1) {
					cc.get(nconta).movimentacoes.add(new Movimentacao("saque", valor));
					/*for (int i = 0; i < cc.get(nconta).movimentacoes.size(); i++) {	
						if (cc.get(nconta).movimentacoes.get(i) == null) {
							
							cc.get(nconta).movimentacoes.get(i).setDescricao("saque");
							cc.get(nconta).movimentacoes.get(i).setValor(valor);
							n++;
						}
					}*/
				}
			} else {
				System.out.println("Saldo insuficiente");
			}

		}

	}

	public void deposito(int nconta, double valor) {

		cc.get(nconta).setSaldo(cc.get(nconta).getSaldo() + valor);
		int n = 0;
		if (n < 1) {
			cc.get(nconta).movimentacoes.add(new Movimentacao("deposito",valor));
			n++;
			/*for (int i = 0; i < cc.get(nconta).movimentacoes.size(); i++) {
				if (cc.get(nconta).movimentacoes.get(i) == null) {
					
					cc.get(nconta).movimentacoes.get(i).setDescricao("deposito");
					cc.get(nconta).movimentacoes.get(i).setValor(valor);
					n++;
				}
			}
		}*/
		}
	}

	public void emissaoSaldo(int nconta) {
		System.out.println(cc.get(nconta).getSaldo()); 
		System.out.println();
	}

	public void extratoBancario(int nconta) {
		for (int i = 0; i < cc.get(nconta).movimentacoes.size(); i++) {
			
			System.out.println(cc.get(nconta).movimentacoes.get(i).getDescricao() + " de: "
					+ (cc.get(nconta).movimentacoes.get(i).getValor()));
			System.out.println();
		}
	}

}