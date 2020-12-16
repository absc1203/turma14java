
public class Preguica extends Animal{
	
	private String som;

	public Preguica(String nome, int idade, String som) {
		super(nome, idade);
		this.som = som;
	}

	public String getSom() {
		return som;
	}

	public void setSom(String som) {
		this.som = som;
	}
	
	public String subirArvore() {
		return "Pregui�a subindo �rvore";
	}
	
	@Override
	public void emitirSom() {
		System.out.println(som);
	}

}
