import java.util.Scanner;

public class principal {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int opcao;
        String nome, numero;

        // Primeira parte do menu
        System.out.println("Conta Corrente");
        System.out.println("1 - Depósito");
        System.out.println("2 - Retirada");
        System.out.println("3 - Consulta Saldo");
        System.out.println("4 - Finalizar");

        System.out.print("Opção: ");
        opcao = entrada.nextInt();

        // Opção para finalizar o programa, pois no switch não funciona
        if (opcao == 4) {
            System.out.println("\nPrograma finalizado");
            System.exit(0);
        }

        System.out.print("Digite o nome do titular da conta: ");
        nome = entrada.next();

        System.out.print("Digite o número da conta: ");
        numero = entrada.next();

        System.out.print("\n********************************************");
        System.out.println("\nSeja Bem-Vindo(a) " +nome + "\n");

        conta cliente = new conta(nome, numero);

        while (opcao != 4) {
            switch (opcao) {
                case 1:
                    System.out.print("Digite o valor a ser depositado: ");
                    float valorDeposito = entrada.nextFloat();
                    if (cliente.depositar(valorDeposito)) {
                        System.out.println("\nDepósito de " + valorDeposito + " R$" + " realizado com sucesso.");
                    } else {
                        System.out.println("\nErro, valor de depósito inválido");
                    }
                    break;

                case 2:
                    System.out.print("Digite o valor a ser retirado: ");
                    float valorRetirada = entrada.nextFloat();
                    if (cliente.retirar(valorRetirada)) {
                        System.out.println("\nSaque de " + valorRetirada + " R$" + " realizado com sucesso.");
                    } else {
                        System.out.println("\nErro, valor de saque inválido ou saldo insuficiente na conta.");
                    }
                    break;

                case 3:
                    System.out.println("\nSaldo atual da conta: " + cliente.consulta_Saldo() + " R$");
                    break;

            // caso se a opção for inválida
                default:
                    System.out.println("\nOpção inválida. Tente novamente.");
            }

    // Retorna o menu novamente ao usuário para que ele possa realizar uma nova operação do menu
            System.out.println("\nConta Corrente");
            System.out.println("1 - Depósito");
            System.out.println("2 - Retirada");
            System.out.println("3 - Consulta Saldo");
            System.out.println("4 - Finalizar");
            System.out.print("Opção: ");
            opcao = entrada.nextInt();
        }

        System.out.println("\nPrograma finalizado");
        entrada.close();
    }
}
