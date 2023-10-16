import java.util.Random;
import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        // Defina o tamanho da matriz
        int linhas = 7;
        int colunas = 4;

        // Crie uma matriz 7x4 de inteiros
        int[][] matriz = new int[linhas][colunas];

        // Preencha a matriz com números aleatórios entre 1 e 50
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                matriz[i][j] = random.nextInt(50) + 1; // Gera um número aleatório entre 1 e 50
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

        // Solicite ao usuário o número da coluna desejada
        int colunaEscolhida;

        do {
            System.out.print("Digite o número da coluna (entre 0 e 3): ");
            colunaEscolhida = sc.nextInt();

            if (colunaEscolhida < 0 || colunaEscolhida >= colunas) {
                System.out.println("Número de coluna inválido. Tente novamente.");
            }
        } while (colunaEscolhida < 0 || colunaEscolhida >= colunas);

        // Imprima os elementos da coluna escolhida
        System.out.println("Elementos da coluna " + colunaEscolhida + ":");

        for (int i = 0; i < linhas; i++) {
            System.out.println(matriz[i][colunaEscolhida]);
        }

        sc.close();
    }
}
