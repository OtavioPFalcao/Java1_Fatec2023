import java.util.Random;
import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Defina o tamanho da matriz
        int linhas = 7;
        int colunas = 4;

        // Crie uma matriz 7x4 de inteiros
        int[][] matriz = new int[linhas][colunas];

        // Preencha a matriz com números aleatórios entre 1 e 50
        Random rand = new Random();

        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                matriz[i][j] = rand.nextInt(50) + 1; // Gera um número aleatório entre 1 e 50
            }
        }

        // Solicite ao usuário o número da linha desejada
        System.out.print("Digite o número da linha (entre 0 e 6): ");
        int linhaEscolhida = sc.nextInt();

        // Valide o número da linha
        if (linhaEscolhida < 0 || linhaEscolhida >= linhas) {
            System.out.println("Número de linha inválido.");
        } else {
            // Imprima os elementos da linha escolhida
            System.out.println("Elementos da linha " + linhaEscolhida + ":");
            for (int j = 0; j < colunas; j++) {
                System.out.print(matriz[linhaEscolhida][j] + " ");
            }
        }

        sc.close();
    }
}