import java.util.Scanner;

public class Exer6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("\nDigite o valor desejado em Bits: ");
        int valorBits = scanner.nextInt();

        int[] notas = {50, 10, 5, 1};
        int[] quantidadeNotas = new int[4];

        for (int i = 0; i < notas.length; i++) {
            quantidadeNotas[i] = valorBits / notas[i];
            valorBits %= notas[i];
        }

        System.out.printf("\nObrigado por Utilizar nossos caixas!!\n\n" + "Aqui estão as respectivas cédulas: \n");
        
        if (quantidadeNotas[0] > 0) {
            System.out.println("Sacar " + quantidadeNotas[0] + " Notas de B$50,00");
        }

        if (quantidadeNotas[1] > 0) {
            System.out.println("Sacar " + quantidadeNotas[1] + " Notas de B$10,00");
        }

        if (quantidadeNotas[2] > 0) {
            System.out.println("Sacar " + quantidadeNotas[2] + " Notas de B$5,00");
        }

        if (quantidadeNotas[3] > 0) {
            System.out.println("Sacar " + quantidadeNotas[3] + " Notas de B$1,00");
        }

        System.out.printf("\n\nObrigado por Utilizar nossos caixas!!\n");

        scanner.close();
    }
}
