import java.util.Random;


public class exercicio6
{
	public static void main(String[] args)
	{
		Random rand = new Random();
		int vetor[] = new int[3];
		int matriz[][] = new int [3][3];
		int mult;
		//só o vetor
		System.out.println("Vetor");
		for (int indice=0; indice<3;indice++)
		{
			vetor[indice]=rand.nextInt(9)+1;
			System.out.print(" | "+vetor[indice]+" | ");
		}
		
		//matriz
		System.out.println();
		System.out.println("Matriz");
		for (int linha=0;linha<3; linha++)
		{
			for (int coluna=0; coluna<3; coluna++)
			{
				matriz[linha][coluna]= rand.nextInt(9)+1;
				System.out.print(" | "+matriz[linha][coluna]+" | ");
			}
			System.out.println();
		}
		System.out.println("CALCULO");
		for (int linha=0;linha<3; linha++)
		{
			for (int coluna=0; coluna<3; coluna++)
			{
				mult = vetor[coluna]*matriz[linha][coluna];
				System.out.print(" | "+mult+" | ");
				
			}
			System.out.println();
		}
		
	}
}