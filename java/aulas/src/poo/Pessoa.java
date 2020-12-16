package poo;

public class Pessoa {
	
	public String nome;
	public char genero;
	public int anoNascimento;
	
	
	public Pessoa() {
		
	}
	
	public Pessoa(String nome) {
		this.nome = nome;
	}
	
	public void voltaGenero(char genero, String nome) {
		this.genero = genero;
		this.nome = nome;
		
		if(genero == 'M') {
			System.out.println("BEM VINDO " + nome);
		}
		else if(genero == 'F'){
			System.out.println("BEM VINDA " + nome);
		}
		else {
			System.out.println("BEM VINDX " + nome);
		}
		
	}

}
