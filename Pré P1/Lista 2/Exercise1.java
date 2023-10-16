import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um número de 3 algarismos:");
        int numero = sc.nextInt();

        if (numero >= 100 && numero <= 999) {
            int algarismo1 = numero / 100;
            int algarismo2 = (numero % 100) / 10;
            int algarismo3 = numero % 10;

            if (algarismo1 < algarismo2 && algarismo2 < algarismo3) {
                System.out.println("O número " + numero + " é ascendente.");
            } else {
                System.out.println("O número " + numero + " não é ascendente.");
            }
        } 
        
        sc.close();
    }
}