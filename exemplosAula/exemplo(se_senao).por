programa
{
	
	funcao inicio()
	{
		cadeia nome,cupom
		real valor_compra=0.0,desconto=0.0,valor_pagar=0.0
		escreva("Digite o nome do cliente: ")
		leia(nome)
		escreva("Digite o valor da compra: ")
		leia(valor_compra)
		escreva("Digite o cupom de desconto: ")
		leia(cupom)
		se(valor_compra>200 e cupom=="off10"){
			desconto=valor_compra*0.10
			valor_pagar=valor_compra-desconto
		}
		senao
			se(valor_compra>500 e cupom=="off20"){
			desconto=valor_compra*0.20
			valor_pagar=valor_compra-desconto
		}
		senao{
			valor_pagar=valor_compra-desconto
		}
		limpa()
		escreva("\nNome do cliente:.......... "+nome)
		escreva("\nValor da compra:.......... R$ "+valor_compra)
		escreva("\nDesconto:................. -R$ "+desconto)
		escreva("\nValor a pagar:............ R$ "+valor_pagar)
		
		escreva("\nOBRIGADA PELA PREFERÊNCIA!")
	
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 848; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */