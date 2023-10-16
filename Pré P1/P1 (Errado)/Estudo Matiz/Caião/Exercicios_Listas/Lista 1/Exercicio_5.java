// Feito por Caio Mizohata, Big Data 2° Termo

import java.util.Scanner;

public class Exercicio_5 {
    public static void main(String[] args){

        Scanner num = new Scanner(System.in);
        int a, b, c;

        System.out.print("\n-----------------------------");
        System.out.print("\nDigite o valor de A: ");
        a = num.nextInt();

        System.out.print("Digite o valor de B: ");
        b = num.nextInt();

        System.out.print("------------------------");
        System.out.println("\nA: " + a + " B: "+b);
    
        c = a;
        a = b;
        b = c;

        System.out.print("\n-------------------------------------------------");
        System.out.println("\nNovo Valor de A: " + a + "\nNovo Valor de B: "+b);
        System.out.print("---------------------------------------------------");
        
        num.close();
    }
}
