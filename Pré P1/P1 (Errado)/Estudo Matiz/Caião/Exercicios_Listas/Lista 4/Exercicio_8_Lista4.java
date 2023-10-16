import java.util.Random;

public class Exercicio_8_Lista4 {
    public static void main(String[] args) {
        Random num = new Random();
        int vetor[] = new int[20];

        System.out.print("Vetor A (Todos os Números): ");
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = num.nextInt(50) + 1;
            System.out.print(vetor[i] + " ");
        }

        System.out.print("\nVetor B (Números Pares): ");
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] % 2 == 0) {
                System.out.print(vetor[i] + " ");
            } 
        }
        
        System.out.print("\nVetor C (Números Ímpares): ");
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] % 2 != 0) {
                System.out.print(vetor[i] + " ");
            }
        }
    }
}

