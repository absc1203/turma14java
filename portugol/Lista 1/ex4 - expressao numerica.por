programa
{
	inclua biblioteca Matematica
	
	funcao inicio()
	{
		inteiro A, B, C
		real resultado
		
		escreva("============ Resolvendo expressão D = (R + S)/2 ============\n")
		escreva("============ fórmula: R = (A + B)^2 e S = (B + C)^2=========\n\n")

		escreva("Digite o valor de A: ")
		leia(A)
		escreva("Digite o valor de B: ")
		leia(B)
		escreva("Digite o valor de C: ")
		leia(C)

		resultado = ((Matematica.potencia(A + B, 2)) + (Matematica.potencia(B + C,2))) / 2
		
		escreva("O resultado da expressão é: ", resultado)
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 540; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */