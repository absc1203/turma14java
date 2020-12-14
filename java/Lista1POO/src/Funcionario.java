
public class Funcionario {
	
	public String nome;
	public String CPF;
	public int anoNasc;
	public boolean pontoEntradaSaida;
	
	
	
	public Funcionario(String nome, String CPF, int anoNasc) {
		super();
		this.nome = nome;
		this.CPF = CPF;
		this.anoNasc = anoNasc;
	}
	
	void baterPonto() {
		System.out.println("O ponto foi batido");
	}
	
	
	
	
}
