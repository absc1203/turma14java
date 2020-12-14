
public class Aviao {
	
	public String nomeFabricante;
	public String modelo;
	public String cor;
	public int capacidade;
	
	
	public Aviao(String nomeFabricante, String modelo, String cor, int capacidade) {
		super();
		this.nomeFabricante = nomeFabricante;
		this.modelo = modelo;
		this.cor = cor;
		this.capacidade = capacidade;
	}
	
	public String virarEsquerda() {
		return "Virando para a esquerda..";
	}
	
	public String virarDireita() {
		return "Virando para a direita..";
	}
	
	public String decolar() {
		return "Decolando..";
	}
	
	public String pousar() {
		return "Pousando..";
	}
	
}
