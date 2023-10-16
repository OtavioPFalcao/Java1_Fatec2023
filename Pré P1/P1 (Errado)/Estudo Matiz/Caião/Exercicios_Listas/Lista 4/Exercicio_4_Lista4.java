import java.util.Random;
import java.util.Scanner;

public class Exercicio_4_Lista4 {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner num = new Scanner(System.in);
        int vet[] = new int[20];

        System.out.println("Números Gerados: ");
        
        for (int i = 0; i < vet.length; i++) {
            vet[i] = rand.nextInt(50) + 1;
            System.out.print(vet[i] + " ");
        }
        
        System.out.print("\nEscolha um número (1 a 50): ");
        int numerousuario = num.nextInt();

        System.out.println("-----------------------------------------------------------");
        System.out.print("Múltiplos de "+numerousuario + ": ");
       
        for (int i = 0; i < vet.length; i++) {
            if (vet[i] % numerousuario == 0) {
                System.out.print(vet[i] + " ");
            }
        }
        num.close();
    }
}
