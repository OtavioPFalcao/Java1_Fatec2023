import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Nome do atleta: ");
        String nome = entrada.nextLine();

        System.out.print("Sexo do atleta: ");
        String sexo = entrada.nextLine();

        System.out.print("Peso do atleta: ");
        float peso = entrada.nextFloat();

        System.out.print("Altura do atleta: ");
        float altura = entrada.nextFloat();

        atleta dadosAtleta = new atleta(nome, sexo, peso, altura);

        dadosAtleta.imprimir();
        dadosAtleta.calcularIMC();
        
        entrada.close();

    }
}
