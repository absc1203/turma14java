programa{
	inclua biblioteca Util
	
	funcao inicio()
	{
		const inteiro G=3 ,P=0, E=1
		caracter resultado
		inteiro contSP=0, contCOR=0, contPAL=0, contSFC=0
		
 		para (inteiro rodada=1 ; rodada <=4; rodada++)
 		{
 			escreva("rodada ", rodada)
 			escreva("\n Corithians Ganhou[G]/Perdeu[P]/Empatou[E]")
 			leia (resultado)
 			se (resultado== 'G')
 			{
 				contCOR=contCOR+G
 			}
 			senao se( resultado == 'P')
 			{
 				contCOR = contCOR+P
 			}
 			senao se( resultado == 'E')
 			{
 				contCOR = contCOR+E
 			}
 		escreva("\n SãO Paulo Ganhou[G]/Perdeu[P]/Empatou[E]")
 			leia (resultado)
 			se (resultado== 'G')
 			{
 				contSP=contSP+G
 			}
 			senao se( resultado == 'P')
 			{
 				contSP = contSP+P
 			}
 			senao se( resultado == 'E')
 			{
 				contSP = contSP+E
 			}
 		escreva("\n Palmeiras Ganhou[G]/Perdeu[P]/Empatou[E]")
 			leia (resultado)
 			se (resultado== 'G')
 			{
 				contPAL=contPAL+G
 			}
 			senao se( resultado == 'P')
 			{
 				contPAL = contPAL+P
 			}
 			senao se( resultado == 'E')
 			{
 				contPAL = contPAL+E
 			}
 		escreva("\n Santos  Ganhou[G]/Perdeu[P]/Empatou[E]")
 			leia (resultado)
 			se (resultado== 'G')
 			{
 				contSFC=contSFC+G
 			}
 			senao se( resultado == 'P')
 			{
 				contSFC = contSFC+P
 			}
 			senao se( resultado == 'E')
 			{
 				contSFC = contSFC+E
 			}
 		}
 		escreva("pontuação COR:" ,contCOR, " ", "pontuação SP:",contSP," ", "pontuação PAL:",contPAL," ","pontuação SFC:",contSFC)
		
	}
			
	
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 1490; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */