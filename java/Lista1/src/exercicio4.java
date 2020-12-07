import java.util.Scanner;

public class exercicio4 {
	public static void main(String[] args) {
		
		int A, B, C;
		double resultado;
		
		Scanner t = new Scanner(System.in);
		System.out.println("Digite o valor de A:");
		A = t.nextInt();
		System.out.println("Digite o valor de B:");
		B = t.nextInt();
		System.out.println("Digite o valor de C:");
		C = t.nextInt();
		
		resultado = ((Math.pow((A + B),2 ))  + (Math.pow((B + C),2 ))) / 2;
		
		System.out.println("O resultado da expressão é: " + resultado);
		
	}
}
