import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] vetor = new int[5];
        
        System.out.println("Digite os 5 números inteiros:");
        
    
        for (int i = 0; i < 5; i++) {
            vetor[i] = scanner.nextInt();
        }
        
        System.out.println("Os números digitados são:");
        

        for (int i = 0; i < 5; i++) {
            System.out.println(vetor[i]);
        }
        scanner.close();
    }
}
