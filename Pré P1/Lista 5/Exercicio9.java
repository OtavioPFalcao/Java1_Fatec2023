public class Exercicio9 {
    public static void main(String[] args) {
        // Defina o tamanho da matriz quadrada
        int tamanho = 10;

        // Crie uma matriz 10x10 de inteiros
        int[][] matriz = new int[tamanho][tamanho];

        // Preencha a matriz com valores
        preencherMatriz(matriz);

        // Imprima a matriz original
        System.out.println("Matriz original:");
        imprimirMatriz(matriz);

        // Troque os elementos das diagonais principal e secundária
        trocarDiagonais(matriz);

        // Imprima a matriz após a troca
        System.out.println("\nMatriz após a troca das diagonais:");
        imprimirMatriz(matriz);
    }

    // Função para preencher a matriz com valores
    public static void preencherMatriz(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = i * matriz.length + j + 1;
            }
        }
    }

    // Função para trocar os elementos das diagonais principal e secundária
    public static void trocarDiagonais(int[][] matriz) {
        int tamanho = matriz.length;

        for (int i = 0; i < tamanho; i++) {
            int temp = matriz[i][i];
            matriz[i][i] = matriz[i][tamanho - 1 - i];
            matriz[i][tamanho - 1 - i] = temp;
        }
    }

    // Função para imprimir a matriz
    public static void imprimirMatriz(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }
    }
}