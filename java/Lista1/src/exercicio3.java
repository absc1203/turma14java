import java.util.Scanner;

public class exercicio3 {
	
	public static void main(String[] args) {
		int segEvento;
		
		Scanner t = new Scanner(System.in);
		System.out.println("Quantos segundos o evento durou??");
		segEvento = t.nextInt();
		
		int horas = (segEvento / 3600);
		int minutos = (segEvento % 3600) / 60;
		int segundos = (segEvento % 3600) % 60;
		
		System.out.println("O evento possuiu "+horas+" horas "+minutos+" minutos e "+segundos+" segundos");
				
	}

}
