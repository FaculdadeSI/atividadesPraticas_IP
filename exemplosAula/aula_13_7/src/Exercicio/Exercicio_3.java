package Exercicio;

import java.util.Scanner;

public class Exercicio_3 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int x, soma = 0;

        for (int cont = 1; cont <= 10; cont++) {
            System.out.println("Digite um número: ");
            x = s.nextInt();
            if (x % 2 == 0) {
                soma = x + soma;
            }
        }
        s.close();
        System.out.println("Soma: " + soma);
    }
}
