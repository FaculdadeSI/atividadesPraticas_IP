
import java.util.Scanner;

//Faça um programa que receba uma matriz 3x3 e um valor inteiro X fornecido pelo usuário.
//A seguir, subtraia cada elemento da primeira e da última linha da matriz pelo valor de X.
//Mostre a matriz resultante.
public class Q03_0072379_IP {

    public static void main(String[] args) {

        int matriz[][] = new int[3][3];
        int valor;
        int sub[][] = new int[3][3];

        Scanner s = new Scanner(System.in);

        System.out.println("Informe os números da matriz: ");

        for (int i = 0; i < 3; i++) {

            for (int j = 0; j < 3; j++) {

                System.out.println(" ");
                System.out.println((i + 1) + "° número, " + (j + 1) + "° coluna: ");
                matriz[i][j] = s.nextInt();

            }

        }

        System.out.println(" ");
        System.out.println("Informe o valor para a subtração: ");
        valor = s.nextInt();
        System.out.println(" ");

        System.out.println("Matriz resultante: ");
        System.out.println(" ");

        for (int i = 0; i < 3; i++) {

            for (int j = 0; j < 3; j++) {

                sub[0][j] = matriz[0][j] - valor;
                sub[1][j] = matriz[1][j];
                sub[2][j] = matriz[2][j] - valor;

                System.out.print(sub[i][j] + " ");

            }

            System.out.println(" ");

        }

        s.close();

    }

}
