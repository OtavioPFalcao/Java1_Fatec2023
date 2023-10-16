import java.util.Random;
import java.util.Scanner;

public class Exercicio_6_Lista4 {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        Random rand = new Random();
        int vetorA[] = new int[10], vetorB[] = new int[10], x;

        System.out.print("Vetor A: ");
        
        for (int i = 0; i < vetorA.length; i++) {
            vetorA[i] = rand.nextInt(50) + 1;
            System.out.print(vetorA[i] + " ");
        }

        System.out.print("\nDigite um valor para x: ");
        x = num.nextInt();

        for (int i = 0; i < vetorB.length; i++) {
            vetorB[i] = vetorA[i] * x;
        }

        System.out.print("Vetor B (Números multiplicados): ");
        for (int i = 0; i < vetorB.length; i++) {
            System.out.print(vetorB[i] + " ");
        }
        System.out.println();

        num.close();
    }
}
