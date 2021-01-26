programa
{
    funcao inicio()
    {
        const cadeia numeroConta= "0001"
        real saldo=0.0, valor=0.0
        const cadeia NOMEUSUARIO= "Tony Stark"
        const cadeia CPF= "400.765.828-23"
        cadeia movimento[] = {"","","","","","","","","",""} 
	   inteiro DATA = 0
	   caracter opcao, dia
	   inteiro talao[10]
	   inteiro qtdTalao = 10
	   
        //nome, conta, cpf, saldo
	    escreva("======== Banco Grupo 3 ==========\n")
	    escreva("Olá ", NOMEUSUARIO, "\n")
	    escreva("NÚMERO DA CONTA: ", numeroConta, "\n")
	    escreva("CPF: ", CPF, "\n")
	    escreva("QTD DE TALÕES RETIRADOS: ", qtdTalao, "\n")
	    escreva("SALDO: ", saldo, "\n")
	    escreva("=================================\n")
	    faca
	    {
	    	para(inteiro i=0 ; i<10 ; i++)
	    	{
	    		escreva("\n",NOMEUSUARIO,"deseja fazer um [1]-Saque  [2]-Depósito  [3]-Solicitar talão? ")
	    		leia(opcao)
	    		se(opcao == '1') {
	    			escreva("Entre com o valor do saque: ")
	    			leia(valor)
					se(saldo>=valor e valor>0) {
						 
						saldo = saldo-valor
						escreva("operação realizada com sucesso\n SALDO ATUAL: ",saldo)
						movimento[i] = "-R$" + valor
						
											
					} senao {
						escreva("Saldo insuficiente para saque.\n SALDO ATUAL: ",saldo)
					}
	    			
	    		}
	    		se(opcao == '2') {
				escreva("Entre com o valor do depósito: ")
	    			leia(valor)
				se(valor<0) {
					escreva("Digite um número válido")
				}
				senao {
					saldo = saldo+valor	
					escreva("operação realizada com sucesso.\n SALDO ATUAL: ",saldo)
					movimento[i] = "+R$" + valor
					
				}
	    		}

	    		se(opcao == '3') {
				escreva("Talão de cheques concebido ")
	    			
	    			movimento[i] = "Talão Nº" + talao[i]
	    			qtdTalao++
	    			
	    		}
	    		
	    	  }
	    	  escreva("\nEntre com a data de hoje em formato dd: ")
	    	  leia(DATA)
	    	  se(DATA == 23) {
	    	  	escreva("\nHoje é seu aniversário de conta e seu saldo recebeu um acrescimo!")
	    	  	saldo = saldo*1.005
	    	  	escreva(saldo)
	    	  }
	    	  escreva("\nDeseja ir para o próximo dia?\n[S]sim \n[N]não ")
	    	  leia(dia)	
	    	  
	    }
	    enquanto(dia == 'S' ou dia == 's')
	    
	    limpa()
	    escreva("======== Banco Grupo 3 ==========\n")
	    escreva("Olá ", NOMEUSUARIO, "\n")
	    escreva("NÚMERO DA CONTA: ", numeroConta, "\n")
	    escreva("CPF: ", CPF, "\n")
	    escreva("QTD DE TALÕES RETIRADOS: ", qtdTalao, "\n")
	    escreva("SALDO: ", saldo, "\n")
	    escreva("=================================\n")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 945; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = {movimento, 9, 15, 9};
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */