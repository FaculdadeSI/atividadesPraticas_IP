import java.util.Scanner;

public class exemplo_array {

    public static void main(String[] args) {

        float sum = 0, average, grade[] = new float[5];
        int cont = 0;

        Scanner enter = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {

            System.out.println("Informe a nota do " + (i + 1) + "° aluno: ");
            grade[i] = enter.nextFloat();
            sum += grade[i];

        }

        enter.close();

        average = sum / 5;

        for (int i = 0; i < 5; i++) {

            if (grade[i] > average) {

                cont++;

            }
            
        }

        System.out.println("A nota média é " + average + " e " + cont + "alunos têm nota acima da média");
    }

}
