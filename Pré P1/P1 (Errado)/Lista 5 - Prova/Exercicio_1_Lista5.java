//Soma de Todos os Números

import java.util.Random;

public class Exercicio_1_Lista5 {
    public static void main(String[] args) {
        int matriz[][] = new int[10][10], soma = 0;
        Random num = new Random();

        System.out.println("\nMatriz (10x10) Gerada:\n");

        for (int i = 0; i < 2 ;i++) {
            for (int j = 0; j < 3; j++) {
                matriz[i][j] = num.nextInt(50) + 1;
                soma += matriz[i][j];
                }
            }

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(String.format("[%2d] ", matriz[i][j]));
            }
            System.out.println();
        }
        
        System.out.print("\nA Soma De Todos Os Números Será De: "+soma);

    }
}
