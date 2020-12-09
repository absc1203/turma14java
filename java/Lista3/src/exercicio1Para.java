import java.util.Scanner;

public class exercicio1Para {

	public static void main(String[] args) {
		double salario = 0,mediaSalario = 0, porcSalario=0,maiorSalario=0,qtdPorcSalario=0,mediaFilhos=0,totalFilhos=0,qtdFilhos=0;
		final double NUMEROHAB = 3;
		Scanner t = new Scanner(System.in);
		
		for(int i = 0; i < NUMEROHAB; i++ ) {
			System.out.println("Pessoa "+(i+1));
			System.out.println("Digite o seu salário: R$");
			salario = t.nextDouble();
			System.out.println("Digite quantos filhos tem: ");
			qtdFilhos = t.nextDouble();
			
			if(salario > maiorSalario) {
				maiorSalario = salario;
			}
			
			if(salario <= 100) {
				qtdPorcSalario++;
			}
			
			mediaSalario = mediaSalario + salario;
			totalFilhos = totalFilhos + qtdFilhos;
			
		}
		
			mediaSalario /= NUMEROHAB;
			porcSalario = (qtdPorcSalario*100)/NUMEROHAB;
			mediaFilhos = totalFilhos / NUMEROHAB;
			
			System.out.println("A média do salário da população é: R$"+mediaSalario);
			System.out.println("A média do número de filhos da população é: "+Math.round(mediaFilhos));
			System.out.println("O maior salário é: "+maiorSalario);
			System.out.printf("Percentual de pessoas que ganham até R$100,00: %.2f"  ,porcSalario, "%");
			t.close();

	}

}
