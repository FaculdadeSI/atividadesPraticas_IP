programa
{
	
	funcao inicio()
	{
		caracter continuar='s' //para começar com s(sim)
		real numero,soma=0.0,media
		inteiro cont=0 //contador, sempre que precisar contar a quantidade de números
		enquanto(continuar=='s'){
			escreva("Digite o número: ")
			leia(numero)
			soma=soma+numero
			cont++ //cont=cont+1
			escreva("Deseja informar outro número? ")
			leia(continuar)
		}
		media=soma/cont //quando não for informado a quantidade, usar cont
		escreva("A soma é "+soma)
		escreva("\nA média é "+media)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 454; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */