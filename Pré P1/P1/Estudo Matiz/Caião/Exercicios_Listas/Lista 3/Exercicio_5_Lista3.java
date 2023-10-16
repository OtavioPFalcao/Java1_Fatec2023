import java.util.Scanner;

public class Exercicio_5_Lista3 {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        int par = 0;
        int impar = 0;

        for (int i = 1; i <= 10; i++) {
            System.out.println("-------------------------");
            System.out.printf("%d°", i);

            System.out.print(" Digite um número: ");
            int numero = num.nextInt();

            if (numero % 2 == 0) {
                par += numero;
            } else {
                impar += numero;
            }
        }
        
        System.out.println("\n---------------------------------");
        System.out.println("A soma dos pares é: "+par);
        System.out.println("A soma dos impares é: "+impar);
        num.close();
        
    }
}
