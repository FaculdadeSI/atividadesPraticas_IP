programa
{
	funcao inicio ()
	{
		real re,gra,sal_t,sal_l,sal_b
		cadeia nome,cargo
		inteiro id
		
		escreva("Informe seu nome: ")
		leia(nome)
		escreva("Informe sua idade: ")
		leia(id)
		escreva("Informe seu cargo: ")
		leia(cargo)
		escreva("Informe seu salário bruto: ")
		leia(sal_b)
		
		re=sal_b*0.38
		gra=sal_b*0.20
		sal_t=sal_b+re+gra
		sal_l=sal_t-(sal_t*0.25)
		
		limpa()
		
		escreva("Nome: "+nome)
		escreva("\nIdade: "+id)
		escreva("\nCargo: "+cargo)
		escreva("\nSalário bruto: "+sal_b)
		escreva("\nSalário líquido: "+sal_l)
	}
}