programa
{
	inclua biblioteca Matematica --> mat
	
	funcao inicio()
	{

		inteiro n1=0,n2=0,n3=0,n4=0,q1,q2,q3,q4
		
		escreva("===============Exercício 3==============\n\n")

		escreva("Digite o primeiro valor: ")
		leia(n1)
		escreva("Digite o segundo valor: ")
		leia(n2)
		escreva("Digite o terceiro valor: ")
		leia(n3)
		escreva("Digite o quarto valor: ")
		leia(n4)

		q1 = mat.potencia(n1, 2)
		q2 = mat.potencia(n2, 2)
		q3 = mat.potencia(n3, 2)
		q4 = mat.potencia(n4, 2)

		se (q3 >= 1000){
			escreva("\nValor 3: ",n3," , e seu quadrado é: ",q3)
		}senao{
			escreva("Valor 1: ",n1," , e seu quadrado é: ",q1)
			escreva("\nValor 2: ",n2," , e seu quadrado é: ",q2)
			escreva("\nValor 3: ",n3," , e seu quadrado é: ",q3)
			escreva("\nValor 4: ",n4," , e seu quadrado é: ",q4)
		}
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 154; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */