import java.util.Scanner;

public class exercicio1Enquanto {

	public static void main(String[] args) {
		
		int valor=0, somaValor=0, media=0, quantidade=0;
		Scanner t = new Scanner(System.in);
		
		while(valor >= 0) {
			System.out.println("Digite um valor positivo / Digite um valor negativo para finalizar o programa");
			valor = t.nextInt();
			somaValor += valor;
			quantidade++;
		}
		
		System.out.println("A SOMA DOS VALORES DIGITADOS FOI: "+ somaValor);
		System.out.println("MÉDIA DOS VALORES DIGITADOS FOI: "+somaValor/quantidade);
		System.out.println("QUANTIDADE DE VALORES LIDOS FORAM: " + quantidade);

	}

}
