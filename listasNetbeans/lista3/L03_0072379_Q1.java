package lista;

import static java.lang.Byte.MIN_VALUE;
import java.util.Scanner;

public class L03_0072379_Q1 {

    public static void main(String[] args) {

        Scanner enter = new Scanner(System.in);
        int[] high = new int[5];
        int[] number = new int[5];
        int bigger_high = MIN_VALUE, number_high = 0;  //fiquei em dúvida mas achei na internet!

        for (int i = 0; i < 5; i++) {

            System.out.println("Informe o número do " + (i + 1) + "º  atleta: ");
            number[i] = enter.nextInt();

            System.out.println("Informe a altura (em centímetros) do " + (i + 1) + "º atleta: ");
            high[i] = enter.nextInt();

            while (high[i] < 0) {

                System.out.println("Informe um valor positivo: ");
                high[i] = enter.nextInt();

            }

        }

        bigger_high = high[0];

        for (int i = 0; i < high.length; i++) {

            if (bigger_high < high[i]) {

                bigger_high = high[i];
                number_high = number[i];

            }

        }

        System.out.println("O maior atleta é o de número: " + number_high + "(" + bigger_high + " cm).");

        enter.close();

    }

}
