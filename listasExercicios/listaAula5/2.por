programa
{
	funcao inicio ()
	{
		inteiro peso_ideal
		real altura
		cadeia sexo
		
		escreva("Informe sua altura: ")
		leia(altura)
		escreva("\nInforme seu sexo: ")
		leia(sexo)
		
		se(sexo=="feminino"){
			peso_ideal=(62.1*altura)-44.7
			escreva("Seu peso ideal é: "+peso_ideal)
		}senao{
			peso_ideal=(72.7*altura)-58
			escreva("Seu peso ideal é: "+peso_ideal)
		}
		
		
		
		
	}
}