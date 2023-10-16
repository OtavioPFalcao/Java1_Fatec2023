public class Exercicio_11_Lista3 {
    public static void main(String[] args) {
        int c = 0;
        for (int num = 1000; num <= 9999; num++) {
            int p1 = num / 100;
            int p2 = num % 100;

            int soma = (p1 + p2);
            int somaalgarismo = (soma * soma);

            if (somaalgarismo == num) {
                c += 1;
                System.out.println("\n" + c + "° Resultado = " +num);
            }
        }
    }
}
