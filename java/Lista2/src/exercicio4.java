import java.util.Scanner;

public class exercicio4 {

	public static void main(String[] args) {
		int n=0;
		
		Scanner t = new Scanner(System.in);
		
		System.out.println("Digite um número para saber se é par ou ímpar");
		n = t.nextInt();
		
		if(n!=0) {
			if(n>0) {
				if(n%2==0) {
					System.out.println("O número "+n+" é par e positivo");
				}
				else {
					System.out.println("O número "+n+" é ímpar e positivo");
				}
			}
			else {
				if(n%2==0) {
					System.out.println("O número "+n+" é par e negativo");
				}
				else {
					System.out.println("O número "+n+" é ímpar e negativo");
				}
			}
			
		}else {
			System.out.println("O número "+n+" é neutro");
		}

	}

}
