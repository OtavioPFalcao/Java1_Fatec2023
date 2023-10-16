import java.util.Scanner;

public class Exercicio_4_Lista2 {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        
        double valor1, valor2, valor3;
        
        System.out.print("Digite um valor (Lado 1): ");
        valor1 = num.nextDouble();

        System.out.print("Digite um valor (Lado 2): ");
        valor2 = num.nextDouble();

        System.out.print("Digite um valor (Lado 3): ");
        valor3 = num.nextDouble();

        if ((valor1 + valor2 > valor3 && valor1 + valor3 > valor2 && valor2 + valor3 > valor1)) {
            if (valor1 == valor2 && valor2 == valor3) {
                System.out.println("Triângulo Equilátero");
            } else if ((valor1 == valor2) || (valor2 == valor3 || valor3 == valor1)) {
                System.out.println("Triângulo Isósceles");
            } else {
                System.out.println("Triângulo Escaleno");
            } 
        } else {
            System.out.println("Os lados não formam um triângulo");
        }
        num.close();
    }
}
