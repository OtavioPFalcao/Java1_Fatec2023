import java.security.SecureRandom;
import java.util.Scanner;

public class Exercicio_Internet02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Solicite ao usuário o número de linhas e colunas
        System.out.print("Digite o número de linhas:  ");
        int linha = sc.nextInt();
        System.out.print("Digite o número de colunas:  ");
        int coluna = sc.nextInt();

        int[][] numeros = new int[linha][coluna];

        // Preencha a matriz com números aleatórios de 1 a 100
        for (int l = 0; l < linha; l++) {
            for (int c = 0; c < coluna; c++) {
                numeros[l][c] = new SecureRandom().nextInt(100) + 1;
            }
        }

        // Imprima a matriz
        for (int l = 0; l < linha; l++) {
            for (int c = 0; c < coluna; c++) {
                System.out.printf("%2d - ", numeros[l][c]);
            }
            System.out.println();
        }

        sc.close(); // Feche o Scanner quando não precisar mais dele
    }
}
