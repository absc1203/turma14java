programa
{
	
	funcao inicio()
	{
		inteiro horaTrab
		real salHora, salBruto, salLiquido, ir, inss, sindicato

		escreva("Digite a quantidade de horas trabalhadas: ")
		leia(horaTrab)
		escreva("Digite o preço/hora do seu trabalho: ")
		leia(salHora)

		salBruto = horaTrab * salHora
		ir = salBruto * 0.11
		inss = salBruto * 0.08
		sindicato = salBruto * 0.05 
		salLiquido = salBruto - inss - ir -sindicato

		escreva("Salário Bruto: R$",salBruto)
		escreva("\nIR: R$",ir)
		escreva("\nINSS: R$",inss)
		escreva("\nSindicato: R$",sindicato)
		escreva("\nSalário Líquido: R$",salLiquido)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 362; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */