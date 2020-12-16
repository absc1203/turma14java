package loja;

public class Produtos {
	
	private String codigo;
	private String nome;
	private double preco;
	private int quantidadeEstoque;
	
	public Produtos(String codigo, String nome, double preco, int quantidadeEstoque) {
		super();
		this.codigo = codigo;
		this.nome = nome;
		this.preco = preco;
		this.quantidadeEstoque = quantidadeEstoque;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public int getQuantidadeEstoque() {
		return quantidadeEstoque;
	}

	public void setQuantidadeEstoque(int quantidadeEstoque) {
		this.quantidadeEstoque = quantidadeEstoque;
	}
	
	public double comprarProduto(String codigo, int quantidade) {
		quantidadeEstoque -= quantidade;
		return this.preco * quantidade;
	}
	
	

}
