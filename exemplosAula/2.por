programa
{
	
	funcao inicio()
	{
		real altura,pesoi
		cadeia sexo,feminino,masculino
		escreva("Informe sua altura: ")
		leia(altura)
		escreva("Informe seu sexo: ")
		leia(sexo)
		se(sexo=="Feminino" ou sexo=="feminino"){
			pesoi=(62.1*altura)-44.7
			escreva("Seu peso ideal é: "+pesoi)
		}
		senao{
			pesoi=(72.7*altura)-58
			escreva("Seu peso ideal é: "+pesoi)
		}
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 206; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */