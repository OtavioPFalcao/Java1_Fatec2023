import java.util.Scanner;

public class Exercicio_6_Lista3 {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        int par = 0;
        int impar = 0;

        System.out.print("Digite a quantidade de números para serem lidos: ");
        int quantidade = num.nextInt();

        for (int i = 1; i <= quantidade; i++) {
            System.out.println("-------------------------");
            System.out.printf("%d° ", i);
            
            System.out.print("Digite um número: ");
            int n = num.nextInt();

            if (n % 2 == 0) {
                par += n;
            } else {
                impar += n;
            }
        }
        System.out.println("\n---------------------------------");
        System.out.println("A soma dos pares é: "+par);
        System.out.println("A soma dos impares é: "+impar);
        
        num.close();
    }
}