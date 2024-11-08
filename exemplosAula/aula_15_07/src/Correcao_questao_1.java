
import java.util.Scanner;

public class Correcao_questao_1 {

    public static void main(String[] args) {
        float weight, mean_weight, sum_weight_30 = 0, weight_older = 0, total_sum = 0;
        int age, age_older = 0, cont = 0;
        Scanner enter = new Scanner(System.in);

        System.out.println("Informe o peso da pessoa: \nPara finalizar, informe o peso igual a 0.");
        weight = enter.nextFloat();

        while (weight < 0) {
            System.out.println("Peso inválido! \nInforme um peso maior que zero. \nPara finalizar, informe o peso igual a 0.");
            weight = enter.nextFloat();
        }

        while (weight != 0) {
            System.out.println("Informe a idade da pessoa: ");
            age = enter.nextInt();
            total_sum += weight;
            cont++;

            if (age > 30) {
                sum_weight_30 += weight;
            }

            if (age > age_older) {
                age_older = age;
                weight_older = weight;
            }

            while (weight < 0) {
                System.out.println("Peso inválido! \nInforme um peso maior que zero. \nPara finalizar, informe o peso igual a 0.");
                weight = enter.nextFloat();
            }

            System.out.println("Informe o peso da próxima pessoa: \nPara finalizar, informe o peso igual a 0.");
            weight = enter.nextFloat();

        }
        
        mean_weight = total_sum / (float) cont;
        System.out.println("A média de peso é: " + mean_weight + "kg.");

        System.out.println("A soma do peso de pessoas maiores de 30 anos é: " + sum_weight_30 + "kg.");

        System.out.println("Peso pessoa mais velha: " + weight_older + "kg.");
        
        System.out.println("Idade pessoa mais velha: " + age_older);
        
        enter.close();
    }

}
