programa
{
	inclua biblioteca Util --> u
	
	funcao inicio()
	{
		const inteiro TAMANHO = 10
		inteiro vet[TAMANHO]
		inteiro soma = 0, contMaior = 0
		inteiro maiorValor = 0

		escreva("================Exercício 2===============\n\n")
		escreva("------------------Vetor----------------\n")
		para(inteiro i = 0; i<TAMANHO; i++){
			vet[i] = u.sorteia(1, 6)
			soma = soma + vet[i]

			
			se(vet[i] > maiorValor){
				maiorValor = vet[i]
		}

		}

		para(inteiro i = 0; i<TAMANHO; i++){
			se(vet[i]== maiorValor){
				contMaior++
			}
		}

		para(inteiro i = 0; i<TAMANHO; i++){
			escreva(vet[i]," | ")	
		}
		
		escreva("\n\nA média aritimética dos lançamentos foi: ", soma/TAMANHO)
		escreva("\nO maior valor foi ", maiorValor," e apareceu ",contMaior, " vezes")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 446; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */