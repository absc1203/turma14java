import java.util.Scanner;

public class exercicio2Para {

	public static void main(String[] args) {
		
		int soma=0;
		
		for(int i = 0; i<500; i++) {
			if(i%3==0 && i%2 != 0) {
				soma += i;
			}
		}
		System.out.println("A soma dos números ímpares multiplos de 3 são: " + soma);	
	}

}
