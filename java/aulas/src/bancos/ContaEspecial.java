package bancos;

public class ContaEspecial extends ContaCorrente {
	
	private double valorLimite;
	
	
	
	public ContaEspecial(int numeroConta, String CPF, double valorLimite) {
		super(numeroConta, CPF);
		this.valorLimite = valorLimite;
	}

	public ContaEspecial(double valorLimite) {
		super();
		this.valorLimite = valorLimite;
	}
	
	

	

	public double getValorLimite() {
		return valorLimite;
	}

	public void setValorLimite(double valorLimite) {
		this.valorLimite = valorLimite;
	}
	
	

}
