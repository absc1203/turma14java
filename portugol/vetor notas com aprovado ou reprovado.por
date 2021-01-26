programa
{
	
	funcao inicio()
	{
		cadeia nomeAluno
		cadeia genero
		cadeia materias[] = {"PORTUGUÊS","MATEMÁTICA","CIÊNCIAS","ARTES"}
		inteiro nota[4]

		escreva("Digite o nome do Aluno(a) ")
		leia(nomeAluno)
		escreva("Digite o gênero que se identifica [M]-Masculino [F]-Feminino: ")
		leia(genero)
		

		
		para(inteiro i = 0; i<=3; i++){
			escreva("Digite a nota de ",materias[i], ": ")
			leia(nota[i])
		}

		se(genero == "F" ou genero == "f" ){
			para(inteiro i = 0; i<4 ;i++){
				se(nota[i] > 5){
					escreva("\nAluna ",nomeAluno," nota: ",nota[i]," em ",materias[i], " - Aprovada")
				}senao{
					escreva("\nAluna ",nomeAluno," nota: ",nota[i]," em ",materias[i], " - Reprovada")
				}
			}

			
		}senao se(genero == "M" ou genero == "m"){
				para(inteiro i = 0; i<4 ;i++){
				se(nota[i] > 5){
					escreva("\nAluno ",nomeAluno," nota: ",nota[i], " em ",materias[i]," - Aprovado")
				}senao{
					escreva("\nAluno ",nomeAluno," nota: ",nota[i], " em ",materias[i], " - Reprovado")
				}
			}
			
		}senao{
			
			escreva("Digite um gênero válido")
		}
		
	}

		
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 1069; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */