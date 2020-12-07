import java.util.Scanner;

public class exercicio7 {

	public static void main(String[] args) {
		double a,b,c,d,e,f,x,y;
		
		Scanner t = new Scanner(System.in);
		
		System.out.println("Escreva o valor de A:");
		a = t.nextDouble();
		System.out.println("Escreva o valor de B:");
		b = t.nextDouble();
		System.out.println("Escreva o valor de C:");
		c = t.nextDouble();
		System.out.println("Escreva o valor de D:");
		d = t.nextDouble();
		System.out.println("Escreva o valor de E:");
		e = t.nextDouble();
		System.out.println("Escreva o valor de F:");
		f = t.nextDouble();
		
		x = (((c*e)-(b*f)) / ((a*e)-(b*d)));
		y = (((a*f)-(c*d)) / ((a*e)-(b*d)));
		
		System.out.println("O resultado de x = "+x+", y = "+y);
		

	}

}
