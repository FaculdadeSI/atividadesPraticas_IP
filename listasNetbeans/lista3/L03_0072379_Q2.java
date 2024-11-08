package lista;

import java.util.Scanner;

public class L03_0072379_Q2 {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        double salary, installment, porcentage;

        System.out.println("Informe o valor do salário bruto: ");
        salary = s.nextDouble();

        while (salary < 0) {

            System.out.println("O programa foi encerrado!");
            System.exit(0);

        }

        System.out.println("Informe o valor da prestação: ");
        installment = s.nextDouble();

        porcentage = salary * 0.3;

        if (installment <= porcentage) {

            System.out.println("O empréstimo poderá ser concedido!");

        } else {

            System.out.println("O empréstimo não poderá ser concedido!");

        }

        s.close();

    }

}
