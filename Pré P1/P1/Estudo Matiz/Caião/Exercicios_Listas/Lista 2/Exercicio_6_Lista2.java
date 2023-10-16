import java.util.Scanner;

public class Exercicio_6_Lista2 {
    public static void main(String[] args) {

        Scanner num = new Scanner(System.in);
        double ano;

        System.out.print("Digite o Ano para saber se é Bissexto: ");
        ano = num.nextDouble();

        if (ano% 4 == 0 && ano% 100 != 0 || ano% 400 == 0) {
            System.out.println("O Ano é Bissexto");
        } else {
            System.out.println("O Ano não é Bissexto");
        }

        num.close();
    }
    
}
