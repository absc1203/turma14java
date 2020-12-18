package teste;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercicio03_loja {

	public static void main(String[] args) {
		Scanner t = new Scanner(System.in);
		List<ProdutosLoja> produtos = new ArrayList<>();
		char op;

		System.out.println("Digite uma opcao");
		op = t.next().charAt(0);

		if (op == '1') {
			produtos.add(new ProdutosLoja("CAMISETA BRANCA", 10));
			produtos.add(new ProdutosLoja("CALÇA BEGE", 4));
			produtos.add(new ProdutosLoja("TENIS ST PRETO", 3));

			System.out.println("PRODUTO \t\tQTD ESTOQUE");
			for (ProdutosLoja produto : produtos) {
				System.out.println(produto.getProduto() + "\t\t" + produto.getEstoque());
			}

			// adicionando
			produtos.add(new ProdutosLoja("BONE VERDE", 16));
			produtos.add(new ProdutosLoja("BERMUDA MARROM", 8));

			System.out.println("\nLista Atualizada..");
			System.out.println("PRODUTO \t\tQTD ESTOQUE");
			for (ProdutosLoja lt : produtos) {
				System.out.println(lt.getProduto() + "\t\t" + lt.getEstoque());
			}
		}else if(op == '2') {
			
		// removendo
		System.out.print("Digite o item que quer remover: ");
		String nome = t.nextLine().toUpperCase();
		System.out.println("\nLista Atualizada..");
		System.out.println("PRODUTO \t\tQTD ESTOQUE");
		for (ProdutosLoja produto : produtos) {
			if (produto.getProduto().equals(nome)) {
				produtos.remove(produto);

			} else {
				System.out.println("NÃO É O MESMO NOME");
			}

			}
		}
		
		for (ProdutosLoja produto : produtos) {
			System.out.println(produto.getProduto() + "\t" + produto.getEstoque());
		}

	}

}