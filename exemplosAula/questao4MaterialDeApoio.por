//questão 4 do material de apoio
programa
{
	
	funcao inicio()
	{
		real d=1.0,n,soma=0.0
		escreva("Informe o n: ")
		leia(n)
		enquanto(n<=0){
			escreva("N inválido!")
			escreva("\nInforme o n (>0): ")
			leia(n)
		}
		enquanto(d<=n){
			soma=soma+(1/d)
			d=d+1
		}
		escreva(soma)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 291; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */