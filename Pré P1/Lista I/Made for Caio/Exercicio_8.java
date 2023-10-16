// Feito por Caio Mizohata, Big Data 2° Termo

import java.util.Scanner;

public class Exercicio_8 {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);

        double km, dias, preco;

        System.out.print("\n----------------------------------------------");
        System.out.print("\nDigite a Kilometragem(KM) percorrida: ");
        km = num.nextDouble();

        System.out.print("Em quantos dias o carro foi alugado?: ");
        dias = num.nextDouble();

        preco = (dias * 60) + (km * 0.15); 
        

        System.out.print("\n-----------------------------------------------------");
        System.out.printf("\nO pagamento será de: %.2f R$", preco);
        System.out.println("\n-----------------------------------------------------");


        num.close();
        
    }
}