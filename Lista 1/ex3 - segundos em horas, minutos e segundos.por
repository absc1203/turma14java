programa
{
	
	funcao inicio()
	{
		inteiro segEvento, horas, minutos, segundos
		
		escreva("=======Convertendo segundos para horas, minutos e segundos=======\n\n")
		escreva("Quantos segundos o evento durou??\n")
		leia(segEvento)

		horas = (segEvento / 3600)
		minutos = (segEvento % 3600) / 60
		segundos =  (segEvento % 360) % 60

		escreva("O evento possuiu ",horas, " horas, ",minutos," minutos e ",segundos," segundos")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 432; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */