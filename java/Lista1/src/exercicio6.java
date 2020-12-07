import java.util.Scanner;

public class exercicio6 {

	public static void main(String[] args) {
		double x1,x2,y1,y2,aux1,aux2,distancia;
		
		Scanner t = new Scanner(System.in);	
		
		System.out.println("Escreva o valor de x1:");
		x1 = t.nextDouble();
		System.out.println("Escreva o valor de y1:");
		y1 = t.nextDouble();
		System.out.println("Escreva o valor de x2:");
		x2 = t.nextDouble();
		System.out.println("Escreva o valor de y2:");
		y2 = t.nextDouble();
		
		
		aux1 = Math.pow((x2-x1), 2);
		aux2 = Math.pow((y2-y1), 2);
		
		distancia = Math.sqrt(aux1 + aux2);
		
		System.out.println("A distancia entre os pontos é: " + Math.round(distancia));
		

	}

}
