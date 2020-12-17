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

					for (int i = 0; i < 10; i++) {
						System.out.println("QUAL OPERAÇÃO DESEJA FAZER? R$");
						System.out.println("[D]-DÉBITO \\ [C]-CRÉDITO ");
						char opcao = t.next().toUpperCase().charAt(0);

						if (opcao == 'D') {

							System.out.println("INSIRA O VALOR DO DÉBITO");
							double valor = t.nextDouble();

							if (poupanca.getSaldo() >= valor) {
								System.out.println("Debito feito com sucesso");
								poupanca.debito(valor);
								System.out.println("Saldo Atual: " + poupanca.getSaldo());
							} else {
								System.out.println("Saldo insuficiente para saque");
								System.out.println("Saldo Atual: " + poupanca.getSaldo());
							}

						} else if (opcao == 'C') {
							System.out.println("INSIRA O VALOR DO CRÉDITO");
							double valor = t.nextDouble();
							poupanca.credito(valor);

							System.out.println("Saldo Atual: " + poupanca.getSaldo());
						} else {
							System.out.println("Insira um comando válido!! [D]-DÉBITO \\\\ [C]-CRÉDITO");

						}

					}

				}
					break;

				case '2': {
					ContaCorrente corrente = new ContaCorrente(numeroConta, cpfConta);
					
					for (int i = 0; i < 10; i++) {
						System.out.println("QUAL OPERAÇÃO DESEJA FAZER? R$");
						System.out.println("[D]-DÉBITO \\ [C]-CRÉDITO ");
						char opcao = t.next().toUpperCase().charAt(0);

						if (opcao == 'D') {

							System.out.println("INSIRA O VALOR DO DÉBITO");
							double valor = t.nextDouble();

							if (corrente.getSaldo() >= valor) {
								System.out.println("Debito feito com sucesso");
								corrente.debito(valor);
								System.out.println("Saldo Atual: " + corrente.getSaldo());
							} else {
								System.out.println("Saldo insuficiente para saque");
								System.out.println("Saldo Atual: " + corrente.getSaldo());
							}

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
					ContaEspecial especial = new ContaEspecial(numeroConta, cpfConta, valorLimite);
					
					for (int i = 0; i < 10; i++) {
						System.out.println("QUAL OPERAÇÃO DESEJA FAZER? R$");
						System.out.println("[D]-DÉBITO \\ [C]-CRÉDITO ");
						char opcao = t.next().toUpperCase().charAt(0);

						if (opcao == 'D') {

							System.out.println("INSIRA O VALOR DO DÉBITO");
							double valor = t.nextDouble();

							if (especial.getSaldo() >= valor) {
								System.out.println("Debito feito com sucesso");
								especial.debito(valor);
								System.out.println("Saldo Atual: " + especial.getSaldo());
							} else {
								System.out.println("Saldo insuficiente para saque");
								System.out.println("Saldo Atual: " + especial.getSaldo());
							}

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
					ContaEmpresa empresa = new ContaEmpresa(numeroConta, cpfConta, emprestimo);
					
					for (int i = 0; i < 10; i++) {
						System.out.println("QUAL OPERAÇÃO DESEJA FAZER? R$");
						System.out.println("[D]-DÉBITO \\ [C]-CRÉDITO ");
						char opcao = t.next().toUpperCase().charAt(0);

						if (opcao == 'D') {

							System.out.println("INSIRA O VALOR DO DÉBITO");
							double valor = t.nextDouble();

							if (empresa.getSaldo() >= valor) {
								System.out.println("Debito feito com sucesso");
								empresa.debito(valor);
								System.out.println("Saldo Atual: " + empresa.getSaldo());
							} else {
								System.out.println("Saldo insuficiente para saque");
								System.out.println("Saldo Atual: " + empresa.getSaldo());
							}

						} else if (opcao == 'C') {
							System.out.println("INSIRA O VALOR DO CRÉDITO");
							double valor = t.nextDouble();
							empresa.credito(valor);

							System.out.println("Saldo Atual: " + empresa.getSaldo());
						} else {
							System.out.println("Insira um comando válido!! [D]-DÉBITO \\\\ [C]-CRÉDITO");

						}
						
					}
					
					empresa.perguntarEmprestimo();
					
				}
					break;

				case '5': {
					ContaUniversitaria universitaria = new ContaUniversitaria(numeroConta, cpfConta, valorLimite,
							emprestimoUniversitario);
					
					for (int i = 0; i < 10; i++) {
						System.out.println("QUAL OPERAÇÃO DESEJA FAZER? R$");
						System.out.println("[D]-DÉBITO \\ [C]-CRÉDITO ");
						char opcao = t.next().toUpperCase().charAt(0);

						if (opcao == 'D') {

							System.out.println("INSIRA O VALOR DO DÉBITO");
							double valor = t.nextDouble();

							if (universitaria.getSaldo() >= valor) {
								System.out.println("Debito feito com sucesso");
								universitaria.debito(valor);
								System.out.println("Saldo Atual: " + universitaria.getSaldo());
							} else {
								System.out.println("Saldo insuficiente para saque");
								System.out.println("Saldo Atual: " + universitaria.getSaldo());
							}

						} else if (opcao == 'C') {
							System.out.println("INSIRA O VALOR DO CRÉDITO");
							double valor = t.nextDouble();
							universitaria.credito(valor);

							System.out.println("Saldo Atual: " + universitaria.getSaldo());
						} else {
							System.out.println("Insira um comando válido!! [D]-DÉBITO \\\\ [C]-CRÉDITO");

						}
						
					}
					
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
				break;
			}

		} while (true);

	}
}