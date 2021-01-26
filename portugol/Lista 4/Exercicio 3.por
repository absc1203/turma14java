programa
{
	inclua biblioteca Util --> u
	
	funcao inicio()
	{
		inteiro N1[4][6], N2[4][6], M1[4][6], M2[4][6]

		para(inteiro l = 0; l<4 ; l++){
			escreva("\n")
			para(inteiro c = 0; c<6 ; c++){
				N1[l][c] = u.sorteia(1, 100)
				N2[l][c] = u.sorteia(1, 100)
			}
		}

		escreva("\n================ Matriz 1 ===================")
		
		para(inteiro l = 0; l<4 ; l++){
			escreva("\n")
			para(inteiro c = 0; c<6 ; c++){
				escreva(N1[l][c]," ")
			}
		}
		escreva("\n================ Matriz 2 ===================")

		para(inteiro l = 0; l<4 ; l++){
			escreva("\n")
			para(inteiro c = 0; c<6 ; c++){
				escreva(N2[l][c]," ")
			}
		}
		//Fazendo soma e subtração das matrizes
		para(inteiro l = 0; l<4 ; l++){
			escreva("\n")
			para(inteiro c = 0; c<6 ; c++){
				M1[l][c] = N1[l][c] + N2[l][c]
				M2[l][c] = N1[l][c] - N2[l][c]
			}
		}
		escreva("\n============== Matrizes Somadas =================")

		para(inteiro l = 0; l<4 ; l++){
			escreva("\n")
			para(inteiro c = 0; c<6 ; c++){
				escreva(M1[l][c]," ")
		
			}
		}
		escreva("\n============== Matrizes Subtraídas =================")

		para(inteiro l = 0; l<4 ; l++){
			escreva("\n")
			para(inteiro c = 0; c<6 ; c++){
				escreva(M2[l][c]," ")
			}
		}
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 274; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = {N1, 7, 10, 2}-{N2, 7, 20, 2}-{M1, 7, 30, 2}-{M2, 7, 40, 2};
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */