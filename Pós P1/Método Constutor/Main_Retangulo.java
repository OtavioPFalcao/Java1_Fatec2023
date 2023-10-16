import java.util.Scanner;

public class Main_Retangulo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.printf("\nInsira o valor da base do retângulo ==>  ");
        int base = scanner.nextInt();

        System.out.printf("\nInsira o valor da altura do retângulo ==>  ");
        int altura = scanner.nextInt();

        System.out.printf("\n");
    
        Retangulo ret = new Retangulo(base, altura);

        System.out.println("Base ==> " + ret.retornaBase());
        System.out.println("Altura ==> " + ret.retornaAltura());

        ret.calculaArea();
        ret.calculaPerimetro();

        scanner.close();
    }
}