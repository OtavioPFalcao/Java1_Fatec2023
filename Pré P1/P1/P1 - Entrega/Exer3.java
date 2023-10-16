import java.util.Scanner;

public class Exer3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input;
        
        System.out.println("Digite as strings:");

        while (true) {
            input = scanner.nextLine().trim();

            int letras = 0;
            int consoantes = 0;
            int vogais = 0;
            int palavras = 1; 
            for (int i = 0; i < input.length(); i++) {
                char c = input.charAt(i);

                if (Character.isLetter(c)) {
                    letras++;

                    if ("AEIOUaeiou".contains(String.valueOf(c))) {
                        vogais++;
                    } else {
                        consoantes++;
                    }
                } else if (Character.isWhitespace(c)) {
                    palavras++;
                }
            }

            System.out.println("Resumo da String:");
            System.out.println("Quantidade de letras: " + letras);
            System.out.println("Quantidade de consoantes: " + consoantes);
            System.out.println("Quantidade de vogais: " + vogais);
            System.out.println("Número de palavras: " + palavras);
        }
    }
}
