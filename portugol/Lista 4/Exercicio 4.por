programa
{
	
	funcao inicio()
	{
		real mat[3][3] 
		real soma=0.0
		real diagonal =0.0

		para(inteiro l = 0; l<3; l++){

			para(inteiro c = 0; c<3; c++){
				escreva("Digite um valor: ")
				leia(mat[l][c])
			}
			
		}

		para(inteiro l = 0; l<3; l++){

			para(inteiro c = 0; c<3; c++){
				soma = soma + mat[l][c]
			}
			
		}

		para(inteiro l = 0; l<3; l++){
			para(inteiro c = 0; c<3; c++){
				se (l == c){
					diagonal = mat[l][c] + diagonal
				}
			}
		}

		escreva("A soma dos valores da matriz é: ",soma)
		escreva("\nA soma da diagonal principal é: ",diagonal)
		
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 589; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = {mat, 6, 7, 3};
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */