import java.util.Scanner;

public class Exercicio_15_Lista3 {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);

        System.out.print("Digite um número (Número Inteiro): ");
        int numero = num.nextInt();

        for (int i = 1; i <= numero; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i * j + " ");
            }
            System.out.println();
        }
        num.close();
    }
}