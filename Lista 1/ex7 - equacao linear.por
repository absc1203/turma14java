programa
{
	
	funcao inicio()
	{
		real A,B,C,D,E,F,x,y
		
		escreva("======== Sistema de coeficientes =========\n\n")
		escreva("escreva o valor de A:")
		leia(A)
		escreva("escreva o valor de B:")
		leia(B)
		escreva("escreva o valor de C:")
		leia(C)
		escreva("escreva o valor de D:")
		leia(D)
		escreva("escreva o valor de E:")
		leia(E)
		escreva("escreva o valor de F:")
		leia(F)


		x = (((C*E)-(B*F)) / ((A*E)-(B*D)))
		y = (((A*F)-(C*D)) / ((A*E)-(B*D)))

		escreva("O resultado é x = ", x, " e y = ", y)
		
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 516; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */