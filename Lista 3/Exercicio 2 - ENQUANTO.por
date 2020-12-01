programa
{
	
	funcao inicio()
	{
		inteiro valor=0

		escreva("Digite um valor menor que 100: ")
		leia(valor)

		se(valor< 100 e valor > 0){
			escreva(valor," ")
			enquanto(valor < 100){
				valor = valor*3
				escreva(valor," ")
			}
		}senao{
			escreva("O valor deve ser maior que 0 e menor que 100")
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 247; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */