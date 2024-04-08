import java.util.Scanner;

public class ex4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char[] caracteres = new char[10];
        int totalConsoantes = 0;
        
        System.out.println("Digite os 10 caracteres:");
        

        for (int i = 0; i < 10; i++) {
            caracteres[i] = scanner.next().charAt(0);
        }
        
        System.out.println("As consoantes digitadas são:");
        
        for (int i = 0; i < 10; i++) {
            char c = Character.toLowerCase(caracteres[i]);
            if (c >= 'a' && c <= 'z' && c != 'a' && c != 'e' && c != 'i' && c != 'o' && c != 'u') {
                totalConsoantes++;
                System.out.println(caracteres[i]);
            }
        }
        
        System.out.println("Total de consoantes lidas: " + totalConsoantes);
        scanner.close();
    }

}
