programa
{
	
	funcao inicio()
	{

		/*
		Elabore um sistema que dada a idade de um nadador classifique-o em uma das seguintes categorias:
		Infantil A = 5 a 7 anos
		Infantil B = 8 a 11 anos
		Juvenil A = 12 a 13 anos
		Juvenil B = 14 a 17 anos
		Adultos = Maiores de 18 anos
		
		*/
		
		inteiro idade

		escreva("===============Exercício 6==============\n\n")

		escreva("Digite a idade do nadador: ")
		leia(idade)

		se(idade < 5){
			escreva("O nadador é muito novo, não entra em nenhuma categoria") 
		}senao se (idade >= 5 e idade <=7){
			escreva("Nadador(a) na categoria: Infantil A") 
		}senao se (idade >=8 e idade <=11){
			escreva("Nadador(a) na categoria: Infantil B") 
		}senao se (idade >=12 e idade <=13){
			escreva("Nadador(a) na categoria: Juvenil A") 
		}senao se (idade >= 14 e idade <= 17){
			escreva("Nadador(a) na categoria: Juvenil B")
		}senao{
			escreva("Nadador(a) na categoria: Adultos")
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 917; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */