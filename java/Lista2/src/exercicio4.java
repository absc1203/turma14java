import java.util.Scanner;

public class exercicio4 {

	public static void main(String[] args) {
		int n=0;
		
		Scanner t = new Scanner(System.in);
		
		System.out.println("Digite um n�mero para saber se � par ou �mpar");
		n = t.nextInt();
		
		if(n!=0) {
			if(n>0) {
				if(n%2==0) {
					System.out.println("O n�mero "+n+" � par e positivo");
				}
				else {
					System.out.println("O n�mero "+n+" � �mpar e positivo");
				}
			}
			else {
				if(n%2==0) {
					System.out.println("O n�mero "+n+" � par e negativo");
				}
				else {
					System.out.println("O n�mero "+n+" � �mpar e negativo");
				}
			}
			
		}else {
			System.out.println("O n�mero "+n+" � neutro");
		}

	}

}
