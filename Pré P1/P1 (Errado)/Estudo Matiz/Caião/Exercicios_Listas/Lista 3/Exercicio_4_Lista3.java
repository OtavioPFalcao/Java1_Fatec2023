import java.util.Scanner;

public class Exercicio_4_Lista3 {
    public static void main(String[] args) {
        Scanner nota = new Scanner(System.in);
        float n1, n2;
        double media;
        int numero_alunos = 10;

        for (int i = 1; i <= numero_alunos; i++) {
            System.out.printf("Aluno %d: \n", i);

            System.out.print("Digite a 1° nota (N1) do aluno: ");
            n1 = nota.nextFloat();

            System.out.print("Digite a 2° nota (N2) nota do aluno: ");
            n2 = nota.nextFloat();

            media = (n1 + n2) / 2;

            System.out.print("----------------------------------------------------");
            System.out.printf("\nA média do aluno %d: %.2f%%\n", i ,media);
            System.out.print("----------------------------------------------------\n");
        }

        nota.close();

    }
}