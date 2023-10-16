import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Defina o tamanho da matriz
        int linhas = 2;
        int colunas = 3;

        // Declare e inicialize a matriz
        int[][] matriz = new int[linhas][colunas];

        // Solicite ao usuário para inserir os elementos da matriz
        System.out.println("Digite os elementos da matriz 2x3:");
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                System.out.print("Elemento [" + (i + 1) + "][" + (j + 1) + "]: ");
                matriz[i][j] = sc.nextInt();
            }
        }

        // Imprima a matriz
        System.out.println("Matriz:");
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }

        // Calcule a soma dos elementos
        int soma = 0;
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                soma += matriz[i][j];
            }
        }

        // Imprima a soma
        System.out.println("Soma dos elementos: " + soma);

        sc.close();
    }
}
