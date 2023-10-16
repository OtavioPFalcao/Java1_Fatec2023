// Feito por Caio Mizohata, Big Data 2° Termo

import java.util.Scanner;

public class Exercicio_6 {
    public static void main(String[] args) {

        Scanner num = new Scanner(System.in);
        float salario, reajuste;

        System.out.print("\n-------------------------------");
        System.out.print("\nDigite o salário mensal: ");
        salario = num.nextFloat();

        System.out.print("Digite a porcentagem: ");
        reajuste = num.nextFloat();

        float soma = salario + salario * reajuste / 100;
        
        System.out.println("\n----------------------------------------------------------");
        System.out.printf("O novo salário reajustado será de: %.2f R$", soma);
        System.out.println("\n--------------------------------------------------------");

        num.close();
    }
}
