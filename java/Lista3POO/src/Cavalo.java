
public class Cavalo extends Animal{

	
	private String som;
	

	public Cavalo(String nome, int idade, String som) {
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
		return "Cavalo correndo";
	}


	@Override
	public void emitirSom() {
		System.out.println(som);
	}
}
