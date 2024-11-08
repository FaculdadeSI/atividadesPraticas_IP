programa
{
	funcao inicio ()
	{
		cadeia nome
		inteiro nh,nd
		real sb,sl,g,inss,irrf
		escreva("Informe nome:")
		leia(nome)
		escreva("Informe o número de horas:")
		leia(nh)
		escreva("Informe número de dependentes:")
		leia(nd)
		sb=nh*12.0
		g=nd*40.0
		inss=sb*0.085
		irrf=sb*0.05
		sl=sb-inss-irrf+g
		escreva("Nome do funcionário:"+nome)
		escreva("\n Salário bruto:"+sb)
		escreva("\n Inss:"+inss)
		escreva("\n Irrf:"+irrf)
		escreva("\n Gratificação:"+g)
		escreva("\n Salário líquido:"+sl)
		
		
	}
}