import java.util.Scanner;

public class Exercicio_1_Lista2 {
    public static void main (String[] args) {
        Scanner num = new Scanner(System.in);
        
        int centena, dezena, unidade, numero;

        System.out.print("Digite um número de 3 algarismos: ");
        numero = num.nextInt();
        
        if (numero >= 1000) {
            System.out.print("O numero não pode ser maior que 1000");
        } else {
            centena = numero / 100;
            dezena = numero % 100 / 10;
            unidade = numero % 10;
            
            if(centena < dezena && dezena < unidade) {
                System.out.println("O número " + numero + " é Ascendente");
            } else {
                System.out.println("O número "+ numero + " não é ascendente");

        }

                num.close();
            }
                }
                    }   
                
        
