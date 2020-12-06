programa
{
	inclua biblioteca Matematica --> mat
	
	funcao inicio()
	{
		real altura = 0.0, peso = 0.0, imc = 0.0

		escreva("Digite a sua altura (ex: 1.70): ")
		leia(altura)
		escreva("Digite o seu peso: ")
		leia(peso)

		imc = (peso / mat.potencia(altura, 2))

		se(imc < 18.5){
			escreva("Seu IMC é: ",mat.arredondar(imc, 2))
			escreva("\nEstá abaixo do peso")
			
		}senao se (imc >= 18.5 e imc <= 25 ){
			escreva("Seu IMC é: ",mat.arredondar(imc, 2))
			escreva("\nEstá com peso normal")
		}senao se (imc > 25 e imc <= 30 ){
			escreva("Seu IMC é: ",mat.arredondar(imc, 2))
			escreva("\nEstá acima do peso")
		}senao{
			escreva("Seu IMC é: ",mat.arredondar(imc, 2))
			escreva("\nEstá obeso")
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 676; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */