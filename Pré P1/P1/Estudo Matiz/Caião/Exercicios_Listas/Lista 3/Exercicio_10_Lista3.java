import java.util.Scanner;

public class Exercicio_10_Lista3 {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        char continuar = 'S';

        while (continuar == 'S' || continuar == 's') {
            System.out.print("Digite um número: ");
            int valor1 = num.nextInt();

            System.out.print("Digite outro número (o número precisa ser maior que o anterior): ");
            int valor2 = num.nextInt();

            if (valor1 >= valor2) {
                System.out.println("O primeiro valor deve ser menor que o segundo valor.");
            } else {
                int soma = 0;
                for (int i = valor1; i <= valor2; i++) {
                    soma += i;
                }
                System.out.println("A soma entre " + valor1 + " e " + valor2 + " é: " + soma);
            }

            System.out.print("\nDeseja realizar outra soma? (S/N): ");
            continuar = num.next().charAt(0);
        }

        System.out.println("Programa encerrado.");
        num.close();
    }
}
