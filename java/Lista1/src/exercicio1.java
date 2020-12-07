import java.util.Scanner;

public class exercicio1 {

	public static void main(String[] args) {
		int anos, meses, dias, resultadoDias;
		
		Scanner t = new Scanner(System.in);
		System.out.println("Digite a sua idade em anos, meses e dias");
		System.out.println("Anos:");
		anos = t.nextInt();
		System.out.println("Meses");
		meses = t.nextInt();
		System.out.println("Dias");
		dias = t.nextInt();
		
		resultadoDias = (anos * 365) + (meses * 30) + dias;
		
		System.out.println("Você possui: " + resultadoDias + " dias vividos");
		
		
	}

}
