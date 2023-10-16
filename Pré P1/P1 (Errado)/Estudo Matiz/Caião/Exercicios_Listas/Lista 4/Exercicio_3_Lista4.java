import java.util.Random;

public class Exercicio_3_Lista4 {
    public static void main(String[] args) {
        Random num = new Random();
        int vet[] = new int[20];

        for (int i = 0; i < vet.length ; i++) {
            vet[i] = num.nextInt(50) + 1;
            System.out.print(vet[i] + " ");

            if (vet[i] % 5 == 0) {
                System.out.println("(Múltiplo de 5)");
            } else {
                System.out.println();
            }
        }
    }
}
