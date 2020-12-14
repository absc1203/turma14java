
public class TestesObjetos {

	public static void main(String[] args) {
	
		//Exercicio 1
		Cliente cli = new Cliente("André", "475.360.288-57", 1999);
		System.out.println(cli.solicitarInformações());

		
		//Exercicio 2 
		Aviao aviao = new Aviao("Aero", "A320", "Roxo", 250);
		System.out.println("Nome Fabricante: "+aviao.nomeFabricante+"\nModelo: "+aviao.modelo+ "\nCor: "+aviao.cor+" \nCapacidade: "+aviao.capacidade+" passageiros\n");
		
		//Exercicio 3
		ProdutoEletronico produto = new ProdutoEletronico("Celular", "Motorola");
		System.out.println("Nome: "+produto.tipo+"\nFabricante: "+produto.fabricante);
		produto.ligar();
		System.out.println("Está ligado? "+ produto.ligado);
		produto.desligar();
		System.out.println("Está ligado? "+ produto.ligado);
		
		//Exercicio 4
		Funcionario func = new Funcionario("Ana", "445.330.512-57", 1999);
		System.out.println("\nNome:"+ func.nome +"\nCPF: " + func.CPF + "\nAno Nascimento: " +func.anoNasc+"\n");
		func.baterPonto();
		
		//Exercicio 5
		Patinete patinete =  new Patinete(66.5, 2330, "plastico");
		System.out.println("Altura: "+patinete.altura+"\nPeso: "+patinete.peso+"g\nMaterial: "+patinete.material);
		int velocidade = 10;
		patinete.andar(velocidade);
		System.out.println(patinete.velocidadeAtual);
		patinete.parar();
		System.out.println(patinete.velocidadeAtual);
	}

}
