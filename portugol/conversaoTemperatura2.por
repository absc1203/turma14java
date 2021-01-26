programa
{
	inclua biblioteca Matematica
	
	funcao inicio()
	{
		real tempCelsius, tempFahrenheit

		escreva("Digite a temperatura em graus Fahrenheit(F°): ") // entrando com a temperatura em Fahrenheit
		leia(tempFahrenheit) //leia o valor em Fahrenheit
		tempCelsius = ((tempFahrenheit - 32) / 1.8) //convertendo de Fahrenheit para Celsius
		escreva("A temperatura em Celsius é: ", Matematica.arredondar(tempCelsius,2), " C°") //Exibindo mensagem
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 453; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */