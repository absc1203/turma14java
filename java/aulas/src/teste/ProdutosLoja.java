package teste;

public class ProdutosLoja {
	
	private String produto;
	private int estoque;
	
	public ProdutosLoja(String produto, int estoque) {
		this.produto = produto;
		this.estoque = estoque;
	}
	
	
	public String getProduto() {
		return produto;
	}
	public void setProduto(String produto) {
		this.produto = produto;
	}
	public int getEstoque() {
		return estoque;
	}
	public void setEstoque(int estoque) {
		this.estoque = estoque;
	}
	
	
	
	
	
}