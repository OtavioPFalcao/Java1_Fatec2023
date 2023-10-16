import java.util.Scanner;
import java.util.Random;

public class Exercicio_10_Lista4 {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner num = new Scanner(System.in);
        int vet[] = new int[10], c1 = -1;

        System.out.print("Vetor: ");
        for (int i = 0; i < vet.length; i++) {
            vet[i] = rand.nextInt(50) + 1;
            System.out.print(vet[i] + " ");
        }
        
        System.out.print("\nDigite um número: ");
        int numero = num.nextInt();

        for (int i = 0; i < vet.length; i++) {
            if (numero == vet[i]) {
                c1 = i;
                break;
            }
        }

        if (c1 != -1) {
            System.out.println("O número foi encontrado no vetor");
        } else {
            System.out.println("O número não foi encontrado no vetor.");
        }
        num.close();
    }
}
