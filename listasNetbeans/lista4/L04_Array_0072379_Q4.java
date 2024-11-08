
import java.util.Arrays;
import java.util.Scanner;

public class L04_Array_0072379_Q4 {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        int number[] = new int[10];

        for (int i = 0; i < 10; i++) {

            System.out.println("Informe o " + (i + 1) + "° número: ");
            number[i] = s.nextInt();

            System.out.println(" ");

        }

        s.close();

        Arrays.sort(number);

        System.out.println("3 maiores números: " + number[9] + ", " + number[8] + ", " + number[7] + ".");

    }

}
