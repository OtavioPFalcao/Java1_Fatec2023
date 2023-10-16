import java.util.Random;

public class Exercicio2 {
    public static void main(String[] args) {
        // Defina o tamanho da matriz
        int linhas = 10;
        int colunas = 10;

        // Crie uma matriz 10x10 de inteiros
        int[][] matriz = new int[linhas][colunas];

        // Preencha a matriz com números aleatórios entre 1 e 50
        Random rand = new Random();
        int menorElemento = 51; // Inicialize com um valor maior do que o máximo possível
        System.out.println("Matriz:");

        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                matriz[i][j] = rand.nextInt(50) + 1; // Gera um número aleatório entre 1 e 50
                System.out.print(matriz[i][j] + " ");
                
                // Encontre o menor elemento da matriz
                if (matriz[i][j] < menorElemento) {
                    menorElemento = matriz[i][j];
                }
            }
            System.out.println();
        }

        // Imprima o menor elemento
        System.out.println("Menor elemento da matriz: " + menorElemento);
    }
}
