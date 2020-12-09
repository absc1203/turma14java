import java.util.Scanner;

public class exercicio2Enquanto {

	public static void main(String[] args) {
		int valor=0;
		
		Scanner t = new Scanner(System.in);
		
		System.out.println("Digite um valor menor que 100");
		valor = t.nextInt();
		
		if(valor < 100 && valor > 0 ) {
			System.out.print(valor + " ");
			while(valor < 100) {
				valor = valor*3;
				System.out.print(valor + " ");
			}
		}
		else {
			System.out.println("O valor deve ser maior que 0 menor que 100");
		}

	}

}
