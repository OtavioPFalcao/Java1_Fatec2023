import java.util.Random;

public class Exercicio6 {
    public static void main(String[] args) {
        // Defina o tamanho da matriz
        int linhas = 10;
        int colunas = 10;

        // Crie uma matriz 10x10 de inteiros
        int[][] matriz = new int[linhas][colunas];

        // Preencha a matriz com números aleatórios entre 1 e 50
        Random rand = new Random();

        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                matriz[i][j] = rand.nextInt(50) + 1; // Gera um número aleatório entre 1 e 50
            }
        }

        // Imprima a matriz
        System.out.println("Matriz:");

        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }

        // Calcule a soma de cada coluna
        int[] somaColunas = new int[colunas];

        for (int j = 0; j < colunas; j++) {
            for (int i = 0; i < linhas; i++) {
                somaColunas[j] += matriz[i][j]; // Adicione o elemento à soma da coluna
            }
        }

        // Imprima a soma de cada coluna
        System.out.println("\nSoma de cada coluna:");

        for (int j = 0; j < colunas; j++) {
            System.out.println("Coluna " + j + ": " + somaColunas[j]);
        }
    }
}