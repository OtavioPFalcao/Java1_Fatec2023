import java.util.Random;
import java.util.Arrays;

public class vetor {
    private Random rand;
    private int[] vet;
    
    public vetor(int tamanho) {
        this.vet = new int[tamanho];
        this.rand = new Random();
       
       System.out.print("Vetor Gerado: ");

       for (int i = 0; i < tamanho; i++) {
            vet[i] = rand.nextInt(50) + 1;
            System.out.print(String.format("[%2d]", vet[i]));
       }
    }

    public void Ordenar() {
        for (int j = 0; j < vet.length; j++) {
            Arrays.sort(vet);
            System.out.print(String.format("[%2d]", vet[j]));
        }
    }

    public int acharMaior() {
       int maior = Integer.MIN_VALUE;
       for (int i = 0; i < vet.length; i++) {
            if (vet[i] > maior) {
                maior = vet[i];
            }
       }
       return maior;
    }

    public int acharMenor() {
        int menor = Integer.MAX_VALUE;
        for (int i = 0; i < vet.length; i++) {
            if (vet[i] < menor) {
                menor = vet[i];
            }
        }
        return menor;
    }

    public int procurarElemento(int elemento) {
        for (int i = 0; i < vet.length; i++) {
            if (vet[i] == elemento) {
                return vet[i];
            } 
        }

        return -1;

        }
        
    }


