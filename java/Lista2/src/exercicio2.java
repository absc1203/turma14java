import java.util.Scanner;

public class exercicio2 {

	public static void main(String[] args) {
		int N, C;
		double salarioFinal = 0 ,salarioExcedente = 0;
		
		Scanner t = new Scanner(System.in);
		
		System.out.println("Digite o c�digo do funcion�rio:");
		C = t.nextInt();
		System.out.println("Digite a quantidade de horas trabalhadas:");
		N = t.nextInt();
		
		
		if(N > 50) {
			salarioExcedente = (N - 50) *20;
			salarioFinal = 50*10;
			
		}
		else {
			salarioFinal  = N * 50;
			salarioExcedente = 0;
		}
		
		salarioFinal = salarioFinal + salarioExcedente;
		System.out.println("O sal�rio total �: R$"+salarioFinal+" e o sal�rio excedente �: R$"+salarioExcedente);

	}

}
