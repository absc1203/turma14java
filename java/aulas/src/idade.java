import java.util.Scanner;

public class idade {

	public static void main(String[] args) {
		
		int anoNasc;
		
		Scanner t = new Scanner(System.in);
		System.out.println("Digite seu ano de nascimento");
		anoNasc = t.nextInt();
	
		if(idade(anoNasc)> 0) {
		if(idade(anoNasc) < 18) {
			System.out.println("Sua idade �:"+idade(anoNasc)+" anos e voc� � infanto-juvenil");
		}else if(idade(anoNasc) >= 18 && idade(anoNasc) < 60) {
			System.out.println("Sua idade �:"+idade(anoNasc)+" anos e voc� � adulto");
		}else {
			System.out.println("Sua idade �:"+idade(anoNasc)+" anos e voc� � idoso");
		}
		
		}else {
		  System.out.println("Digite uma idade v�lida");
	  }
	}
	
		public static int idade (int anoNasc) {
			int idade = 2020 - anoNasc;
			return idade;
		}

}
