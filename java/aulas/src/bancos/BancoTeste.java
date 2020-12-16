package bancos;

import java.util.Scanner;

public class BancoTeste {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		System.out.println("BANCO TESTE PARA USO");
		int conta;
		char op;
		double valor = 0.00;
		
		//variaveis do talao
		int talao = 3;
		int totalTalao = 0;
		//------------------
		
		System.out.println("Digite o numero da conta: ");
		conta = leia.nextInt();
		ContaCorrente contaCorrente = new ContaCorrente();
		
		do {
			System.out.println("Saldo atual da conta é " + contaCorrente.saldo);
			System.out.println("Desejar movimentar? S/N");
			op = leia.next().toUpperCase().charAt(0);
			for (int i = 0; i < 10; i++) {
				while (op == 'S') {
					System.out.println("Movimento a credito ou debito? [C/D]:");
					op = leia.next().toUpperCase().charAt(0);
					while (op != 'D' && op != 'C') {
						System.out.println("Digite uma opção válida!\n[C]-Crédito [D]-Débito");
						op = leia.next().toUpperCase().charAt(0);
					}
					System.out.println("Digite o valor: ");
					valor = leia.nextDouble();
					if (op == 'D') {
						contaCorrente.debito(valor);
					} else if (op == 'C') {
						contaCorrente.credito(valor);
					}
					System.out.printf("Saldo atual: %.2f\n", contaCorrente.saldo);
					System.out.println("Continua S/N:");
					op = leia.next().toUpperCase().charAt(0);
					while (op != 'S' && op != 'N') {
						System.out.println("Digite uma opção válida!\n[S]-Sim [N]-Não");
						op = leia.next().toUpperCase().charAt(0);
					}
				}

			}
			contaCorrente.talao(talao, totalTalao);

		} while (op == 'S');

		System.out.println("Fim do programa. Tks!!!");
		
		ContaCorrente c1 = new ContaCorrente(1);
		
		
		c1.talao(c1.numeroConta);
	}

}
