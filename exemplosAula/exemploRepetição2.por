programa
{
	
	funcao inicio()
	{
		real nota
		inteiro cont=1
		enquanto(cont<=5){
			escreva("\nDigite a nota do "+cont+"° aluno: ")
			leia(nota)
			se (nota>=60){
				escreva("Aluno aprovado!")
			}
			senao{
				escreva("Aluno reprovado!")
			}
			cont=cont+1
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 102; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */