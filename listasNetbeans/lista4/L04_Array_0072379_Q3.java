
import java.util.Arrays;
import java.util.Scanner;

public class L04_Array_0072379_Q3 {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        int v1[] = new int[5];
        int v2[] = new int[5];
        int v3[] = new int[v1.length + v2.length];

        for (int i = 0; i < 5; i++) {

            System.out.println("Informe o " + (i + 1) + "º número do 1º vetor: ");
            v1[i] = s.nextInt();

            System.out.println(" ");

        }

        for (int i = 0; i < 5; i++) {

            System.out.println("Informe o " + (i + 1) + "º número do 2º vetor: ");
            v2[i] = s.nextInt();

            System.out.println(" ");

        }

        s.close();

        System.arraycopy(v1, 0, v3, 0, v1.length); //fonte: stackoverflow.com/questions/80476/how-can-i-concatenate-two-arrays-in-java
        System.arraycopy(v2, 0, v3, v1.length, v2.length);

        Arrays.sort(v3);

        System.out.println("v3: " + Arrays.toString(v3));

    }

}
