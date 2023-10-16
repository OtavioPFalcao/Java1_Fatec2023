import java.util.Scanner;
import java.util.Random;

public class Exercicio_3_Lista5 {
    public static void main(String[] args) {
        int matriz[][] = new int[7][4], numero = 0;
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

        System.out.print("\nSelecione uma linha (1 a 7): ");
        numero = num.nextInt();
        if (numero >= 0 && numero <= 7) {
            System.out.println("------------------------------------");
            System.out.println("Elementos da linha " + numero + ":");
        }
        for (int j = 0; j < 4; j++) {
            System.out.print(String.format("[%2d]", matriz[numero - 1][j]) + " ");
        }
        num.close();
    }
}
