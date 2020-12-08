import java.util.Scanner;

public class exercicio7 {

	public static void main(String[] args) {
		
		double altura=0, base=0;
		
		Scanner t = new Scanner(System.in);
		System.out.println("Digite o valor da altura do triângulo");
		altura = t.nextDouble();
		System.out.println("Digite o valor da base do triângulo");
		base = t.nextDouble();
		
		if(altura > 0 && base >0) {
			System.out.println("A área do triângulo é: " + (altura*base)/2);
		}
		else {
			System.out.println("Base ou altura inválidos (os valores devem ser positivos");
		}

	}

}
