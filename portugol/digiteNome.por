programa
{
	
	funcao inicio()
	{
		cadeia nomePessoa
		inteiro anoNasc
		
		escreva("Digite o nome da Pessoa: ") //entrando com o nome da pessoa.
		leia(nomePessoa) //lendo o nomePessoa.
		escreva("Digite o seu ano de Nascimento(com quatro dígitos): ")
		leia(anoNasc)
		escreva("Oi "+nomePessoa+", estamos na Generation, sua idade é aproximadamente "+ (2020 - anoNasc)+ " anos")//exibindo a mensagem.
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 218; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */