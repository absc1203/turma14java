import java.util.Scanner;

public class matricula {

	public static void main(String[] args) {
		String aluno[] = new String[] {"Allen de Lima Vieira","André de Brito Silva da Costa","Bárbara Liboni Guerra","Beatriz Martins","Beymar Jhoel Acapa Lima","Breno Nogueira Botelho Noccioli","Daniel Augusto Gomes Ferreira Filho","Danilo Mendes Ferreira","Danilo Pereira da Silva","Davi Silva Vieira","Diego Vinicio da Silva Nascimento","Erick Costa Ferreira","Ewerton Inacio Lima","FERNANDA AGAPITO","Fernanda Barbosa Ferraz","Francisco José Pires","Gabriel Enrique Cabral Silva","Gabriel Sérgio Nascimento Santos Gonçalves","Gideão da Silva Idelfonso","GILSON AMORIM DE MATOS","Guilherme Gonçalves da Silva","Gustavo Rabelo Teles","HELOISA BEATRIZ DE OLIVEIRA COSTA","Igor Mateus Queiroz Gato","Isabel Emiko Yamakawa Oyama","Jackeline Akemi de Moura","José Jorge Hauck Júnior","Juliana Santos André","Kélven Cleiton de Araújo Brandão","Laís Lima Santos","Lucas anseloni barros","Lucas Gonçalves da SIlva","luis felipe da silva","Luiz Felipe da Silva Magalhães","Marcos Eduardo Gomes Gonçalves","Micaely da Silva Lima","Rafaela Oliveira Silva","Tiago dos Santos Martins","Verônica Navarro Almenara","Vinicius Alves Miranda"};
		char sexos[] = new char[] {'M','M','F','F','M','M','M','M','M','M','M','M','M','F','F','M','M','M','M','M','M','M','F','M','F','F','M','F','M','F','M','M','M','M','M','F','F','M','F','M'};
		String matricula[] = new String[40];
		
		
		for(int i = 0; i<40; i++) {
			
			if(i < 9) {
			matricula[i] = "0" + (i+1);
			}
			else {
			matricula[i] = "" + (i+1);
			}
		}
		inseriLinha(60, "=");
		System.out.println(" MATRICULA   TIPO     NOME");
		inseriLinha(60, "=");
		for(int i = 0; i<39; i++) {
			
			
			
			if(sexos[i] == 'M') {
			System.out.println("    "+(matricula[i])+"\t     Aluno   " + aluno[i]);
			}else if (sexos[i] == 'F'){
				System.out.println("    "+(matricula[i])+"\t     Aluna   " + aluno[i]);
			}
		}
		
		
		Scanner t = new Scanner(System.in);
		
		System.out.print("Digite a matrícula para mostrar o aluno: ");
		
		
		
		

	}
	
	public static void inseriLinha(int tamanho, String simbolo) {
		for (int i = 0; i < tamanho; i++) {
			System.out.print(simbolo);
		}
		System.out.println();
	}

}
