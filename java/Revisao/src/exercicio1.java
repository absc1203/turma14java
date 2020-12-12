import java.util.Scanner;

public class exercicio1 {

	public static void main(String[] args) {
		double preco = 0;
		int tipo = 0;
		Scanner t = new Scanner(System.in);
		System.out.println("Digite o valor do produto: R$");
		preco = t.nextDouble();
		
		System.out.println("Qual a forma de pagamento??\n");
		System.out.println("[1] - A vista (Dinheiro/Cheque) - 20% de desconto)\n");
		System.out.println("[2] - A vista (Cartão de Crédito) - 15% de desconto)\n");
		System.out.println("[3] - Em 2x - sem desconto)\n");
		System.out.println("[4] - Em 3x - 10% de juros)\n");
		tipo = t.nextInt();
		
		switch(tipo) {
		case 1:
			System.out.println("O valor é R$" + preco);
			System.out.println("\nCom o desconto de 20% fica R$"+ (preco - (preco*0.2)));
			break;
			
		case 2:
			System.out.println("O valor é R$"+preco);
			System.out.println("\nCom o desconto de 20% fica R$" + (preco - (preco*0.15)));
			break;

		case 3:
			System.out.println("O valor é R$"+preco);
			System.out.println("\nEm 2x de R$"+preco/2);
			break;

		case 4:
			System.out.println("O valor é R$"+preco);
			System.out.println("\nCom o juros de 10% fica R$" + (preco + (preco*0.1)));
			System.out.println("\nEm 3x de R$" + Math.round(((preco +(preco*0.1))/3)));
		break;

		default:
			System.out.println("Digite uma opção válida");
		}
	}

}
