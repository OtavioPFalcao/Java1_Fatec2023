import java.util.Random;
import java.util.Scanner;

public class Exercicio7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        // Defina o tamanho da matriz e do vetor
        int linhas = 10;
        int colunas = 10;
        int tamanhoVetor = 10;

        // Crie uma matriz 10x10 de inteiros
        int[][] matriz = new int[linhas][colunas];

        // Preencha a matriz com números aleatórios de 0 a 99
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                matriz[i][j] = rand.nextInt(100); // Gera um número aleatório entre 0 e 99
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

        // Solicite ao usuário uma linha para copiar
        System.out.print("Digite o número da linha (entre 0 e 9): ");
        int linhaEscolhida = sc.nextInt();

        // Valide o número da linha
        if (linhaEscolhida < 0 || linhaEscolhida >= linhas) {
            System.out.println("Número de linha inválido.");
        } else {
            // Copie os elementos da linha escolhida para um vetor
            int[] vetor = new int[tamanhoVetor];

            for (int j = 0; j < tamanhoVetor; j++) {
                vetor[j] = matriz[linhaEscolhida][j];
            }

            // Imprima o vetor
            System.out.println("Vetor com os elementos da linha " + linhaEscolhida + ":");

            for (int j = 0; j < tamanhoVetor; j++) {
                System.out.print(vetor[j] + " ");
            }
        }

        sc.close();
    }
}
