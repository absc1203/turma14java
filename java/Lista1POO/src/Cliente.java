
public class Cliente {

	public String nome;
	public String CPF;
	public int anoNasc;
	
	public Cliente(String nome, String CPF, int anoNasc) {
		super();
		this.nome = nome;
		this.CPF = CPF;
		this.anoNasc = anoNasc;
	}




	String solicitarInformações() {
		return "Nome: "+this.nome+"\nCPF: "+this.CPF+"\nAno de nascimento: "+this.anoNasc+"\n";
	}
		
}
