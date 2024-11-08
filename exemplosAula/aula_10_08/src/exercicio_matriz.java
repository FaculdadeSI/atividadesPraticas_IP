
import java.util.Scanner;

public class exercicio_matriz {

    public static void main(String[] args) {

        int notas[][] = new int[4][3];
        int soma[] = new int[4]; //número de linhas!
        int media[] = new int[4];

        Scanner s = new Scanner(System.in);

        for (int i = 0; i < 4; i++) {

            soma[i] = 0;

        }

        for (int i = 0; i < 4; i++) {

            soma[i] = 0;

        }

        for (int i = 0; i < 4; i++) {

            System.out.println("Informe as 3 notas do aluno na disciplina: ");

            for (int j = 0; j < 3; j++) {

                System.out.println("\n" + (j + 1) + "° nota: ");
                notas[i][j] = s.nextInt();
                soma[i] += notas[i][j];
                media[i] = soma[i] / 3;

            }

        }

        for (int i = 0; i < 4; i++) {

            System.out.println("\nSoma das notas da " + (i + 1) + "° disciplina: " + soma[i]);

        }

        for (int i = 0; i < 4; i++) {

            System.out.println("\nMédia das notas da " + (i + 1) + "° disciplina: " + media[i]);

            if (media[i] >= 6) {

                System.out.println("\nAluno aprovado!");
                
            } else {

                System.out.println("\nAluno reprovado!");

            }

        }

    }

}
