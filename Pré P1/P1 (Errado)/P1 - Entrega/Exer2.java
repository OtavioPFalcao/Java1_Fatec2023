import java.util.Random;

public class Exer2 {
    public static void main(String[] args) {
        Random rand = new Random();
        int[] A = new int[10];
        int[] B = new int[10];
        int[] C = new int[10];
        
        for (int i = 0; i < 10; i++) {
            A[i] = rand.nextInt(10);
            B[i] = rand.nextInt(10);
        }

        int tamanhoC = 0;
        
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (A[i] == B[j]) {
                    C[tamanhoC] = A[i];
                    tamanhoC++;
                    break;
                }
            }
        }

        System.out.println("Vetor A: ");
        for (int i : A) {
            System.out.print(i + " ");
        }
        System.out.println("\nVetor B: ");
        for (int i : B) {
            System.out.print(i + " ");
        }
        System.out.println("\nVetor C (Interseção): ");
        for (int i = 0; i < tamanhoC; i++) {
            System.out.print(C[i] + " ");
        }
    }
}
