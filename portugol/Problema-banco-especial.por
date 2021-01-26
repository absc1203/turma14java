programa
{
    funcao inicio()
    {
        const cadeia numeroConta= "0001"
        real saldo=0.00, valor=0.0, saqueEspecial=0.00
        const cadeia NOMEUSUARIO= "Tony Stark"
        const cadeia CPF= "400.765.828-23"
        cadeia movimentacoes[2]
	   inteiro DATA = 0
	   caracter opcao, dia, opcaoCredito
	   inteiro limiteCredito = 1000
	  
        //nome, conta, cpf, saldo
	    escreva("======== Banco Grupo 3 ==========\n")
	    escreva("Olá ", NOMEUSUARIO, "\n")
	    escreva("NÚMERO DA CONTA: ", numeroConta, "\n")
	    escreva("CPF: ", CPF, "\n")
	    escreva("SALDO: ", saldo, "\n")
	    escreva("lIMITE DE CREDITO: R$ ",limiteCredito,"\n")
	   
	    escreva("=================================\n")
	    faca
	    {
	    	para(inteiro i=0 ; i<2 ; i++)
	    	{
	    		escreva("\n",NOMEUSUARIO, ": O que você deseja fazer ? [1]saque ou [2]depósito? ")
	    		leia(opcao)
	    		se(opcao == '1') {
	    			escreva("Quanto deseja sacar ? R$ ")
	    			leia(valor)
					se(saldo>=valor)
					{
						saldo = saldo-valor
						escreva("operação realizada com sucesso\n SALDO ATUAL: ",saldo)
					}
					
				
					senao
					{
					escreva("Deseja usar o credito especial ? [1]:Sim ou [2]:Não ? ")
					leia(opcaoCredito)
						se (opcaoCredito == '1')
						{
						escreva("Quanto deseja usar do Crédito especial ? R$ ")
	    				leia(saqueEspecial)
	    				saldo += (saqueEspecial-valor)
	    				limiteCredito = limiteCredito - saqueEspecial
	    				escreva("\nSALDO ATUAL: R$ ",saldo)
	    				escreva("\n")
	    				escreva("LIMITE DE CRÉDITO ESPECIAL: ",limiteCredito)	
						}
						senao
						{
	    escreva("======== Banco Grupo 3 ==========\n")
	    escreva("Olá ", NOMEUSUARIO, "\n")
	    escreva("NÚMERO DA CONTA: ", numeroConta, "\n")
	    escreva("CPF: ", CPF, "\n")
	    escreva("SALDO: ", saldo, "\n")
	    escreva("lIMITE DE CREDITO: R$ ",limiteCredito,"\n")
	    escreva("=================================\n")
						}
				
					}
	    			}
	    			se(opcao == '2')
	    			{
				escreva("Entre com o valor do depósito: ")
	    			leia(valor)
				se(valor<0)
				{
				escreva("Digite um número válido")
				}
				senao
					{
					saldo = saldo+valor	
					escreva("operação realizada com sucesso.\n SALDO ATUAL: ",saldo)
					
					}
	    			}
	    	  }
	   	  escreva("\nDeseja ir para o próximo dia?\n[1]sim \n[2]não ")
	    	  leia(dia)
	    }
	    enquanto(dia == 'S' ou dia == 's')
	    

	    escreva("======== Banco Grupo 3 ==========\n")
	    escreva("Olá ", NOMEUSUARIO, "\n")
	    escreva("NÚMERO DA CONTA: ", numeroConta, "\n")
	    escreva("CPF: ", CPF, "\n")
	    escreva("SALDO: ", saldo, "\n")
	    escreva("lIMITE DE CREDITO: R$ ",limiteCredito,"\n")
	    escreva("=================================\n")
	    
	}
	
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 2757; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */