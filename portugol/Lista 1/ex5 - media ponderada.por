programa
{
	
	funcao inicio()
	{
		real n1,n2,n3,media

		escreva("======== Calculando média ponderada =========\n\n")
		escreva("Digite a primeira nota (0 a 10): ")
		leia(n1)
		escreva("Digite a segunda nota (0 a 10): ")
		leia(n2)
		escreva("Digite a terceira nota (0 a 10): ")
		leia(n3)

		media = ((n1 * 2) + (n2 * 3) + (n3 * 5)) / (2+3+5)

		escreva("A média final é: ",media)
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 280; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */