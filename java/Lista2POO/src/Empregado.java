
public class Empregado extends Pessoa{
	
	private int codigoSetor;
	private double salarioBase;
	private double	impostos = 0.03;
	
	public Empregado(int codigoSetor) {
		super();
		this.codigoSetor = codigoSetor;
	}

	public Empregado(String nome, String telefone, String endereco, int codigoSetor, double salarioBase) {
		super(nome, telefone, endereco);
		this.codigoSetor = codigoSetor;
		this.salarioBase = salarioBase;
	}



	public int getCodigoSetor() {
		return codigoSetor;
	}

	public void setCodigoSetor(int codigoSetor) {
		this.codigoSetor = codigoSetor;
	}

	public double getSalarioBase() {
		return salarioBase;
	}

	public void setSalarioBase(double salarioBase) {
		this.salarioBase = salarioBase;
	}

	public double getImpostos() {
		return impostos;
	}

	public void setImpostos(double impostos) {
		this.impostos = impostos;
	}
	
	
	public double calcularSalario() {
		return this.salarioBase - (this.impostos*this.salarioBase);
	}

	@Override
	public String toString() {
		return "Empregado // codigoSetor: " + codigoSetor + "\nsalarioBase=" + salarioBase + "\nimpostos=" + impostos
				+ "\nNome: " + getNome() + "\ngetEndereco: " + getEndereco() + "\ngetTelefone: " + getTelefone();
	}
	
	
	

}
