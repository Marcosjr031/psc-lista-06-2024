import java.util.Scanner;

public class ex3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] notas = new double[4];
        
        System.out.println("Digite as 4 notas:");
        

        for (int i = 0; i < 4; i++) {
            notas[i] = scanner.nextDouble();
        }
        
        System.out.println("As notas digitadas são:");
        
      
        for (int i = 0; i < 4; i++) {
            System.out.println("Nota " + (i + 1) + ": " + notas[i]);
        }
        
    
        double soma = 0;
        for (int i = 0; i < 4; i++) {
            soma += notas[i];
        }
        double media = soma / 4;
        
        System.out.println("A média das notas é: " + media);
        scanner.close();
    }
}
