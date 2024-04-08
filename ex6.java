
    import java.util.Scanner;
public class ex6 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[][] notasAlunos = new double[10][4];
        double[] medias = new double[10];
        int countAlunosAprovados = 0;
        

        for (int i = 0; i < 10; i++) {
            System.out.println("Digite as notas do aluno " + (i + 1) + ":");
            for (int j = 0; j < 4; j++) {
                notasAlunos[i][j] = scanner.nextDouble();
            }
        }
          scanner.close();

        for (int i = 0; i < 10; i++) {
            double soma = 0;
            for (int j = 0; j < 4; j++) {
                soma += notasAlunos[i][j];
            }
            medias[i] = soma / 4;
            if (medias[i] >= 7.0) {
                countAlunosAprovados++;
            }
        }
        
   
        System.out.println("Número de alunos com média maior ou igual a 7.0: " + countAlunosAprovados);
    }
  
}


