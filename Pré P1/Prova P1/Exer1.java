import java.util.Scanner;

public class Exer1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char continuar;

        do {
            System.out.print("Digite o valor x: ");
            int a = scanner.nextInt();

            System.out.print("Digite o valor y: ");
            int b = scanner.nextInt();

            System.out.print("Digite o valor z: ");
            int c = scanner.nextInt();

            // Ordenação dos valores
            int temp;
            if (a > b) {
                temp = a;
                a = b;
                b = temp;
            }
            if (b > c) {
                temp = b;
                b = c;
                c = temp;
            }
            if (a > b) {
                temp = a;
                a = b;
                b = temp;
            }

            System.out.println("Valores ordenados: a=" + a + ", b=" + b + ", c=" + c);

            System.out.print("Deseja repetir (S/N)? ");
            continuar = scanner.next().charAt(0);

        } while (continuar == 'S' || continuar == 's');

        scanner.close();
    }
}