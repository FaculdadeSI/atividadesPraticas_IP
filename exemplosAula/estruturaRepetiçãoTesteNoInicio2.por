//elabore um programa que leia a quantidade de numeros que o usuario informar. calcular e exibir a soma e maedia dos numeros.
programa
{
	
	funcao inicio()
	{
		inteiro cont=1,qtde
		real num,soma=0.0,media
		escreva("Informe a quantidade de números a ser lido: ")
		leia(qtde)
		enquanto(cont<=qtde){
			escreva("Digite o número: ")
			leia(num)
			soma=soma+num
			cont=cont+1
		}
		media=soma/qtde
		escreva("A soma é "+soma)
		escreva("\nA média é "+media)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 405; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */