
public class exercicio2FacaEnquanto {

	public static void main(String[] args) {
		
		int valor=233;
		
		do {
			
			
			System.out.print(valor+" ");
			valor = valor + 5;
			while(valor > 300 && valor < 400) {
				System.out.print(valor+" ");
				valor = valor + 3;
			}
			
			
		}while(valor < 456);

	}

}
