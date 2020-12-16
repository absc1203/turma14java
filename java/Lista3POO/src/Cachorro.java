
public class Cachorro extends Animal{

	private String som;
	
	
	
	public Cachorro(String nome, int idade, String som) {
		super(nome, idade);
		this.som = som;
	}

	public String getSom() {
		return som;
	}

	public void setSom(String som) {
		this.som = som;
	}

	public String correr() {
		return "Cachorro correndo";
	}


	@Override
	public void emitirSom() {
		System.out.println(som);
	}
}
