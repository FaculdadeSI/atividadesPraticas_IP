programa
{
	funcao inicio ()
	{
		real base,altura_a,altura_c,area_tri,area_qua,area_total
		escreva("Informe a altura A: ")
		leia(altura_a)
		escreva("Informe a altura C: ")
		leia(altura_c)
		escreva("Informe o lado B: ")
		leia(base)
		area_tri=(base*altura_a)/2
		area_qua=base*altura_c
		area_total=area_tri+area_qua
		escreva("A área da casinha é: "+area_total+".")
	}
}
