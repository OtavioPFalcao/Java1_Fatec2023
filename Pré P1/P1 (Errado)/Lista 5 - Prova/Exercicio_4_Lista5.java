//Exibe os números da coluna escolhida

import java.util.Random;
import java.util.Scanner;

public class Exercicio_4_Lista5 {
    public static void main(String[] args) {
        int matriz[][] = new int[7][4];
        Random rand = new Random();
        Scanner num = new Scanner(System.in);

        System.out.println("\nMatriz (7x4) Gerada:\n");

        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 4; j++) {
                matriz[i][j] = rand.nextInt(50) + 1;
                System.out.print(String.format("[%2d]", matriz[i][j]));
            }

            System.out.println();
        }

        System.out.print("\nSelecione Uma Coluna (1 a 4): ");
        int numerocoluna = num.nextInt();

        if (numerocoluna >= 1 && numerocoluna <= 4) {
            System.out.println("--------------------------------------------------------------");
            System.out.println("Elementos Da Coluna " + numerocoluna + ": ");
            for (int i = 0; i < 7; i++) {
                System.out.println(String.format("[%2d]", matriz[i][numerocoluna - 1]));
            }
        } else {
            System.out.println("Número de coluna fora do intervalo válido (1 a 4).");
        }
        
        num.close();
    }
}
