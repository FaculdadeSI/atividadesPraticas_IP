
import java.util.Scanner;

public class Exercicio_1 {

    public static void main(String[] args) {

        float peso, media_peso, soma_peso_30 = 0, peso_older = 0, soma_total = 0;
        int idade, idade_older = 0, qtde = 0;
        Scanner s = new Scanner(System.in);

        System.out.println("Digite o peso da pessoa: ");
        peso = s.nextFloat();

        System.out.println("Digite a idade da pessoa: ");
        idade = s.nextInt();

        while (peso != 0) {
            soma_total = peso + soma_total;
            qtde++;

            if (idade > 30) {
                soma_peso_30 = peso + soma_peso_30;
            }

            if (idade > idade_older) {
                idade_older = idade;
                peso_older = peso;
            }

            System.out.println("Digite o peso da pessoa: ");
            peso = s.nextFloat();

            System.out.println("Digite a idade da pessoa: ");
            idade = s.nextInt();

        }
        media_peso = soma_total / qtde;
        System.out.println("A media de peso é: " + media_peso );

        System.out.println("A soma do peso de pessoas maiores de 30 anos é: " + soma_peso_30);

        System.out.println("Peso pessoa mais velha: " + peso_older);
        System.out.println("Idade pessoa mais velha: " + idade_older);
    }

}
