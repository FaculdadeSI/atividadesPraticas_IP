
import java.util.Scanner;

//Chegando ao final do semestre letivo, o IFMG campus Ouro Branco precisa de um programa para contabilizar a nota e a situação de cada aluno. Considerando que você foi contratado para resolver o problema, desenvolva um programa para ler as notas dos alunos da turma de Introdução à Programação.
//Além das notas, o programa deve solicitar ao usuário a quantidade de alunos da turma. 
//A final, imprimir: 
//a quantidade de alunos para cada conceito.
//a nota média alcançada para cada conceito.

public class Q09_0072379_IP {

    public static void main(String[] args) {
        
        int alunos;
        
        Scanner s = new Scanner(System.in);
        
        System.out.println("Informe a quantidade de alunos da turma: ");
        alunos = s.nextInt();
        
        float notas[] = new float[alunos];
        
        for (int i = 0; i < alunos; i++) {
            
            System.out.println("Informe a nota do " + (i + 1) + "° aluno: ");
            notas[alunos] = s.nextFloat();
            
        }
            
        if (notas > 8.0) {
            
        }
    }
    
}
