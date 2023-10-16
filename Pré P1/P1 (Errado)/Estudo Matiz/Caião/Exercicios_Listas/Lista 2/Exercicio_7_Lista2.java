import java.util.Scanner;

public class Exercicio_7_Lista2 {
    public static void main(String[] args) {

        Scanner num = new Scanner(System.in);
        int n1, n2, n3, i;

        System.out.print("Digite um número(1): ");
        n1 = num.nextInt();

        System.out.print("Digite outro número(2): ");
        n2 = num.nextInt();

        System.out.print("Digite outro número(3): ");
        n3 = num.nextInt();

        if (n1 > n2) {
            i = n1;
            n1 = n2;
            n2 = i;
        }

        if (n2 > n3) {
            i = n2;
            n2 = n3;
            n3 = i;
        } 

        if (n1 > n2) {
            i = n1;
            n1 = n2;
            n2 = i;
        }

        System.out.print("Os números em ordem crescente são: "+ n1 + " -> " + n2 + " -> " + n3);
    
        num.close();
    }
}
