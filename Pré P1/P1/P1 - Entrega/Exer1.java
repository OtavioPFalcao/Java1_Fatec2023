import java.util.Scanner;

public class Exer1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        for (;;) {
            System.out.print("Digite o primeiro valor (a): ");
            int a = scanner.nextInt();
            System.out.print("Digite o segundo valor (b): ");
            int b = scanner.nextInt();
            System.out.print("Digite o terceiro valor (c): ");
            int c = scanner.nextInt();

            if (a > b) {
                int temp = a;
                a = b;
                b = temp;
            }
            if (b > c) {
                int temp = b;
                b = c;
                c = temp;
            }
            if (a > b) {
                int temp = a;
                a = b;
                b = temp;
            }

            System.out.println("Valores em ordem crescente: " + a + ", " + b + ", " + c);

        scanner.close();

        break;
        }
    }
}