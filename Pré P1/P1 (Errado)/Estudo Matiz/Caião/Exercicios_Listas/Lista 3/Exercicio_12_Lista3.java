import java.util.Scanner;

public class Exercicio_12_Lista3 {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        
        int fatorial = 1;
        int x = 1;

        System.out.print("Digite um número para calcular o seu Fatorial: ");
        int numero = num.nextInt();
        
        while (x <= numero) {
            fatorial = fatorial * x;
            x += 1;
        }
        System.out.println("\n-----------------------------------------------");
        System.out.println(numero + "!" + " (Fatorial) " + "é " + fatorial);
        System.out.println("-----------------------------------------------");
        num.close();
    }

}