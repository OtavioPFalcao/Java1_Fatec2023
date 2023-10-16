import java.util.Random;

public class Exercicio_2_Lista4 {
    public static void main(String[] args) {
        Random num = new Random();
        int vet [] = new int[10];
        int c1 = 0, c2 = 0;
        
        System.out.print("Numeros Gerados: ");

        for (int i = 0; i < vet.length; i++) {
            vet[i] = num.nextInt(50) + 1;
            System.out.print(vet[i] + " ");
            
            if (vet[i] % 2 == 0) {
            c2++;
            c1 += vet[i];
            
            }
        }
        
        System.out.println("\nNúmeros pares gerados: "+c2);

        if (c1 > 0) {
            double media = c1 / c2;
            System.out.println("Média dos números pares: "+media+" %");
        } else {
            System.out.println("Nenhum número par foi gerado");
        }

    }
}   
