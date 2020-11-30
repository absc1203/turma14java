programa
{
	
	funcao inicio()
	{
		const inteiro MULTAPORQUILO = 4.0
		inteiro P, E, M

		escreva("===============Exercício 1==============\n\n")

		escreva("Digite o valor do peso dos tomates ")
		leia(P)


	se(P > 0){
		se(P > 50){
			E = P - 50
			M = E * MULTAPORQUILO

			escreva("Houve um excesso de ",E," e o valor da multa é R$",M)
			
		}senao{
			E = 0
			M = 0

			escreva("Não houve um excesso ",E," e não houve multa R$",M)
		}
		
	
	}senao{
		escreva("Não existe peso negativo")
	}
}

}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 500; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */