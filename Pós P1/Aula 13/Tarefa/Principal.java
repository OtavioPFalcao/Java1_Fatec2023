import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Refrigerante[] refrigerantes = new Refrigerante[3];
        Suco[] sucos = new Suco[3];
        Vinho[] vinhos = new Vinho[3];

        for (int i = 0; i < 3; i++) {
            System.out.println("Cadastro de Bebida " + (i + 1));
            System.out.print("Nome: ");
            String nome = scanner.nextLine();
            System.out.print("Preço: ");
            double preco = scanner.nextDouble();
            scanner.nextLine(); // Consumir a nova linha

            System.out.print("Tipo de bebida (1 - Refrigerante, 2 - Suco, 3 - Vinho): ");
            int tipo = scanner.nextInt();
            scanner.nextLine(); // Consumir a nova linha

            switch (tipo) {
                case 1:
                    System.out.print("Retornável (true/false): ");
                    boolean retornavel = scanner.nextBoolean();
                    refrigerantes[i] = new Refrigerante(nome, preco, retornavel);
                    break;
                case 2:
                    System.out.print("Sabor: ");
                    String sabor = scanner.nextLine();
                    sucos[i] = new Suco(nome, preco, sabor);
                    break;
                case 3:
                    System.out.print("Safra: ");
                    int safra = scanner.nextInt();
                    vinhos[i] = new Vinho(nome, preco, safra);
                    break;
                default:
                    System.out.println("Tipo de bebida inválido.");
                    i--; // Repetir o cadastro
                    break;
            }
        }

        System.out.println("Imprimindo Bebidas:");
        for (int i = 0; i < 3; i++) {
            System.out.println("Bebida " + (i + 1));
            if (refrigerantes[i] != null) {
                refrigerantes[i].mostraBebida();
            } else if (sucos[i] != null) {
                sucos[i].mostraBebida();
            } else if (vinhos[i] != null) {
                vinhos[i].mostraBebida();
            }
        }

        scanner.close();
    }
}