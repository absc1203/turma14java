import java.util.Scanner;

public class exercicio8 {

	public static void main(String[] args) {
		
		double N=0;
		
		Scanner t = new Scanner(System.in);
		
		System.out.println("Digite um número qualquer");
		N = t.nextDouble();
		
		if(N > 100) {
			System.out.println(N);
		}
		else {
			System.out.println("0");
		}

	}

}
