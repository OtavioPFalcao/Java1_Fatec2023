import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Informe o tipo de veículo: ");
        String tipo = entrada.nextLine();

        System.out.print("Qual a marca do veículo?: ");
        String marca = entrada.nextLine();

        System.out.print("Em que ano o veículo foi fabricado?: ");
        int ano = entrada.nextInt();

        veiculo Veiculo = new veiculo(tipo, marca, ano);

        Veiculo.imprimir();
        Veiculo.calculaIdade(ano);
        entrada.close();
    }
}
