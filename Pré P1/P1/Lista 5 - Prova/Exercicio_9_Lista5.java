public class Exercicio_9_Lista5 {
    public static void main(String[] args) {
        int matriz[][] = new int[10][10];

        System.out.println("\nMatriz Quadrada (10x10) Gerada: \n");
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                matriz[i][j] = i * 10 + j + 1;
                System.out.print(String.format("[%2d] ", matriz[i][j]));
            }
            System.out.println();
        }

        System.out.print("\n-------------------------------------------------");
        System.out.println("\nMatriz Quadrada (10x10) Com As Diagonais Trocadas\n");

        for (int i = 0; i < 10; i++) {
            int matrizdiagonal = matriz[i][i];
            matriz[i][i] = matriz[i][10 - 1 - i];
            matriz[i][10 - 1 - i] = matrizdiagonal;
        }
        
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(String.format("[%2d] ", matriz[i][j]));
            }
            System.out.println();
        }
    }
}
