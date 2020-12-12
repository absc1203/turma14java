import java.util.Scanner;

public class exercicio2 {

	public static void main(String[] args) {
		
		double altura=0, peso=0, imc = 0;
		
		Scanner t = new Scanner(System.in);
		
		System.out.println("Digite sua altura (ex.: 1,70)");
		altura = t.nextDouble();
		System.out.println("Digite o seu peso");
		peso = t.nextDouble();
		
		imc = (peso/ Math.pow(altura, 2));
		
		if(imc < 18.5) {
			System.out.println("Seu IMC É:" + imc);
			System.out.println("Está abaixo do peso");
		}
		else if(imc >= 18.5 && imc <= 25 ){
			System.out.println("Seu IMC É:" + imc);
			System.out.println("Está com peso normal"); 
		}
		else if (imc > 25 && imc <= 30) {
			System.out.println("Seu IMC É:" + imc);
			System.out.println("Está acima do peso");
		}
		else {
			System.out.println("Seu IMC É:" + imc);
			System.out.println("Está obeso");
		}

	}

}
