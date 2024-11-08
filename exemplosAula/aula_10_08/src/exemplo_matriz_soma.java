
import java.util.Scanner;


public class exemplo_matriz_soma {

    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);

        int matriz[][] = new int[2][3];
        int soma_linha[] = new int[2];
        
        for (int i = 0; i < 2; i++) {
            
            soma_linha[i] = 0;
            
        }

        System.out.println("Informe os valores para a matriz: ");

        for (int i = 0; i < 2; i++) {

            for (int j = 0; j < 3; j++) {

                System.out.println("Valor da posição " + i + ", " + j + ": ");
                matriz[i][j] = s.nextInt();
                soma_linha[i] += matriz[i][j];

            }

        }

        System.out.println("\nValores da matriz: ");

        for (int i = 0; i < 2; i++) {

            for (int j = 0; j < 3; j++) {
                
                System.out.print(matriz[i][j] + " ");
                
            }
            
            System.out.println(" ");

        }
        
        System.out.println("\nSoma das linhas: ");
        
        for (int i = 0; i < 2; i++) {
            
            System.out.println("Linha " + i + ": " + soma_linha[i]);
            
        }
        
        s.close();
        
    }
    
}
