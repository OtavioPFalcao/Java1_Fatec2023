import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.printf("\nInsira o número do cidadão ==>  ");
        int numero = scanner.nextInt();
        scanner.nextLine(); // Consumir o caractere de nova linha

        System.out.printf("\nInsira o nome do cidadão ==>  ");
        String nome = scanner.nextLine();

        System.out.printf("\n");

        Var ret = new Var(nome, Integer.toString(numero)); // Converter o número em uma string

        System.out.println("Número ==> " + ret.numero);
        System.out.println("Nome ==> " + ret.nome);

        scanner.close();
    }
}