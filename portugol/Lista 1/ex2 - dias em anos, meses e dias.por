programa
{
	
	funcao inicio()
	{
		inteiro diasVividos, anos, meses, dias
		
		escreva("=======Convertendo dias para anos, meses e dias vividos=======\n\n")
		escreva("escreva quantos dias você já viveu??\n")
		leia(diasVividos)

		anos = (diasVividos / 365)
		meses = (diasVividos % 365) / 30
		dias =  (diasVividos % 365) % 30
		

		escreva("Você ja viveu: ",anos," anos, ",meses," meses e ",dias," dias")
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 407; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */