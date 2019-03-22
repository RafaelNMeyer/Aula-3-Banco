
public class ContaPoupanca extends Conta {
	
	private int variacao = 51;
	private double rm;
	
	public ContaPoupanca (int num)
	{
		 this.setNumero(num);
	}

	public int getVariacao() {
		return variacao;
	}
	public void setVariacao(int variacao) {
		this.variacao = variacao;
	}
	public double getRm() {
		return rm;
	}
	public void setRm(double rm) {
		this.rm = rm;
	}
	
	public double calcularRm(double saldo)
	{
		return (this.variacao/100) * saldo;
	}

}