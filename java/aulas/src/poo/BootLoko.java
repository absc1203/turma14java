package poo;

import java.util.Scanner;

public class BootLoko {

	public static void main(String[] args) {
		
		Scanner t = new Scanner(System.in);
		Pessoa p1 = new Pessoa();
		
		//Entrada de dados
		System.out.println("Digite o seu nome: ");
		p1.nome = t.next().toUpperCase();
		System.out.println("Digite o seu ano de nascimento");
		p1.anoNascimento = t.nextInt();
		System.out.println("Vc é Masculuno, Feminino ou Outros: [M/F/O]");
		p1.genero = t.next().toUpperCase().charAt(0);
		while(p1.genero != 'M' && p1.genero != 'F' && p1.genero != 'O') {
			System.out.println("Opção inválida. \nDigite [M - Masculino/F - Feminino/O - Outros]");
			p1.genero = t.next().toUpperCase().charAt(0);
		}
		
			p1.voltaGenero(p1.genero, p1.nome);
		

	}

}
