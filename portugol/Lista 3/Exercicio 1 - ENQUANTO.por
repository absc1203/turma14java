programa
{
	
	funcao inicio()
	{
		inteiro valor=0, somaValor=0, media=0, quantidade=0



		enquanto(valor >= 0){
			
			escreva("Digite um valor positivou / digite um valor negativo para parar.")
			leia(valor)
			somaValor += valor
			quantidade++
			
		}

		
		

		escreva("A SOMA DOS VALORES DIGITADOS FOI: ", somaValor)
		escreva("\nA MÉDIA DOS VALORES DIGITADOS FOI: ", somaValor / quantidade)
		escreva("\nA QUANTIDADE DE VALORES LIDOS FORAM: ", quantidade)
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 413; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */