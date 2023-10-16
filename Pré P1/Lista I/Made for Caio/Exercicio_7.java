// Feito por Caio Mizohata, Big Data 2° Termo

import java.util.Scanner;

public class Exercicio_7 {
    public static void main(String[] args) {

        Scanner num = new Scanner(System.in);

        float Combustivel, Desempenho, Distancia;

        System.out.print("\n--------------------------------------");
        System.out.print("\nDigite o preço do combustivel: ");
        Combustivel = num.nextFloat();

        System.out.print("Quantos litros por KM/h? o automóvel faz: ");
        Desempenho = num.nextFloat();

        System.out.print("Digite a distância entre as duas cidades (KM): ");
        Distancia = num.nextFloat();

        float consumo = Distancia / Desempenho;
        float gasto = consumo * Combustivel;

        System.out.println("\n------------------------------------------------------------");
        System.out.printf("O veículo consumirá: %.2f Litros", consumo);
        System.out.printf("\nE seu gasto de combustível será de: %.2f R$",gasto);
        System.out.println("\n------------------------------------------------------------");
        
        num.close();
    }
} 
