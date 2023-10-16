import java.util.Random;

public class Exercicio_5_Lista4 {
    public static void main(String[] args) {
        Random num = new Random();
        int vet[] = new int[10];
    
        System.out.println("----------------------------------------------------------------");
        System.out.print("Números Na Ordem Direta: ");
        for (int i = 0; i < vet.length; i++) {
            vet[i] = num.nextInt(50) + 1;
            System.out.print(vet[i] + " ");
        }

        System.out.print("\nNúmeros Na Ordem Inversa: ");
        for(int i = vet.length - 1; i >=0; i--) {
            System.out.print(vet[i] + " ");
        }
        
    }
}
