programa
{
	
	funcao inicio()
	{
		real valorFabrica,custoConsumidor,impostos,porcDistribuidor
		
		escreva("======== Calculando valor carro =========\n\n")
		escreva("Digite o valor de fábrica do carro: R$")
		leia(valorFabrica)

		impostos = valorFabrica * 0.45
		porcDistribuidor = valorFabrica * 0.28

		custoConsumidor = valorFabrica + impostos + porcDistribuidor

		escreva("O custo do consumidor para um valor de fabrica de R$", valorFabrica," é : R$", custoConsumidor)
		
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 487; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */