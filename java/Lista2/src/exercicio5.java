import java.util.Scanner;

public class exercicio5 {

	public static void main(String[] args) {
		
		double indicePoluicao;
		
		Scanner t = new Scanner(System.in);
		
		System.out.println("Digite o valor medio do �ndice de polui��o:");
		indicePoluicao = t.nextDouble();
		
		if(indicePoluicao > 0.25) {
			if(indicePoluicao >= 0.3 && indicePoluicao < 0.4) {
				System.out.println("Intima��o para as empresas do 1� grupo");
			}
			else if(indicePoluicao >= 0.4 && indicePoluicao < 5) {
				System.out.println("Intima��o para as empresas do 1� e 2� grupo");
			}
			else {
				System.out.println("Intima��o para as empresas do 1�, 2� e 3� grupo");
			}
		}
		else if(indicePoluicao < 0.05 && indicePoluicao > 0) {
			System.out.println("As empresas est�o poluindo menos do que o normal.");
		}
		else {
			System.out.println("N�mero inv�lido");
		}

	}

}
