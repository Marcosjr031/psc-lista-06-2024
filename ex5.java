
    import java.util.Scanner;
public class ex5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[20];
        int[] pares = new int[20];
        int[] impares = new int[20];
        int countPares = 0;
        int countImpares = 0;
        
        System.out.println("Digite 20 números inteiros:");
        

        for (int i = 0; i < 20; i++) {
            numeros[i] = scanner.nextInt();
            if (numeros[i] % 2 == 0) {
                pares[countPares] = numeros[i];
                countPares++;
            } else {
                impares[countImpares] = numeros[i];
                countImpares++;
            }
        }
        
 
        System.out.println("Números digitados:");
        imprimirVetor(numeros);
        
        System.out.println("Números pares:");
        imprimirVetor(pares, countPares);
        
        System.out.println("Números ímpares:");
        imprimirVetor(impares, countImpares);
        scanner.close();
    }
    

    public static void imprimirVetor(int[] vetor, int tamanho) {
        for (int i = 0; i < tamanho; i++) {
            System.out.print(vetor[i] + " ");
        }
        System.out.println();
    }
 
    public static void imprimirVetor(int[] vetor) {
        imprimirVetor(vetor, vetor.length);
    }

    
}


