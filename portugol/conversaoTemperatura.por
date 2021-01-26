programa
{
	inclua biblioteca Matematica
	
	funcao inicio()
	{
		//um programa que leia graus C°(Celsius) para F° (Fahrenheit)
		
		real tempCelsius, tempFahrenheit

		escreva("Digite a temperatura em graus Celsius(C°): ") // entrando com a temperatura em Celsius
		leia(tempCelsius) //leia o valor em Celsius
		tempFahrenheit = (tempCelsius * 1.8) + 32 //convertendo de Celsius para Fahrenheit
		tempFahrenheit = Matematica.arredondar(tempFahrenheit, 1) //arredondando para uma casa decimal
		escreva("A temperatura em Fahrenheit é: ", tempFahrenheit, "F°") //Exibindo mensagem
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 309; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */