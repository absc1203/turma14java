import java.util.Scanner;

public class exercicio6 {
	public static void main(String [] args) {
		
		int idade=0;
		
		Scanner t = new Scanner(System.in);
		
		System.out.println("Digite a idade do nadador(a):");
		idade = t.nextInt();
		
		if(idade < 5) {
			System.out.println("O nadador é muito novo, não entra em nenhuma categoria");
		}
		else if(idade <= 7) {
			System.out.println("Nadador(a) na categoria: Infantil A");
		}
		else if(idade <= 11) {
			System.out.println("Nadador(a) na categoria: Infantil B");		
		}
		else if(idade <= 13) {
			System.out.println("Nadador(a) na categoria: Juvenil A");
		}
		else if(idade <= 17) {
			System.out.println("Nadador(a) na categoria: Juvenil B");
		}
		else {
			System.out.println("Nadador(a) na categoria: Adultos");
		}
		
	}
}
