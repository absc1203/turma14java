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
		System.out.println("Voc� deseja imprimir tal�o? S/N ");
		opcao = t.next().toUpperCase().charAt(0);
		while (opcao != 'S' && opcao != 'N') {
			System.out.println("\nOp��o inv�lida. Deseja continuar? ");
			opcao = t.next().toUpperCase().charAt(0);
		}

		if (opcao == 'S') {
			System.out.println("Digite a quantidade que deseja:");
			qtdTalao = t.nextInt();
			while (qtdTalao < 0 || qtdTalao > 3) {
				System.out.println("Quantidade inv�lida. Digite a quantidade:");
				qtdTalao = t.nextInt();
			}

			while (qtdTalao > talao[conta]) {
				System.out.printf("Erro! Quantidade dispon�vel: %d. Digite a quantidade:", talao[conta]);
				qtdTalao = t.nextInt();
			}

			talao[conta] = talao[conta] - qtdTalao;
			totalTalao[conta] = totalTalao[conta] + qtdTalao;
			if (talao[conta] == 0) {
				talao[conta] = 3;
			}
			System.out.printf("Quantidade di�ria imprimida: %d\n", qtdTalao);
			System.out.printf("Quantidade total imprimida: %d\n", totalTalao[conta]);
		}
	}

}
