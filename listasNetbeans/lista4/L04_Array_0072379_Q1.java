
import java.util.Arrays;
import java.util.Scanner;

public class L04_Array_0072379_Q1 {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        int number[] = new int[10];
        int number2x[] = new int[10];

        for (int i = 0; i < 10; i++) {

            System.out.println("Informe o " + (i + 1) + "° número: ");
            number[i] = s.nextInt();

            number2x[i] = number[i] * 2;

            System.out.println(" ");

        }

        s.close();

        System.out.println("V1: " + Arrays.toString(number));  //fonte: www.delftstack.com/pt/howto/java/print-an-array-in-java/
        System.out.println("\nV2: " + Arrays.toString(number2x));

    }

}
