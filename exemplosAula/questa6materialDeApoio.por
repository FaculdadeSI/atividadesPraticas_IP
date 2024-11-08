//questão 6 do material de apoio
programa
{
	
	funcao inicio()
	{
		inteiro num,cont=1,par=2
		escreva("Informe o número: ")
		leia(num) 
		enquanto(num<0){
			escreva("Número inválido!")
			escreva("\nDigite um número positivo: ")
			leia(num)
		}
		escreva("Os "+num+"primeiros pares são: ")
		enquanto(cont<=num){
			escreva(par+" ") // " " = espaço entre um número e outro  
			par=par+2
			cont=cont+1
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 383; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */