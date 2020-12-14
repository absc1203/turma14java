
public class Patinete {
	
	public double altura;
	public double peso;
	public String material;
	public int velocidadeAtual = 0;
	
	public Patinete(double altura, double peso, String material) {
		super();
		this.altura = altura;
		this.peso = peso;
		this.material = material;
	}
	
	void andar(int velocidade) {
		this.velocidadeAtual = this.velocidadeAtual + velocidade;
	}
	
	void parar() {
		this.velocidadeAtual = 0;
	}
	
	

}
