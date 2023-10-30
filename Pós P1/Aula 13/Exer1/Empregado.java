import java.util.Scanner;

class Empregado {
    public String nome;
    public String numero;

    public Empregado() {
        Scanner scanner = new Scanner(System.in);
        
        System.out.printf("\nInsira o número do cidadão ==>  ");
        numero = scanner.nextLine(); // Agora, atribuímos o valor lido a "numero" da classe
        scanner.nextLine(); // Consumir o caractere de nova linha

        System.out.printf("\nInsira o nome do cidadão ==>  ");
        nome = scanner.nextLine(); // Agora, atribuímos o valor lido a "nome" da classe
    }
}
