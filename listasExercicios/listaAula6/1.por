programa
{
	funcao inicio ()
	{
		real nota,media,soma=0.0
		caracter continuar='s'
		inteiro cont=0
		
		enquanto(continuar=='s'){
			escreva("Informe a nota: ")
			leia(nota)
			
			se(nota>0 e nota<100){
				soma=soma+nota
				cont=cont+1
			}senao{
				escreva("Informe uma nota entre 0 e 100: ")
				leia(nota)
				soma=soma+nota
				cont=cont+1
			}
			escreva("Deseja continuar? ")
			leia(continuar)
		}
		
		media=soma/cont
		escreva("A média é: "+media)
	}
}