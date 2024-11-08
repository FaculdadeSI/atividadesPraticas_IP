package lista;

import java.util.Scanner;

public class L03_0072379_Q3 {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int cont = 1;
        int[] number = new int[3];

        for (int i = 0; i < number.length; i++) {
            System.out.print("Informe o  " + cont + "° número: ");
            number[i] = s.nextInt();
            cont++;
        }

        for (int i = 1; i < number.length; i++) {

            for (int j = 0; j < i; j++) {

                if (number[i] > number[j]) {  // fonte: pt.stackoverflow.com/questions/448295/imprimir-em-ordem-decrescente-em-java
                    int a = number[i];
                    number[i] = number[j];
                    number[j] = a;

                }

            }

        }

        System.out.println("Ordem decrescente: ");

        for (int n : number) {

            System.out.print(n + " ");

        }

        s.close();

    }

}
