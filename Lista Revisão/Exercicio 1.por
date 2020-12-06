programa
{
	inclua biblioteca Matematica --> mat
	
	funcao inicio()
	{
		real preco = 0.0
		inteiro tipo = 0

		escreva("Digite o valor da etiqueta do produto: R$")
		leia(preco)
		escreva("Qual a forma de pagamento??\n")
		escreva("[1] - A vista (Dinheiro/Cheque) - 20% de desconto)\n")
		escreva("[2] - A vista (Cartão de Crédito) - 15% de desconto)\n")
		escreva("[3] - Em 2x - sem desconto)\n")
		escreva("[4] - Em 3x - 10% de juros)\n")
		leia(tipo)

		escolha(tipo){
			caso 1:
				escreva("O valor é R$",preco)
				escreva("\nCom o desconto de 20% fica R$",preco - (preco*0.2))
			pare
				
			caso 2:
				escreva("O valor é R$",preco)
				escreva("\nCom o desconto de 20% fica R$",preco - (preco*0.15))
			pare

			caso 3:
				escreva("O valor é R$",preco)
				escreva("\nEm 2x de R$",preco/2)
			pare

			caso 4:
				escreva("O valor é R$",preco)
				escreva("\nCom o juros de 10% fica R$",preco + (preco*0.1))
				escreva("\nEm 3x de R$",mat.arredondar((preco +(preco*0.1))/3, 2))
			pare

			caso contrario:
				escreva("Digite uma opção válida")

			
		}
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 455; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */