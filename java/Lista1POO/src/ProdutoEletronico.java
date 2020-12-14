
public class ProdutoEletronico {
	
	public String tipo;
	public String fabricante;
	public boolean ligado;
	
	
	public ProdutoEletronico(String tipo, String fabricante) {
		super();
		this.tipo = tipo;
		this.fabricante = fabricante;
	}
	
	void ligar() {
		ligado = true;
	}
	
	void desligar() {
		ligado = false;
	}
	
	
	
}
