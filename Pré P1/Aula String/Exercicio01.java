import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Crie uma variável para armazenar as strings
        StringBuilder strings = new StringBuilder();

        // Solicite ao usuário inserir várias strings
        System.out.println("Digite várias strings (use '.' para finalizar):");

        while (true) {
            String linha = sc.nextLine();

            if (linha.equals(".")) {
                break; // Finaliza a entrada quando o usuário digita '.'
            }

            strings.append(linha).append("\n");
        }

        // Solicite ao usuário a letra a ser removida
        System.out.print("Digite a letra a ser removida: ");
        char letraRemover = sc.nextLine().charAt(0);

        // Divida as strings em linhas
        String[] linhas = strings.toString().split("\n");

        // Remova a letra especificada de cada string
        for (int i = 0; i < linhas.length; i++) {
            String linha = linhas[i];
            linhas[i] = linha.replace(String.valueOf(letraRemover), "");
        }

        // Imprima as strings após a remoção
        System.out.println("\nStrings após a remoção da letra '" + letraRemover + "':");

        for (String linha : linhas) {
            System.out.println(linha);
        }

        sc.close();
    }
}
