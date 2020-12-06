programa
{
	
	funcao inicio()
	{
		inteiro numero = 0, cont25 = 0, cont50 = 0, cont75 = 0, cont100 = 0
		

		escreva("Digite um número positivo até 100 ou negativo para sair: ")
		leia(numero)

			enquanto(numero > 0){
				escreva("Digite um número positivo até 100 ou negativo para sair: ")
				leia(numero)

				se(numero <= 25){
					cont25++
				}
				senao se (numero > 25 e numero <=50){
					cont50++
				}
				senao se (numero > 50 e numero <=75){
					cont75++
				}
				senao se (numero > 75 e numero <=100){
					cont100++
				}
		}

		escreva("Quantas vezes apareceram números [0 - 25]: " ,cont25)
		escreva("\nQuantas vezes apareceram números [26 - 50]: " ,cont50)
		escreva("\nQuantas vezes apareceram números [51 - 75]: " ,cont75)
		escreva("\nQuantas vezes apareceram números [76 - 100]: " ,cont100)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 531; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */