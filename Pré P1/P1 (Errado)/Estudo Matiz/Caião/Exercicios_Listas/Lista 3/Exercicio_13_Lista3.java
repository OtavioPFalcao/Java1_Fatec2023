import java.util.Scanner;

public class Exercicio_13_Lista3 {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        int i = 0;

        System.out.print("Digite um número: ");
        int numero = num.nextInt();

        for (int n = 1; n <= numero; n++) {
            if(numero % n == 0) {
                i++;
            }  
        }
        
        if (i == 2) {
            System.out.println("\n----------------------------------");
            System.out.println("O número " + numero + " é primo");
            System.out.println("----------------------------------");
        } else {
            System.out.println("\n----------------------------------");
            System.out.println("O número " + numero + " não é primo");
            System.out.println("----------------------------------");
        }
        
        num.close();
    }
}
