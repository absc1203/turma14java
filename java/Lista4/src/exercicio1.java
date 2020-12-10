import java.util.Scanner;

public class exercicio1 {

	public static void main(String[] args) {
		
		Scanner t = new Scanner(System.in);
		double vet[] = new double[5], maior=0;
		
		for(int i=0; i<5;i++) {
			System.out.println("Digite o "+(i+1)+"º valor:");
			vet[i] = t.nextDouble();
			if(vet[i]>maior) {
				maior = vet[i];
			}
		}
			System.out.println("O maior valor digitado foi: " + maior);
	}

}
