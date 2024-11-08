
import java.util.Arrays;
import java.util.Scanner;

public class L04_Array_0072379_Q2 {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        int number[] = new int[20];

        for (int i = 0; i < 20; i++) {

            System.out.println("Informe o " + (i + 1) + "° número: ");
            number[i] = s.nextInt();

            System.out.println(" ");

        }

        System.out.println("V: " + Arrays.toString(number));

        Arrays.sort(number);  //fonte: https://dicasdejava.com.br/java-como-ordenar-um-array/

        System.out.println(" ");
        
        System.out.println("V crescente: " + Arrays.toString(number));

        s.close();

    }

}
