programa
{
	inclua biblioteca Matematica
	
	funcao inicio()
	{
		real x1,x2,y1,y2,aux1,aux2, distancia
		
		escreva("======== Calculando média ponderada =========\n\n")

		escreva("Escreva o valor de x1: ")
		leia(x1)
		escreva("Escreva o valor de x2: ")
		leia(x2)
		escreva("Escreva o valor de y1: ")
		leia(y1)
		escreva("Escreva o valor de y2: ")
		leia(y2)

		aux1 = Matematica.potencia((x2-x1) , 2)
		aux2 = Matematica.potencia((y2-y1) , 2)

		distancia = Matematica.raiz((aux1 + aux2),2)

		escreva("A distancia entre os pontos é: ", Matematica.arredondar(distancia, 2))
		
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 583; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */