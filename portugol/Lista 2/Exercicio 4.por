programa
{
	
	funcao inicio()
	{

		inteiro n
		
		escreva("Escreva um número para saber se é par ou ímpar: ")
		leia(n)
		
		se(n != 0){
		se(n > 0){
			se(n % 2 == 0){
				escreva("O número ",n," é par e positivo ")
			}senao{
				escreva("O número ",n," é ímpar e positivo")
			}
		}senao{
			se(n % 2 == 0){
				escreva("O número ",n," é par e negativo ")
			}senao{
				escreva("O número ",n," é ímpar e negativo")
			}
		}
		}senao{
			escreva("O número ",n," é neutro ")
		}
	}
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 474; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */