package poo;
import java.util.Scanner;
public class LojaLoka
{
	public static void main(String[] args)
	{
		
		Scanner t = new Scanner(System.in);
		Pessoa cliente = new Pessoa();	
		byte escolha,qtdEscolha;
		double conta = 0;
		
		//tres produtos no programa
		// vestido - 100,00 - 3 estoque
		// blusa - 50,00 - 1 estoque
		// camise - 20,00 - 20 em estoque
		// escolha, dizer a quantidade  e  vai mostrar o total a pagar
		
		
		Produto p1 = new Produto("Vestido" , 3 , 100.00);
		Produto p2 = new Produto("Blusa" , 1 , 50.00);
		Produto p3 = new Produto("Camisa" , 20 , 20.00);
	
		
		
		System.out.println("Bom dia, digite o seu nome: ");
		cliente.nome = t.next().toUpperCase();
		System.out.println("Vc é Masculuno, Feminino ou Outros: [M/F/O");
		cliente.genero = t.next().toUpperCase().charAt(0);
		
		System.out.printf("Bom dia %s !!!\n", cliente.nome);

		System.out.println("Qual produto você quer??");
		System.out.println("[1]-"+p1.nomeProduto+ "[2]-"+p2.nomeProduto+" [3]-"+p3.nomeProduto);
		escolha = t.nextByte();
		
		while(escolha != 1 && escolha != 2 && escolha != 3) {
			System.out.println("Digite um numero válido");
		}
		
		if(escolha == 1) {
			System.out.println("Digite a quantidade");
			qtdEscolha = t.nextByte();
			
			while(qtdEscolha > p1.qtdEstoque) {
				System.out.println("Não tem essa quantidade no estoque. Digite um valor valido");
				qtdEscolha = t.nextByte();
			}
			
			p1.qtdEstoque = p1.qtdEstoque - qtdEscolha;
			conta = qtdEscolha * p1.valorUnitario;
			
			System.out.printf("PRODUTO: %s\nQUANTIDADE: %d\nVALOR A SER PAGO: %.2f" , p1.nomeProduto, qtdEscolha, conta);
			
			
		}
		if(escolha == 2) {
			System.out.println("Digite a quantidade");
			qtdEscolha = t.nextByte();
			
			while(qtdEscolha > p2.qtdEstoque) {
				System.out.println("Não tem essa quantidade no estoque. Digite um valor valido");
				qtdEscolha = t.nextByte();
			}
			
			p2.qtdEstoque = p2.qtdEstoque - qtdEscolha;
			conta = qtdEscolha * p2.valorUnitario;
			
			System.out.printf("PRODUTO: %s\nQUANTIDADE: %d\nVALOR A SER PAGO: %.2f" , p2.nomeProduto, qtdEscolha, conta);
			
		}
		if(escolha == 3) {
			System.out.println("Digite a quantidade");
			qtdEscolha = t.nextByte();
			
			while(qtdEscolha > p3.qtdEstoque) {
				System.out.println("Não tem essa quantidade no estoque. Digite um valor valido");
				qtdEscolha = t.nextByte();
			}
			
			p3.qtdEstoque = p3.qtdEstoque - qtdEscolha;
			conta = qtdEscolha * p3.valorUnitario;
			
			System.out.printf("PRODUTO: %s\nQUANTIDADE: %d\nVALOR A SER PAGO: %.2f" , p3.nomeProduto, qtdEscolha, conta);
			
		}
		
		System.out.println();
		
	}
}