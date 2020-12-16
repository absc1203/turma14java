package banco;

import java.util.Scanner;

public class ContaCorrente extends Conta {

	private int qtdTalao;

	public int getQtdTalao() {
		return qtdTalao;
	}

	public ContaCorrente() {
		
	}
	
	public ContaCorrente(int numeroConta) {
		super(numeroConta);
	}
	
	public ContaCorrente(int numeroConta, String CPF) {
		super(numeroConta,CPF);
	}
	
	

	public void talao(int conta, int talao[], int totalTalao[]){
		char opcao;
		Scanner t = new Scanner(System.in);
		System.out.println("Você deseja imprimir talão? S/N ");
		opcao = t.next().toUpperCase().charAt(0);
		while (opcao != 'S' && opcao != 'N') {
			System.out.println("\nOpção inválida. Deseja continuar? ");
			opcao = t.next().toUpperCase().charAt(0);
		}

		if (opcao == 'S') {
			System.out.println("Digite a quantidade que deseja:");
			qtdTalao = t.nextInt();
			while (qtdTalao < 0 || qtdTalao > 3) {
				System.out.println("Quantidade inválida. Digite a quantidade:");
				qtdTalao = t.nextInt();
			}

			while (qtdTalao > talao[conta]) {
				System.out.printf("Erro! Quantidade disponível: %d. Digite a quantidade:", talao[conta]);
				qtdTalao = t.nextInt();
			}

			talao[conta] = talao[conta] - qtdTalao;
			totalTalao[conta] = totalTalao[conta] + qtdTalao;
			if (talao[conta] == 0) {
				talao[conta] = 3;
			}
			System.out.printf("Quantidade diária imprimida: %d\n", qtdTalao);
			System.out.printf("Quantidade total imprimida: %d\n", totalTalao[conta]);
		}
	}

}
