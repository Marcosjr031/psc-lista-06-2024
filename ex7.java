
    import java.util.Scanner;
public class ex7 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] vetor = new int[5];
        
        System.out.println("Digite os 5 números inteiros:");
        
    
        for (int i = 0; i < 5; i++) {
            vetor[i] = scanner.nextInt();
        }
        

        int soma = 0;
        int multiplicacao = 1;
        for (int i = 0; i < 5; i++) {
            soma += vetor[i];
            multiplicacao *= vetor[i];
        }
        

        System.out.println("Números digitados:");
        for (int i = 0; i < 5; i++) {
            System.out.print(vetor[i] + " ");
        }
        System.out.println("\nSoma dos números: " + soma);
        System.out.println("Multiplicação dos números: " + multiplicacao);

        scanner.close();
    }
}

