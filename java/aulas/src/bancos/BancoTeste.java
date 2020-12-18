package bancos;

import java.util.Scanner;

public class BancoTeste {
	public static void main(String[] args) {
		Scanner t = new Scanner(System.in);

		char op;// visivel em todo o programa - escopo
		char saida;
		int numeroConta = 0;
		double valorLimite = 5000;
		double emprestimo = 5000;
		double emprestimoUniversitario = 5000;
		final int QTDMOVIMENTO = 2;
		// escopo global

		System.out.println("BANCO DE TESTE!!");
		do {
			System.out.println("1 - Abertura de conta: ");
			System.out.println("2 - Acesso a uma conta existente: ");
			System.out.println("3 - Sair: ");
			op = t.next().charAt(0);
			if (op == '1') {
				System.out.println("1 - Conta Poupança");
				System.out.println("2 - Conta Corrente");
				System.out.println("3 - Conta Especial");
				System.out.println("4 - Conta Empresa");
				System.out.println("5 - conta Universitaria");
				System.out.print("Digite o numero de sua opção: ");
				char opconta = t.next().charAt(0);
				numeroConta++;
				System.out.println("Digite o seu CPF:");
				String cpfConta = t.next();
				switch (opconta) {
				case '1': {
					System.out.println("Digite a data de aniversario da conta: ");
					int dataAniversario = t.nextInt();
					ContaPoupanca poupanca = new ContaPoupanca(numeroConta, cpfConta, dataAniversario);

					for (int i = 0; i < QTDMOVIMENTO; i++) {
						System.out.println("QUAL OPERAÇÃO DESEJA FAZER? R$");
						System.out.println("[D]-DÉBITO \\ [C]-CRÉDITO ");
						char opcao = t.next().toUpperCase().charAt(0);

						if (opcao == 'D') {

							System.out.println("INSIRA O VALOR DO DÉBITO");
							double valor = t.nextDouble();
							poupanca.debito(valor);
							System.out.println("Saldo Atual: " + poupanca.getSaldo());

						} else if (opcao == 'C') {
							System.out.println("INSIRA O VALOR DO CRÉDITO");
							double valor = t.nextDouble();
							poupanca.credito(valor);

							System.out.println("Saldo Atual: " + poupanca.getSaldo());
						} else {
							System.out.println("Insira um comando válido!! [D]-DÉBITO \\\\ [C]-CRÉDITO");

						}

					}
					System.out.println("DIGITE O DIA DE HOJE!");
					int dia = t.nextInt();
					poupanca.comparacaoData(dia);

				}
					break;

				case '2': {
					ContaCorrente corrente = new ContaCorrente(numeroConta, cpfConta);

					for (int i = 0; i < QTDMOVIMENTO; i++) {
						System.out.println("QUAL OPERAÇÃO DESEJA FAZER? R$");
						System.out.println("[D]-DÉBITO \\ [C]-CRÉDITO ");
						char opcao = t.next().toUpperCase().charAt(0);

						if (opcao == 'D') {

							System.out.println("INSIRA O VALOR DO DÉBITO");
							double valor = t.nextDouble();
							corrente.debito(valor);
							System.out.println("Saldo Atual: " + corrente.getSaldo());

						} else if (opcao == 'C') {
							System.out.println("INSIRA O VALOR DO CRÉDITO");
							double valor = t.nextDouble();
							corrente.credito(valor);

							System.out.println("Saldo Atual: " + corrente.getSaldo());
						} else {
							System.out.println("Insira um comando válido!! [D]-DÉBITO \\\\ [C]-CRÉDITO");

						}

					}

					corrente.talao(numeroConta);

				}
					break;

				case '3': {
					ContaEspecial especial = new ContaEspecial(numeroConta, valorLimite, 5000);

					for (int i = 0; i < QTDMOVIMENTO; i++) {
						System.out.println("QUAL OPERAÇÃO DESEJA FAZER? R$");
						System.out.println("[D]-DÉBITO \\ [C]-CRÉDITO ");
						char opcao = t.next().toUpperCase().charAt(0);

						if (opcao == 'D') {

							System.out.println("INSIRA O VALOR DO DÉBITO");
							double valor = t.nextDouble();
							especial.debito(valor);
							

							System.out.println("Saldo Atual: " + especial.getSaldo());

						} else if (opcao == 'C') {
							System.out.println("INSIRA O VALOR DO CRÉDITO");
							double valor = t.nextDouble();
							especial.credito(valor);

							System.out.println("Saldo Atual: " + especial.getSaldo());
						} else {
							System.out.println("Insira um comando válido!! [D]-DÉBITO \\\\ [C]-CRÉDITO");

						}

					}

				}
					break;

				case '4': {
					ContaEmpresa empresa = new ContaEmpresa(numeroConta, emprestimo);

					for (int i = 0; i < QTDMOVIMENTO; i++) {
						System.out.println("QUAL OPERAÇÃO DESEJA FAZER? R$");
						System.out.println("[D]-DÉBITO \\ [C]-CRÉDITO ");
						char opcao = t.next().toUpperCase().charAt(0);

						if (opcao == 'D') {

							System.out.println("INSIRA O VALOR DO DÉBITO");
							double valor = t.nextDouble();
							if(valor > empresa.getSaldo()) {
								System.out.println("DÉBITO MAIOR QUE SEU SALDO");
								System.out.println("NECESSARIO FAZER UM EMPRESTIMO");
								System.out.println("QUAL O VALOR??");
								double valorEmprestimo = t.nextDouble();
								empresa.emprestar(valorEmprestimo);
								empresa.debito(valor);
							}
							
							
							System.out.println("Saldo Atual: " + empresa.getSaldo());

						} else if (opcao == 'C') {
							System.out.println("INSIRA O VALOR DO CRÉDITO");
							double valor = t.nextDouble();
							empresa.credito(valor);

							System.out.println("Saldo Atual: " + empresa.getSaldo());
						} else {
							System.out.println("Insira um comando válido!! [D]-DÉBITO \\\\ [C]-CRÉDITO");

						}

					}

					System.out.println("DESEJA FAZER UM EMPRESTIMO?");
					double valorEmprestimo = t.nextDouble();
					empresa.emprestar(valorEmprestimo);

				}
					break;

				case '5': {
					ContaUniversitaria universitaria = new ContaUniversitaria(numeroConta, cpfConta, valorLimite,
							emprestimoUniversitario);

					for (int i = 0; i < QTDMOVIMENTO; i++) {
						System.out.println("QUAL OPERAÇÃO DESEJA FAZER? R$");
						System.out.println("[D]-DÉBITO \\ [C]-CRÉDITO ");
						char opcao = t.next().toUpperCase().charAt(0);

						if (opcao == 'D') {

							System.out.println("INSIRA O VALOR DO DÉBITO");
							double valor = t.nextDouble();
							if(valor > universitaria.getSaldo()) {
								System.out.println("DESEJA FAZER UM EMPRESTIMO?");
								double valorEmprestimo = t.nextDouble();
								universitaria.emprestar(valorEmprestimo);
							}
							universitaria.debito(valor);
							System.out.println("Saldo Atual: " + universitaria.getSaldo());

						} else if (opcao == 'C') {
							System.out.println("INSIRA O VALOR DO CRÉDITO");
							double valor = t.nextDouble();
							universitaria.credito(valor);

							System.out.println("Saldo Atual: " + universitaria.getSaldo());
						} else {
							System.out.println("Insira um comando válido!! [D]-DÉBITO \\\\ [C]-CRÉDITO");

						}

					}

					System.out.println("Deseja fazer um impréstimo?");
					double valorEmprestimo = t.nextDouble();
					universitaria.emprestar(valorEmprestimo);

				}
					break;
				}

			} else if (op == '2') {
				System.out.println("wip");
			} else {

			}
			System.out.println("Continua S/N");
			saida = t.next().toUpperCase().charAt(0);
			if (saida == 'N') {
				System.out.println("PROGRAMA FINALIZADO..");
				break;
			}

		} while (true);

	}
}