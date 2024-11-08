
import java.util.Scanner;

public class Correcao_questao_2 {

    public static void main(String[] args) {

        int number, winner_number = 0;
        float time, winner_time = 1000;
        Scanner enter = new Scanner(System.in);

        for (int i = 1; i <= 3; i++) {

            System.out.println("Informe o número do atleta: ");
            number = enter.nextInt();

            System.out.println("Informe o tempo do atleta: ");
            time = enter.nextInt();

            if (winner_time > time) {

                winner_time = time;
                winner_number = number;

            }

        }
        
        enter.close();
        
        System.out.println("Número do atleta vencedor: " + winner_number);
        
        System.out.println("O tempo do atleta vencedor foi: " + winner_time);

    }
}
