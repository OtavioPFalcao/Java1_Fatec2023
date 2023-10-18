import java.util.Scanner;

public class Teste {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Insira algo (ou fim para sair):  ");
            String var = scanner.nextLine();

            if (var.equals("fim") || var.equals("ooo") || var.equals("FIM") || var.equals("Fim")) {
                break;
            }
            
            System.out.println("Sua resposta foi ( " + var + " ) ?");

        }

        scanner.close();
    }
}
