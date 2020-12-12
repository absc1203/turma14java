import java.util.Random;
import java.util.Scanner;

public class exercicio5 {

	public static void main(String[] args) {
		double vet[] = new double[5];
		int codigo =0;
		Random r = new Random();
		Scanner t = new Scanner(System.in);
		
		for(int i = 0; i<5; i++){
			vet[i] = r.nextInt(10)+1;
		}
		
		System.out.println("Digite o código para a ação");
		System.out.println("\n[1] - Vetor Normal\\n[2] - Vetor Invertido\n");
		codigo = t.nextInt();
		if(codigo == 1) {
			for(int i = 0; i<5; i++) {
				System.out.print(vet[i] + " | ");
			}
		}
		
		else if(codigo == 2) {
			for(int i = 4 ; i>=0; i--) {
				System.out.print(vet[i] + " | ");
			}
		}
		
		else {
			System.out.println("Código inváçido");
		}

	}

}
