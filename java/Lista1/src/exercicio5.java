import java.util.Scanner;

public class exercicio5 {
	public static void main(String[] args) {
		
		double n1,n2,n3, media;
		
		Scanner t = new Scanner(System.in);
		
		System.out.println("Digite a primeira nota (0 a 10):");
		n1 = t.nextDouble();
		System.out.println("Digite a segunda nota (0 a 10):");
		n2 = t.nextDouble();
		System.out.println("Digite a terceira nota (0 a 10):");
		n3 = t.nextDouble();
		
		media = ((n1 * 2) + (n2 * 3) + (n3 * 5)) / (2+3+5);
		
		System.out.println("A média final é:" + media);
	}
}
