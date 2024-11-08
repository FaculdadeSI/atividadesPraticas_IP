package lista;

import java.util.Scanner;

public class L03_0072379_Q5 {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        String name;
        int born, join, min_age, min_exp;

        System.out.println("Informe o nome do tripulante: ");
        name = s.nextLine();

        System.out.println("Informe o ano de nascimento do tripulante: ");
        born = s.nextInt();

        System.out.println("Informe o ano de ingresso na empresa: ");
        join = s.nextInt();

        min_age = 2022 - born;
        min_exp = 2022 - join;

        if (min_age >= 25 & min_exp >= 5 || min_age >= 35 & min_exp >= 2) {

            System.out.println("Nome: " + name + "\nIdade: " + min_age + "\nTempo de trabalho: " + min_exp + "\nSituação: Apto! ");

        } else {

            System.out.println("Nome: " + name + "\nIdade: " + min_age + "\nTempo de trabalho: " + min_exp + "\nSituação: Não apto! ");

        }

        s.close();

    }

}
