import java.util.Scanner;

public class exercicio5 {

	public static void main(String[] args) {
		
		double indicePoluicao;
		
		Scanner t = new Scanner(System.in);
		
		System.out.println("Digite o valor medio do índice de poluição:");
		indicePoluicao = t.nextDouble();
		
		if(indicePoluicao > 0.25) {
			if(indicePoluicao >= 0.3 && indicePoluicao < 0.4) {
				System.out.println("Intimação para as empresas do 1º grupo");
			}
			else if(indicePoluicao >= 0.4 && indicePoluicao < 5) {
				System.out.println("Intimação para as empresas do 1º e 2º grupo");
			}
			else {
				System.out.println("Intimação para as empresas do 1º, 2º e 3º grupo");
			}
		}
		else if(indicePoluicao < 0.05 && indicePoluicao > 0) {
			System.out.println("As empresas estão poluindo menos do que o normal.");
		}
		else {
			System.out.println("Número inválido");
		}

	}

}
