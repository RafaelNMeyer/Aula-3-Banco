
public class ContaCorrente extends Conta{
	private double limiteEspecial = 200; // valor fixo
	private boolean statusCheque;
	
	public ContaCorrente (int num, boolean statCheq)
	{
		this.setNumero(num);
		this.statusCheque = statCheq; 
	}

	public double getLimiteEspecial() {
		return limiteEspecial;
	}
	public void setLimiteEspecial(double limiteEspecial) {
		this.limiteEspecial = limiteEspecial;
	}
	public boolean isStatusCheque() {
		return statusCheque;
	}
	public void setStatusCheque(boolean statusCheque) {
		this.statusCheque = statusCheque;
	}

}