// Feito por Caio Mizohata, Big Data 2° Termo

import java.util.Scanner;

public class Exercicio_9 {
    public static void main(String[] args) {

        Scanner num = new Scanner(System.in);

        double farenheit, calc, conversao;

        System.out.print("\n------------------------------------------");
        System.out.print("\nDigite a temperatura em Fahrenheit(F°): ");
        farenheit = num.nextDouble();

        calc = farenheit - 32;
        conversao = (calc / 9) * 5;

        System.out.print("\n-----------------------------------------------");
        System.out.printf("\nA conversão será de: %.1f°C",conversao);
        System.out.print("\n-----------------------------------------------");

        num.close();
    }
}
