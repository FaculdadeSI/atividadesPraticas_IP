package ex_notas;

import java.util.Scanner;

public class Ex_Notas {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        String nome;
        float nota;
        int cont = 1;

        while (cont <= 3) {

            System.out.println("Digite o nome do aluno: ");
            nome = entrada.next();
            System.out.println("Digite a nota do aluno " + nome + ": ");
            nota = entrada.nextFloat();

            if (nota >= 60) {
                System.out.println(nome + "está aprovado(a) com " + nota + " pontos.");
            } else {
                System.out.println(nome + " está reprovado(a) com " + nota + " pontos.");
            }
            cont++;

        }
        entrada.close();
    }

}
