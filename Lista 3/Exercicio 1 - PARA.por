programa
{
	
	funcao inicio()
	{
		inteiro qtdFilhos 
		real salario=0.0, mediaSalario=0.0, porcSalario=0.0, maiorSalario=0.0, qtdPorcSalario = 0.0, mediaFilhos=0.0, totalFilhos=0.0
		const real NUMEROHAB = 20

		para(inteiro i = 1; i<=NUMEROHAB; i++){
			escreva("Pessoa ",i,"\n")
			escreva("Digite o seu salário: R$")
			leia(salario)
			escreva("Digite quantos filhos tem: ")
			leia(qtdFilhos)
			limpa()

			se(salario > maiorSalario){
				maiorSalario = salario
			}

			se (salario <= 100){
				qtdPorcSalario++
			}

			mediaSalario += salario
			totalFilhos = totalFilhos + qtdFilhos
		}
			mediaSalario /= NUMEROHAB //media de salarios
			porcSalario = (qtdPorcSalario*100)/NUMEROHAB //porcentagem que recebe até R$100
			mediaFilhos = totalFilhos / NUMEROHAB//media de filhos
			
			escreva("A média do salário da população é: R$",mediaSalario)
			escreva("\nA média do número de filhos da população é: ",mediaFilhos)
			escreva("\nO maior salário é: ",maiorSalario)
			escreva("\nPercentual de pessoas que ganham até R$100,00: ", porcSalario,"%")
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 770; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */