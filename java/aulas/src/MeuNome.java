import java.util.Scanner;

public class MeuNome {

	public static void main(String[] args) {
		
		System.out.println("Digite o seu nome:");		
		Scanner t = new Scanner(System.in);
		String nome = t.nextLine();
		
		System.out.println("Olá "+ nome);
	}

}
