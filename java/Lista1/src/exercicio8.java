import java.util.Scanner;

public class exercicio8 {

	public static void main(String[] args) {
	
		double valorFabrica, custoConsumidor, impostos, porcDistribuidor;
		
		Scanner t = new Scanner(System.in);
		
		System.out.println("Digite o valor de fábrica do carro");
		valorFabrica = t.nextDouble();
		
		impostos = valorFabrica * 0.45;
		porcDistribuidor = valorFabrica * 0.28;
		
		custoConsumidor = valorFabrica + impostos + porcDistribuidor;
		
		System.out.println("O custo do consumidor para um valor de fabrica de R$"+valorFabrica+ " é: R$"+custoConsumidor);
	

	}

}
