import java.util.Scanner;

public class Exercicio_3_Lista3 {
    public static void main(String[] args) {
        Scanner name = new Scanner(System.in);
        String nome;
        int c;

        System.out.print("Digite o seu nome: ");
        nome = name.nextLine();

        for (int i = 1; i <= 10; i++) {
            c = i + 0;
            System.out.println(+c+ "° " +nome);
        }
        name.close();
    }
}