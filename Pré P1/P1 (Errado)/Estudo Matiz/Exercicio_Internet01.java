import java.security.SecureRandom;

public class Exercicio_Internet01 {
    public static void main(String[] args) {
        final int linha = 10; //Insira o número de linhas
        final int coluna = 11; //Insira o número de colunas
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
    }
}