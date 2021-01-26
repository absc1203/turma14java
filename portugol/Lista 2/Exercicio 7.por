programa
{
	
	funcao inicio()
	{
		/*
		Receber valores de base e altura de um triângulo e verificar se são valores válidos (positivos maiores 
		que zero). Em caso afirmativo, calcular a área do triângulo.
		*/

		real altura, base

		escreva("===============Exercício 7==============\n\n")

		escreva("Digite o valor da altura do triângulo: ")
		leia(altura)
		escreva("Digite o valor da base do triângulo: ")
		leia(base)

		se(altura > 0 e base > 0){
			escreva("A área do triângulo é: ",(altura*base)/2)
		}senao{
			escreva("Base ou altura invalidos(os valores devem ser positivos maiores que 0)")
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 271; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */