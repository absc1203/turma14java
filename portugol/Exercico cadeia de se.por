programa
{
	inclua biblioteca Texto --> txt
	
	funcao inicio()
	{
		cadeia nomeAluno
		cadeia sexo
		inteiro nota=0

		escreva("Digite o seu nome: ")
		leia(nomeAluno)
		escreva("Digite o sexo que se identifica [M]-Masculino [F]-Feminino ")
		leia(sexo)
		sexo = txt.caixa_alta(sexo)
		escreva("Digite a sua nota ")
		leia(nota)

	
			se(sexo == "M"){
				se(nota > 5){
					escreva("Parabéns ", nomeAluno, " você esta aprovado")
					}senao{
					escreva("Infelizmente ",nomeAluno," você esta reprovado")
				}
			}
				se(sexo == "F"){
					se(nota > 5){
						escreva("Parabéns ", nomeAluno, " você esta aprovada")
				}senao{
					escreva("Infelizmente ",nomeAluno," você esta reprovada")
				}
		}senao{
			escreva("caractere inválido")
		}
		
	}
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 435; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */