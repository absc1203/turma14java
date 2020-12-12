
public class exercicio4 {

	public static void main(String[] args) {
		int x=1, soma=0;
		
		for(int i = 1;i<=50;i++) {
			soma = soma + (x/i);
			System.out.print(" "+x+"/"+i+" +");
			x=x+2;
		}
		
		System.out.print("\nsoma = " +soma);
	}

}
