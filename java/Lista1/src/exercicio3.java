import java.util.Scanner;

public class exercicio3 {

	public static void main(String[] args) {
		int segEvento, horas, minutos, segundos;
		
		Scanner t = new Scanner(System.in);
		System.out.println("Quantos segundos o evento durou??");
		segEvento = t.nextInt();
		
		horas = (segEvento / 3600);
		minutos = (segEvento % 3600) / 60;
		segundos = (segEvento % 3600) % 60;
		
		System.out.println("O evento possuiu "+horas+" horas "+minutos+" minutos e "+segundos+" segundos");
				
	}

}
