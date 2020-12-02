programa
{
	
	funcao inicio()
	{
		real vet[5], maior=0
		

		escreva("================Exercício 1===============\n\n")

		para(inteiro i = 0; i<5; i++){
			escreva("Digite a ",i+1,"º valor: ")
			leia(vet[i])
			se(vet[i]> maior){
				maior = vet[i]
			}

			
		}

		escreva("O maior valor digitado foi ", maior)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 191; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */