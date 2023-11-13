import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Informe o nome do funcionário: ");
        String nome = entrada.nextLine();
        System.out.print("Informe a função do funcionário: ");
        String funcao = entrada.nextLine();
        System.out.print("Informe o salário do funcionário: ");
        float salario = entrada.nextFloat();

        funcionario Funcionario = new funcionario(nome, funcao, salario);
        char op;

        do {
            System.out.println("\nMenu:");
            System.out.println("1 - Imprimir dados do funcionário");
            System.out.println("2 - Alterar o salário com um novo valor");
            System.out.println("3 - Alterar o salário com um percentual");
            System.out.println("4 - Sair");
            System.out.print("Escolha uma das opção: ");
            op = entrada.next().charAt(0);

            switch (op) {
                case '1':
                    System.out.println("-----------------------");
                    System.out.println("Nome: " + Funcionario.getNome());
                    System.out.println("Função: " + Funcionario.getFuncao());
                    System.out.println("Salário: " + Funcionario.getSalario() + " R$");
                    System.out.println("-----------------------");
                    break;

                case '2':
                    System.out.print("Informe o novo valor do salário: ");
                    float SalarioNovo = entrada.nextFloat();
                    Funcionario.setSalario(SalarioNovo);
                    System.out.println("\n--------------------------------------");
                    System.out.println("Novo salário atualizado com sucesso.");
                    System.out.println("---------------------------------------");
                    break;

                case '3':
                    System.out.print("Informe o novo percentual de aumento do salário: ");
                    float SalarioPercentual = entrada.nextFloat();
                    Funcionario.aumentarSalario(SalarioPercentual);
                    System.out.println();
                    System.out.println("-----------------------------------------------------");
                    System.out.println("Novo percentual de aumento acrescentado com sucesso");
                    System.out.println("-----------------------------------------------------");
                    break;

                case '4':
                   System.out.print("Programa Encerrado");
                    break;
                    
                default:
                    System.out.println("\nOpção inválida!");
            }

        } while (op != '4');


        entrada.close();
    }
}