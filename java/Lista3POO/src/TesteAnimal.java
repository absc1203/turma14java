
public class TesteAnimal {

	public static void main(String[] args) {
		
		Cachorro cachorro = new Cachorro("REX", 3, "Latido");
		Cavalo cavalo = new Cavalo("Pé de Pano", 4, "Relincho");
		Preguica preguica  =  new Preguica("Rubinho", 25, "Grito");
		
		cachorro.emitirSom();
		cavalo.emitirSom();
		preguica.emitirSom();

	}

}
