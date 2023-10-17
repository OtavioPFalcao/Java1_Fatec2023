import java.util.Scanner;

public class Exer3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Digite uma string:   ");
            String input = scanner.nextLine();


            if (input.equals("fim")) {
                break; // Encerra o loop se a entrada for "fim".
            }

            int letras = 0;
            int consoantes = 0;
            int vogais = 0;
            int palavras = 0;

            boolean dentroDaPalavra = false;

            for (char c : input.toCharArray()) {
                if (Character.isLetter(c)) {
                    letras++;
                    if ("aeiou".contains(String.valueOf(c))) {
                        vogais++;
                    } else {
                        consoantes++;
                    }

                    if (!dentroDaPalavra) {
                        dentroDaPalavra = true;
                        palavras++;
                    }
                } else {
                    dentroDaPalavra = false;
                }
            }

            System.out.println("Resumo da string:");
            System.out.println("Quantidade de letras: " + letras);
            System.out.println("Quantidade de consoantes: " + consoantes);
            System.out.println("Quantidade de vogais: " + vogais);
            System.out.println("Número de palavras: " + palavras);
        }

        scanner.close();
    }
}