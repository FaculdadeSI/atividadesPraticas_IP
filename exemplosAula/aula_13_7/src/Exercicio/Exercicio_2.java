package Exercicio;

import java.util.Scanner;

public class Exercicio_2 {

    public static void main(String[] args) {
        int numero, numero_winner = 0, tempo, tempo_winner = 1000, cont = 0;
        Scanner s = new Scanner(System.in);

        while (cont <= 19) {

            System.out.println("Digite o número do atleta: ");
            numero = s.nextInt();

            System.out.println("Digite o tempo do atleta: ");
            tempo = s.nextInt();

            if (tempo_winner > tempo) {

                tempo_winner = tempo;
                numero_winner = numero;

            }
            cont++;

        }
        s.close();
        System.out.println("Número do atleta vencedor: " + numero_winner);
        System.out.println("O tempo do atleta vencedor foi: " + tempo_winner);

    }
}
