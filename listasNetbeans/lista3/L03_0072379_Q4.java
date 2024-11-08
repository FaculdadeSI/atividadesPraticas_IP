package lista;

import java.util.Scanner;

public class L03_0072379_Q4 {

    public static void main(String[] args) {

        Scanner enter = new Scanner(System.in);
        double[] AV1 = new double[10];
        double[] AV2 = new double[10];
        double[] frequency = new double[10];
        double average;

        for (int i = 0; i < 10; i++) {

            System.out.println("Informe a nota do " + (i + 1) + "º aluno AV1: ");
            AV1[i] = enter.nextDouble();

            while (AV1[i] < 0) {

                System.out.println("Informe uma nota positiva: ");
                AV1[i] = enter.nextDouble();

            }

            System.out.println("Informe a nota do " + (i + 1) + "º aluno na AV2: ");
            AV2[i] = enter.nextDouble();

            while (AV2[i] < 0) {

                System.out.println("Informe uma nota positiva: ");
                AV2[i] = enter.nextDouble();

            }

            System.out.println("Informe a frequência (em porcentagem) do " + (i + 1) + "º aluno: ");
            frequency[i] = enter.nextDouble();

            while (frequency[i] < 0) {

                System.out.println("Informe uma frequência positiva: ");
                frequency[i] = enter.nextDouble();

            }

            average = (AV1[i] + AV2[i]) / 2;

            if (frequency[i] < 50 || (AV1[i] < 4 && AV2[i] < 4)) {

                System.out.println("Situação do " + (i + 1) + "° aluno: Reprovado!");

            } else if ((AV1[i] < 4 | AV2[i] < 4) | average < 6) {

                System.out.println("Situação do " + (i + 1) + "° aluno: Recuperação!");

            } else {

                System.out.println("Situação do " + (i + 1) + "° aluno: Aprovado!");

            }

            System.out.println("\n");

        }

        enter.close();

    }

}
