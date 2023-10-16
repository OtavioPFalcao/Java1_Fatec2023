import java.util.Random;
import java.util.Scanner;

public class Exercicio_7_Lista5 {
    public static void main(String[] args) {
        int matriz[][] = new int[10][10];
        Random rand = new Random();
        Scanner num = new Scanner(System.in);

        System.out.println("\nMatriz (10x10) Gerada:\n");

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                matriz[i][j] = rand.nextInt(99) + 0;
                System.out.print(String.format("[%2d]", matriz[i][j]));
            }
            System.out.println();
        }

        System.out.print("\nEscolha Uma Linha (1 a 10): ");
        int numerolinha = num.nextInt();

        if (numerolinha < 1 || numerolinha > 10) {
           System.out.print("Linha inválida, O Valor Precisa Ser De 1 a 10");
        } else {
            int vet[] = new int[10], c = 0;
            for (int j = 0; j < 10; j++) {
                vet[j] = matriz[numerolinha - 1][j];
          }

          System.out.print("\nVetor " + "[" + "Linha " + (numerolinha + c) + "]" + " -> ");
          
        for (int i = 0; i < 10; i++) {
            System.out.print(String.format("[%2d]", vet[i]));
            }
        num.close();
        }   
    }
}
