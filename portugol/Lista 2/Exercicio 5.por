programa
{
	
	funcao inicio()
	{
		real indicePoluicao

		escreva("===============Exercício 5==============\n\n")

		escreva("Digite o valor medido do índice de poluição: ")
		leia(indicePoluicao)


		se(indicePoluicao > 0.25){
			se(indicePoluicao >=0.3 e  indicePoluicao < 0.4){
				escreva("Intimação para as empresas do 1º grupo")
			}senao se(indicePoluicao >= 0.4 e indicePoluicao < 0.5){
				escreva("Intimação para as empresas do 1º e 2º grupo")
			}senao{
				escreva("Intimação para as empresas do 1º, 2º e 3º grupo")
			}
			
			
		}senao se(indicePoluicao < 0.05 e indicePoluicao > 0){
			escreva("As empresas estão poluindo menos do que deveriam. ")
		}senao{
			escreva("Número inválido")
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 711; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */