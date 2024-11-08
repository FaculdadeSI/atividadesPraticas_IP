
import java.util.Arrays;
import java.util.Scanner;

public class L04_Array_0072379_Q5 {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        int number[] = new int[30]; 

        for (int i = 0; i < 30; i++) {

            System.out.println("Informe o " + (i + 1) + "° número: ");
            number[i] = s.nextInt(); 
            System.out.println(" ");
            
        }
        
        System.out.println("V1: " + Arrays.toString(number));
        System.out.println(" ");

        s.close();
        
        for (int i = number.length - 1; i >= 0; i--) {
            
            System.out.println("V2: " + number[i]);
            
        }
  
    }

}
