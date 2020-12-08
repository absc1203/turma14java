import java.util.Scanner;

public class exercicio3 {

	public static void main(String[] args) {
		int n1=0,n2=0,n3=0,n4=0;
		
		Scanner t = new Scanner(System.in);
		
		System.out.println("Digite o primeiro valor:");
		n1 = t.nextInt();
		System.out.println("Digite o segundo valor:");
		n2 = t.nextInt();
		System.out.println("Digite o terceiro valor:");
		n3 = t.nextInt();
		System.out.println("Digite o quarto valor:");
		n4 = t.nextInt();
		
		double q1 = Math.pow(n1, 2);
		double q2 = Math.pow(n2, 2);
		double q3 = Math.pow(n3, 2);
		double q4 = Math.pow(n4, 2);
		
		
		if(q3 >= 1000) {
			System.out.println("Valor3: "+n3+" seu quadrado é: "+q3);
		}
		else {
			System.out.println("Valor 1: "+n1+", e seu quadrado é: "+q1);
			System.out.println("Valor 2: "+n2+", e seu quadrado é: "+q2);
			System.out.println("Valor 3: "+n3+", e seu quadrado é: "+q3);
			System.out.println("Valor 4: "+n4+", e seu quadrado é: "+q4);
		}

	}

}
