// Feito por Caio Mizohata, Big Data 2° Termo

import java.util.Scanner;

public class Exercicio_1 {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        int n1;
        int n2;
        
        System.out.print("\n-------------------------");
        System.out.print("\nDigite um número: ");
        n1 = num.nextInt();

        System.out.print("Digite outro número: ");
        n2 = num.nextInt();

        int soma = n1 + n2;

        System.out.print("\n------------------------------");
        System.out.print("\nA soma será: " +soma);
        System.out.print("\n------------------------------");
        num.close();
    }
}
