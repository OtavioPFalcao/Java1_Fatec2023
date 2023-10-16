import java.util.Arrays;
import java.util.Random;

public class Exercicio_7_Lista4 {
    public static void main(String[] args) {
        Random num = new Random();
        int vet[] = new int[10];

        System.out.print("Números Gerados: ");
        for (int i = 0; i < vet.length ;i++) {
            vet[i] = num.nextInt(50) + 1;
            System.out.print(vet[i] + " ");
        }
        
        Arrays.sort(vet);

        System.out.print("\nNúmeros Ordenados Ascendentemente: ");
        for (int j = 0; j < vet.length; j++) {
            Arrays.sort(vet);
            System.out.print(vet[j] + " ");
        }
    }
}