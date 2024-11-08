programa
{
	
	funcao inicio()
	{
		inteiro cont=1
		real num,soma=0.0,media
		enquanto(cont<=10){
			escreva("Digite o número: ")
			leia(num)
			soma=soma+num
			cont=cont+1
		}
		media=soma/10
		escreva("A soma é "+soma)
		escreva("\nA média é "+media)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 241; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */