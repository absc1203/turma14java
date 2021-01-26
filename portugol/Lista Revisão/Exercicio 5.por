programa
{
	inclua biblioteca Util --> u
	
	funcao inicio()
	{
		real vet[5]
		inteiro codigo = 0

		para(inteiro i = 0; i<5; i++){
			vet[i] = u.sorteia(1, 10)
		}

		escreva("Digite o código para a ação")
		escreva("\n[1] - Vetor Normal\n[2] - Vetor Invertido\n")
		leia(codigo)

		se(codigo == 1){
			para(inteiro i = 0; i<5; i++){
			escreva(vet[i]," | ")
			}
		}
		senao se(codigo == 2){
			para(inteiro i = 4; i>=0; i--){
			escreva(vet[i]," | ")
			}
		}senao{
			escreva("Código informado inválido")
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 413; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = {vet, 7, 7, 3};
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */