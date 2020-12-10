import java.util.Random;

public class exercicio3 {

	public static void main(String[] args) {
		
		int N1[][] = new int[4][6];
		int N2[][] = new int[4][6];
		int M1[][] = new int[4][6];
		int M2[][] = new int[4][6];
		
		Random r = new Random();
		
		for(int l = 0; l<4; l++) {
			for(int c = 0; c<4; c++) {
				N1[l][c] = r.nextInt(100) + 1;
				N2[l][c] = r.nextInt(100) + 1;						
			}
		}
		System.out.println("=== Matriz 1 ===");
		
		for(int l = 0; l<4; l++) {
			for(int c = 0; c<4; c++) {
				if(N1[l][c]>9) {
				System.out.print("  "+N1[l][c]);
				}
				else {
					System.out.print("  0"+N1[l][c]);
				}
			}
			System.out.print("\n");
		}
		System.out.print("\n");
		System.out.println("=== Matriz 2 ===");
		
		for(int l = 0; l<4; l++) {
			for(int c = 0; c<4; c++) {
				if(N2[l][c]>9) {
				System.out.print("  "+N2[l][c]);
				}
				else {
					System.out.print("  0"+N2[l][c]);
				}
			}
			System.out.print("\n");
		}
		
		System.out.print("\n");
		System.out.println("=== Matrizes somadas ===");
		
		for(int l = 0; l<4; l++) {
			for(int c = 0; c<4; c++) {
				System.out.print("  " +(N1[l][c] + N2[l][c]));
			}
			System.out.print("\n");
		}
		
		System.out.print("\n");
		System.out.println("=== Matrizes subtraídas ===");
		
		for(int l = 0; l<4; l++) {
			for(int c = 0; c<4; c++) {
				System.out.print("  " +(N1[l][c] - N2[l][c]));
			}
			System.out.print("\n");
		}
		
		
	}

}
