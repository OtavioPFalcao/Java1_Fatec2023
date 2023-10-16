// Feito por Caio Mizohata, Big Data 2° Termo

import java.util.Scanner;

public class Exercicio_2 {
    public static void main(String[] args) {
        
        Scanner num = new Scanner(System.in);

        int n1, n2, n3;

        System.out.print("\n--------------------------------");
        System.out.print("\nDigite um número(1): ");
        n1 = num.nextInt();

        System.out.print("Digite um número(2): ");
        n2 = num.nextInt();

        System.out.print("Digite um número(3): ");
        n3 = num.nextInt();
        
        int soma = n1 + n2 + n3;
        float media = soma / 3;

        System.out.print("\n--------------------------------------");
        System.out.printf("\nA média será de: %.1f",media);
        System.out.print("\n----------------------------------------");
        num.close();
    }
}
