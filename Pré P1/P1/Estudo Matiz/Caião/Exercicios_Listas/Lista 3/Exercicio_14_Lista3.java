import java.util.Scanner;

public class Exercicio_14_Lista3 {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        
        System.out.print("Digite um número (Quadrado Perfeito): ");
        int numero = num.nextInt();

        double raiz = Math.sqrt(numero);

        if (Math.pow(raiz, 2) == numero) {
            System.out.println("\n--------------------------------");
            System.out.printf("%d é um quadrado perfeito\n", numero);
            System.out.println("--------------------------------");
        } else {
            System.out.println("\n--------------------------------");
            System.out.printf("%d não é um quadrado perfeito\n", numero);
            System.out.println("--------------------------------");
        }
        num.close();
    }
}
