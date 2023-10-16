import java.util.Scanner;

public class Exercicio_9_Lista3 {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        int numero;

        System.out.print("Digite a quantidade de números: ");
        numero = num.nextInt();

        int n1 = 1;
        int n2 = 1;

        System.out.print(n1 + " " + n2 + " ");

        for (int i = 2; i < numero; i++) {
            int next = n1 + n2;
            System.out.print(next + " ");
            n1 = n2;
            n2 = next;
        }
        num.close();
    }
}
