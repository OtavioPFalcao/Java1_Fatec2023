import java.util.Scanner;

public class TesteExer3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Digite qualquer coisa:  ");
            String var = scanner.nextLine();

            System.out.println(var);
            break;
        }

        scanner.close(); // Feche o scanner dentro do método main, após o loop.
    }
}
