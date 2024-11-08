
import java.util.Scanner;

public class Correcao_questao_3 {

    public static void main(String[] args) {
        Scanner enter = new Scanner(System.in);
        int number, sum_even = 0;

        for (int i = 1; i <= 10; i++) {
            System.out.println("Informe o " + i + "º valor: ");
            number = enter.nextInt();

            if (number % 2 == 0) {
                sum_even += number;
            }

            System.out.println("A soma dos pares é " + sum_even + ".");
            enter.close();
        }
    }
}
