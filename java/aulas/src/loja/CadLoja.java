package loja;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CadLoja {

	public static void main(String[] args) {

		Scanner t = new Scanner(System.in);
		char opcao ='S';
		int quantidade = 0;
		int escolhido = 0;
		double preco = 0;
		String codProduto;
		double total = 0;
		
		List<Produtos> produtos = new ArrayList<>();
		produtos.add(new Produtos("OD01", "CAMISA", 35.00, 10));
		produtos.add(new Produtos("OD02", "CAMISETA", 55.00, 10));
		produtos.add(new Produtos("OD03", "REGATA", 22.00, 10));
		produtos.add(new Produtos("OD04", "B.MOLETOM", 120.00, 10));
		produtos.add(new Produtos("OD05", "BONÉ", 50.00, 10));
		produtos.add(new Produtos("OD06", "TOUCA", 30.00, 10));
		produtos.add(new Produtos("OD07", "SHORTS", 40.00, 10));
		produtos.add(new Produtos("OD08", "C.VENTO", 100.00, 10));
		produtos.add(new Produtos("OD09", "CALÇA", 80.00, 10));
		produtos.add(new Produtos("OD10", "LUVA", 10.00, 10));

		do {
			// Cabeçalho
			linha(80);
			System.out.println("***********************************");
			System.out.println("         OUTLET DO DRÉZÃO           ");
			System.out.println("OS MAIORES DESCONTOS DE SÃO PAULO!!");
			System.out.println("***********************************");
			linha(80);
			// Menu
			System.out.println("[1] - COMPRAR PRODUTOS");
			System.out.println("[2] - GERENCIAR ESTOQUE");
			System.out.println("[3] - SAIR\n");
			System.out.print("DIGITE A OPÇÃO:");
			char tipo = t.next().charAt(0);

			//estava aqui kkkkkk

			if (tipo == '1') {

				t.nextLine();
				System.out.print("NOME DO CLIENTE:");
				String nome = t.nextLine().toUpperCase();
				System.out.print("\nGENERO DO CLIENTE [M]-MASCULINO [F]-FEMININO: ");
				char genero = t.next().toUpperCase().charAt(0);
				
				while (genero != 'M' && genero != 'F') {
					System.out.println("Digite uma opção válida");
					System.out.println("[M]-MASCULINO [F]-FEMININO");
					genero = t.next().toUpperCase().charAt(0);
				}
				
				System.out.println("DIGITE O SEU ANO DE NASCIMENTO");
				int anoNascimento = t.nextInt();
				System.out.println("DIGITE O SEU CPF");
				String cpf = t.next();
				
				Cliente cliente = new Cliente(nome, genero, anoNascimento, cpf);
				
				if (cliente.getGenero() == 'M') {
					System.out.println("\nSEJA BEM VINDO SR " + cliente.getNome() + "!!");
				} else if (cliente.getGenero() == 'F') {
					System.out.println("\nSEJA BEM VINDA SRA " + cliente.getNome() + "!!");
				}
				
				if(cliente.voltaIdade() > 18) {
				System.out.println("\n\n             VESTUÁRIO ADULTO            ");
				// cabeçalho menu de produtos adultos
				linha(60);
				System.out.print("COD\tESTOQUE\t\tPREÇO\t\tNOME\n");
				linha(60);
				}else{
				System.out.println("\n\n             VESTUÁRIO INFANTIL            ");
				// cabeçalho menu de produtos infantíl 
				linha(60);
				System.out.print("COD\tESTOQUE\t\tPREÇO\t\tNOME\n");
				linha(60);
				}
				
				for (Produtos produto : produtos) {
					System.out.println(produto.getCodigo() + "\t  " + produto.getQuantidadeEstoque() + "\t\t "
							+ produto.getPreco() + "\t\t" + produto.getNome());
				}
				
				
				int i=1;
				while(i>10 || opcao == 'S') {
				t.nextLine();
				System.out.println("Digite o codigo do produto para comprar: ");
				codProduto = t.nextLine().toUpperCase();
				System.out.println("Digite a quantidade comprada: ");
				quantidade = t.nextInt();
				
				for (Produtos produto : produtos) {
					if(codProduto.equals(produto.getCodigo())) {
						total = total +  produto.comprarProduto(quantidade);
						
					}
				  }
				
				
					System.out.println("DESEJA CONTINUAR COMPRANDO S/N");
					opcao = t.next().toUpperCase().charAt(0);
					while(opcao != 'S' && opcao != 'N') {
						System.out.println("OPÇÃO INVÁLIDA");
						System.out.println("DESEJA CONTINUAR COMPRANDO S/N");
						opcao = t.next().toUpperCase().charAt(0);
					}
				}
				// Cabeçalho
				linha(80);
				System.out.println("***********************************");
				System.out.println("            NOTA FISCAL            ");
				System.out.println("***********************************");
				linha(80);
				
				for (Produtos produto : produtos) {
					if(produto.getQuantidadeEstoque() != 10) {
					System.out.println(produto.getCodigo() + "\t  " + quantidade + "\t\t "
							+ produto.getPreco() + "\t\t" + produto.getNome());
					}
				}
				
				
				System.out.println("\nO TOTAL A SER PAGO É: R$" + total);
				
			}

			else if (tipo == '2') {

				System.out.println("WIP");
			}

			else if (tipo == '3') {

				System.out.println("OBRIGADO POR VISITAR A OUTLET DO DRÉZÃO");
				break;

			} else {
				System.out.println("Digite uma opção válida");
			}

			System.out.print("Deseja continuar comprando??\n\n[S]-Sim [N]-Não\n");
			opcao = t.next().toUpperCase().charAt(0);
			while (opcao != 'S' && opcao != 'N') {
				System.out.println("Digite uma opção válida");
				System.out.println("[S]-SIM [N]-NÃO");
				opcao = t.next().toUpperCase().charAt(0);
			}
			// cabeçalho menu de produtos
			linha(60);
			System.out.print("COD\tESTOQUE\t\tPREÇO\t\tNOME\n");
			linha(60);

			for (Produtos produto : produtos) {
				System.out.println(produto.getCodigo() + "\t  " + produto.getQuantidadeEstoque() + "\t\t "
						+ produto.getPreco() + "\t\t" + produto.getNome());
			}
		} while (opcao == 'S');

		System.out.println("PROGRAMA FINALIZADO!!");
		

	}

	public static void linha(int tamanho) {
		for (int i = 0; i < tamanho; i++) {
			System.out.print("═");
		}
		System.out.print("\n");
	}
}
