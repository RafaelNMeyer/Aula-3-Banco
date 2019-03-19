package kmnbblj;





public class ContaCorrente extends Conta{
	private double limiteEspecial;
	private boolean statusCheque;
	
	
	
	

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