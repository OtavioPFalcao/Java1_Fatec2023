import java.util.Scanner;

public class Exercicio_3_Lista2 {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);

        double Area, Base, Altura;
        char op;

        System.out.print("ESCOLHA UMA OPÇÃO (1 - ÁREA (RETÂNGULO) | 2- ÁREA (TRIÂNGULO)): ");
        op = num.next().charAt(0);

        System.out.print("Digite a Base: ");
        Base = num.nextDouble();

        System.out.print("Digite a Altura: ");
        Altura = num.nextDouble();

        switch (op) {
            case '1':
            Area = Base * Altura;
            System.out.printf("A Área do Retângulo será de %.2f M²", Area);
            break;
        }
        
        switch (op) {
            case '2':
            Area = (Base*Altura) / 2;
            System.out.printf("A Área do Triângulo será de %.2f M²", Area);
            break;
        }
        num.close();
    }
}

