import java.util.Scanner;

public class exercicio7 {

	public static void main(String[] args) {
		
		double altura=0, base=0;
		
		Scanner t = new Scanner(System.in);
		System.out.println("Digite o valor da altura do tri�ngulo");
		altura = t.nextDouble();
		System.out.println("Digite o valor da base do tri�ngulo");
		base = t.nextDouble();
		
		if(altura > 0 && base >0) {
			System.out.println("A �rea do tri�ngulo �: " + (altura*base)/2);
		}
		else {
			System.out.println("Base ou altura inv�lidos (os valores devem ser positivos");
		}

	}

}
