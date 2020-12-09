import java.util.Scanner;

public class exercicio1FacaEnquanto {

	public static void main(String[] args) {
		int valor=0, cont=1,soma=0;
		
		Scanner t = new Scanner(System.in);
		
		System.out.println("Digite um número");
		valor = t.nextInt();
		
		do {
			soma += cont;
			cont++;
		}while(cont <= valor);
		
		System.out.println(soma);
		

	}

}
