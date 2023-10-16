// Feito por Caio Mizohata, Big Data 2° Termo

import java.util.Scanner;

public class Exercicio_3 {
    public static void main(String[] args) {


        Scanner number = new Scanner(System.in);
        float n1;

        System.out.print("\n---------------------------------");
        System.out.print("\nDigite um valor em Metros: ");
        n1 = number.nextFloat();
        
        float calc = n1 * 1000;
        System.out.print("\n----------------------------------------------------");
        System.out.printf("\nA conversão será de: %.2f Milímetros",calc);
        System.out.print("\n----------------------------------------------------");
        number.close();

    }
}
