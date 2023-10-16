import java.util.Random;
import java.util.Scanner;

public class Exercicio8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        // Defina o tamanho da matriz
        int linhas = 10;
        int colunas = 10;

        // Crie uma matriz 10x10 de inteiros
        int[][] matriz = new int[linhas][colunas];

        // Preencha a matriz com números aleatórios de 0 a 99
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                matriz[i][j] = rand.nextInt(100); // Gera um número aleatório entre 0 e 99
            }
        }

        // Imprima a matriz
        System.out.println("Matriz original:");

        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }

        // Solicite ao usuário o número da coluna a ser multiplicada
        System.out.print("Digite o número da coluna (entre 0 e 9): ");
        int colunaEscolhida = sc.nextInt();

        // Valide o número da coluna
        if (colunaEscolhida < 0 || colunaEscolhida >= colunas) {
            System.out.println("Número de coluna inválido.");
        } else {
            // Solicite ao usuário um valor para multiplicação
            System.out.print("Digite um valor para multiplicação: ");
            int valorMultiplicacao = sc.nextInt();

            // Multiplique todos os elementos da coluna pelo valor fornecido
            for (int i = 0; i < linhas; i++) {
                matriz[i][colunaEscolhida] *= valorMultiplicacao;
            }

            // Imprima a matriz resultante
            System.out.println("Matriz após a multiplicação:");

            for (int i = 0; i < linhas; i++) {
                for (int j = 0; j < colunas; j++) {
                    System.out.print(matriz[i][j] + "\t");
                }
                System.out.println();
            }
        }

        sc.close();
    }
}