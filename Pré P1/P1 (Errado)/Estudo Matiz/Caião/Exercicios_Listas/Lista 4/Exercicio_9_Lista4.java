import java.util.Random;

public class Exercicio_9_Lista4 {
    public static void main(String[] args){
        Random num = new Random();
        int vet[] = new int[10], numero = 0;
        
        System.out.print("Números sem repetições: ");
        for (int i = 0; i < vet.length; i++) {
            vet[i] = num.nextInt(50) + 1;
            for (int j = 0; j < vet.length; j++) {
                if (numero == vet[j] && j != i) {
                    numero = num.nextInt(50) + 1;
                    j--;
                } else {
                    vet[i] = numero;
                }
            }
        }
        
        for (int i=0; i < vet.length; i++) {
            System.out.print(vet[i]+ " ");
        }
    } 
}

