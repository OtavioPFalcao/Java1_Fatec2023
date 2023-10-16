import java.util.Random;

public class Exercicio_7_Lista3 {
    public static void main(String[] args) {
        Random random = new Random();
        
        int conjunto = 20;
        int numero_por_conjunto = 20;

        for (int conjuntonum = 1; conjuntonum <= conjunto; conjuntonum++) {
            System.out.println("Conjunto " + conjuntonum + ":");

            for (int i = 0; i < numero_por_conjunto; i++) {
                int num = random.nextInt(50) + 1;
                System.out.print(num + " ");
            }
            System.out.println("\n");
        }
    }
}
