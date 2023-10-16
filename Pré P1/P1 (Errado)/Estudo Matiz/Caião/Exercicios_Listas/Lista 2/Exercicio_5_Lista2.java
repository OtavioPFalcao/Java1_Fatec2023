import java.util.Scanner;

public class Exercicio_5_Lista2 {
    public static void main(String[] args) {
        
        Scanner num = new Scanner(System.in);

        double Angulo1, Angulo2, Angulo3;

        System.out.print("Digite um valor para o Ângulo(1): ");
        Angulo1 = num.nextDouble();

        System.out.print("Digite um valor para o Ângulo(2): ");
        Angulo2 = num.nextDouble();

        System.out.print("Digite um valor para o Ângulo(3): ");
        Angulo3 = num.nextDouble();

        if (Angulo1 + Angulo2 + Angulo3 == 180) {
            System.out.println("Os Ângulos Não Formam Um Triângulo");
        } else {
            if (Angulo1 < 90 && Angulo2 < 90 + Angulo3) {
                System.out.println("Os Ângulos formam um Triângulo Acutângulo");
            } 

            if (Angulo1 == 90 || Angulo2 == 90 || Angulo3 == 90 ) {
                System.out.println("Os Ângulos formam um Triângulo Retângulo");
            }
            
            if (Angulo1 > 90 && Angulo2 > 90 && Angulo3 > 90) {
                System.out.println("Os Ângulos formam um Triângulo Obtusângulo");
            }
            
            }
            
            num.close();
    }
}