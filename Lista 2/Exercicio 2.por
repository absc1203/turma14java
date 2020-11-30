programa
{
	
	funcao inicio()
	{
		
	inteiro N, C
	real salarioFinal = 0, salarioExcedente = 0

	escreva("===============Exercício 2==============\n\n")

	escreva("Digite o código do funcionário: ")
	leia(C)
	escreva("Digite a quantidade de horas trabalhadas: ")
	leia(N)

	

	se(N > 50){
		salarioExcedente = (N - 50) * 20
		salarioFinal = 50 * 10
	}senao{
		salarioFinal = N * 10
		salarioExcedente = 0
	}

	salarioFinal = salarioFinal + salarioExcedente
	escreva("O salário total é: R$",salarioFinal," e o salário excedente é: R$",salarioExcedente)
	
		
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