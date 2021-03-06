package banco;

public abstract class Conta {

	protected int numeroConta;
	protected double saldo;
	protected String CPF;

	public Conta() {

	}
	
	public double getSaldo() {
		return saldo;
	}

	public int getNumeroConta() {
		return numeroConta;
	}

	public void setNumeroConta(int numeroConta) {
		this.numeroConta = numeroConta;
	}

	public String getCPF() {
		return CPF;
	}

	public void setCPF(String cPF) {
		CPF = cPF;
	}

	public Conta(int numeroConta) {
		this.numeroConta = numeroConta;
	}

	public Conta(int numeroConta, String CPF) {
		this.numeroConta = numeroConta;
		this.CPF = CPF;
	}

	public void debito(double valorDebito) {
		if (this.saldo > valorDebito) {
			this.saldo -= valorDebito;
		} else {
			System.out.println("Valor maior que o saldo!");
		}
	}

	public void credito(double valorCredito) {
		if(valorCredito > 0) {
		this.saldo += valorCredito;
		}
		else {
			System.out.println("Digite um valor maior que 0");
		}
	}

	
	
	
}
