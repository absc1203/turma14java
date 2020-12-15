
public class Fornecedor extends Pessoa {
	
	private double valorCredito;
	private double valorDivida;
	
	//construtor
	
	public Fornecedor(String nome, String telefone, String endereco, double valorCredito, double valorDivida) {
		super(nome, telefone, endereco);
		this.valorCredito = valorCredito;
		this.valorDivida = valorDivida;
	}
	
	
	
	
	public double getValorCredito() {
		return valorCredito;
	}
	
	public void setValorCredito(double valorCredito) {
		this.valorCredito = valorCredito;
	}
	public double getValorDivida() {
		return valorDivida;
	}
	public void setValorDivida(double valorDivida) {
		this.valorDivida = valorDivida;
	}
	
	public double obterSaldo(double valorCredito, double valorDivida) {
		return this.valorCredito - this.valorDivida;
	}

	
	@Override
	public String toString() {
		
		return "Fornecedor [valorCredito : " + valorCredito + ",\nvalorDivida: " + valorDivida + ",\nNome: " + getNome()
				+ ",\nEndereco: " + getEndereco() + ",\nTelefone: " + getTelefone() + "]";
	}
	
	
	

}
