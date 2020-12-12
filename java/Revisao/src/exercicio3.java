import java.util.Scanner;

public class exercicio3 {

	public static void main(String[] args) {
		
		int numero = 0, cont25 = 0, cont50 = 0, cont75 = 0, cont100 = 0;
		Scanner t = new Scanner(System.in);
		
		System.out.println("Digite um número positivo até 100 ou negativo para sair: ");
		numero = t.nextInt();
		
		while(numero>0) {
			System.out.println("Digite um número positivo até 100 ou negativo para sair: ");
			numero = t.nextInt();
			
			if(numero <= 25){
				cont25++;
			}
			else if (numero > 25 && numero <=50){
				cont50++;
			}
			else if (numero > 50 && numero <=75){
				cont75++;
			}
			else if (numero > 75 && numero <=100){
				cont100++;
			}
		}
		
		System.out.println("Quantas vezes apareceram números [0 - 25]: " + cont25);
		System.out.println("Quantas vezes apareceram números [26 - 50]: " + cont50);
		System.out.println("Quantas vezes apareceram números [51 - 75]: " + cont75);
		System.out.println("Quantas vezes apareceram números [76 - 100]: " + cont100);
	}

}
