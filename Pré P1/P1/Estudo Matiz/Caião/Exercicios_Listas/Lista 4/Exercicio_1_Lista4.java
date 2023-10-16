import java.util.Random;

public class Exercicio_1_Lista4 {
    public static void main(String[] args) {
        int vet [] = new int[10];
        int c1 = 0, c2 = 0;

        Random num = new Random();

        for (int i = 0; i < vet.length; i++) {
            vet[i] = num.nextInt(10) + 1;
            
            if (vet[i] % 2 == 0) {
                c1++;
            } else {
                c2++;
            }
            
            System.out.println("Número gerado: "+ vet[i]);
        }
        
        System.out.println("\n------------------------");
        System.out.println("Números Pares: "+ c1);
        System.out.println("Números impares: "+ c2);
    }
}
