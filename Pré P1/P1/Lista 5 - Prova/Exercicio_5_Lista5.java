//Calcula a soma de todos os números da linha escolhida

import java.util.Random;

public class Exercicio_5_Lista5 {
    public static void main(String[] args) {
        int matriz[][] = new int[10][10];
        Random rand = new Random();

        System.out.println("\nMatriz (10x10) Gerada:\n");

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                matriz[i][j] = rand.nextInt(50) + 1;
                System.out.print(String.format("[%2d]", matriz[i][j]));
            }
            
            System.out.println();
        }

        System.out.println("\nSoma De Todos Os Números De Cada Linha:\n");
        
        for (int i = 0; i < 10; i++) {
            int soma = 0;
            for (int j = 0; j < 10; j++) {
                soma += matriz[i][j];
            }
            
            System.out.println("Linha " + (i + 1) + ": " + soma);

        }
    }
}