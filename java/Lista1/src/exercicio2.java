import java.util.Scanner;

public class exercicio2 {

	public static void main(String[] args) {
		int diasVividos, anos, meses,dias;
		
		Scanner t = new Scanner(System.in);
		System.out.println("Escreva quantos dias voc� j� viveu");
		diasVividos = t.nextInt();
		
		anos = (diasVividos / 365);
		meses = (diasVividos % 365) / 30;
		dias = (diasVividos % 365) % 30;
		
		System.out.println("Voc� ja viveu "+anos+" anos, "+meses+" meses e "+dias+" dias");

	}

}
