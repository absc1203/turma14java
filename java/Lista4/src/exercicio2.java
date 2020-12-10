import java.util.Random;

public class exercicio2 {

	public static void main(String[] args) {
		final int TAMANHO = 10;
		int vet[] = new int[TAMANHO];
		int soma = 0, contMaior = 0, maiorValor=0;
		Random r = new Random();
		
		for(int i=0; i<TAMANHO; i++) {
			vet[i] = r.nextInt(6) + 1;
			soma = soma + vet[i];
			
			if(vet[i] > maiorValor) {
				maiorValor = vet[i];
			}
		}
		
		for(int i=0; i<TAMANHO; i++) {
			if(vet[i]== maiorValor) {
				contMaior++;
			}
		}
		
		for(int i=0; i<TAMANHO; i++) {
			System.out.print(vet[i] + " | ");
		}
		
		System.out.println("\n\nA média aritimética dos lançamentos foi:" + (soma/TAMANHO));
		System.out.println("O maior valor foi "+maiorValor+" e apareceu "+contMaior+" vezes");

	}

}
