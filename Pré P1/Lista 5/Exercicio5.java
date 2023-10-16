import java.util.Random;

public class Exercicio5 {
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

        // Imprima a matriz e calcule a soma de cada linha
        System.out.println("Matriz e soma das linhas:");

        for (int i = 0; i < linhas; i++) {
            int somaLinha = 0; // Inicialize a soma da linha

            for (int j = 0; j < colunas; j++) {
                System.out.print(matriz[i][j] + "\t");
                somaLinha += matriz[i][j]; // Adicione o elemento à soma da linha
            }

            System.out.println("\tSoma da linha " + i + ": " + somaLinha);
        }
    }
}
