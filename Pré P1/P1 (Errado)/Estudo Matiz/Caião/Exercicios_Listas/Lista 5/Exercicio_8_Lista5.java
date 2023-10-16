import java.util.Random;
import java.util.Scanner;

public class Exercicio_8_Lista5 {
    public static void main(String[] args) {
        int matriz[][] = new int[10][10], cont = 0;
        Random rand = new Random();
        Scanner num = new Scanner(System.in);

        System.out.println("\nMatriz (10x10) Gerada:\n");

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                matriz[i][j] = rand.nextInt(99) + 0;
                System.out.print(String.format("[%2d]", matriz[i][j]));
            }
            System.out.println();
        }

        System.out.print("\nEscolha Uma Coluna (1 a 10): ");
        int numerocoluna = num.nextInt();

        System.out.print("<Coluna " + (numerocoluna + cont) + " Escolhida>");
        System.out.println("\n------------------------------------------------");

        if (numerocoluna < 1 || numerocoluna > 10) {
            System.out.print("Coluna Inválida, O Valor Precisa Ser De 1 a 10");
        } else {
            System.out.print("Escolha um Valor para Multiplicar a Coluna: ");
            int numeromultiplicar = num.nextInt();
            for (int i = 0; i < 10; i++) {
                matriz[i][numerocoluna - 1] *= numeromultiplicar;
            }

            System.out.println("\nMatriz 10x10 (Com a Coluna " + (numerocoluna + cont) + " Multiplicada por " + (numeromultiplicar + cont)+")\n") ;
            for (int i = 0; i < 10; i++) {
                for (int j = 0; j < 10; j++) {
                    System.out.print("[" + matriz[i][j] + "]" + "\t"); // Aqui decidi adicionar um espaçamento na matriz para não casuar confusão na hora de ver.
                }
                System.out.println(); 
            }
        num.close();
        }
    }

}
