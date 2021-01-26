programa
{
	
	funcao inicio()
	{
		inteiro anos, meses, dias, resultadoDias
		
		escreva("=======Convertendo anos,meses e dias para somente dias vividos=======\n\n")
		escreva("Digite sua idade em anos, meses e dias\n")
		escreva("Anos: ")
		leia(anos)
		escreva("Meses: ")
		leia(meses)
		escreva("Dias: ")
		leia(dias)

		resultadoDias = (anos * 365) + (meses * 30) + dias 

		escreva("Você possui: ", resultadoDias ," dias vividos")
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 376; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */