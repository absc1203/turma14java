import java.util.Scanner;

public class exercicio4 {

	public static void main(String[] args) {
		Scanner t = new Scanner(System.in);
		double mat[][] = new double[3][3];
		double soma=0, diagonal=0;
		
		
		for(int l=0; l<3; l++) {
			for(int c=0; c<3; c++) {
				System.out.println("Digite um valor: ");
				mat[l][c] = t.nextDouble();
				
				soma = soma + mat[l][c];
			}
		}
		
		for(int l=0; l<3; l++) {
			for(int c=0; c<3; c++) {
				if(l==c) {
				diagonal = diagonal + mat[l][c];
				}
			}
		}
		
		System.out.println("===== Matriz =====");
		for(int l=0; l<3; l++) {
			for(int c=0; c<3; c++) {
				System.out.print(" | "+mat[l][c]);
			}
			System.out.print("\n");
		}
		
		
		System.out.print("A soma dos valores da matriz é: " + soma);
		System.out.print("\nA soma da diagonal principal é: " + diagonal);
		
	}

}
