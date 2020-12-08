import java.util.Scanner;

public class exercicio1 {

	public static void main(String[] args) {
		final int MULTAPORQUILO = 4;
		int P,E,M;
		
		Scanner t = new Scanner(System.in);
		System.out.println("Digige o valor do peso dos tomates");
		P = t.nextInt();
		
		if(P > 0) {
			if(P>50) {
				E = P - 50;
				M = E * MULTAPORQUILO;
				
				System.out.println("Houve um excesso (peso a mais "+E+"kg) e o valor da multa é R$"+M);
			}
			else {
				E = 0;
				M = 0;
				
				System.out.println("Não houve um excesso (peso a mais "+E+ "kg) e o valor da multa é R$"+M);
			}
		}
		else {
			System.out.println("Não existe peso negativo");
		}

	}

}
