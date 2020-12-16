
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
		return "Preguiça subindo árvore";
	}
	
	@Override
	public void emitirSom() {
		System.out.println(som);
	}

}
