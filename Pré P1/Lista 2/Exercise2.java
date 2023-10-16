import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite os números da placa do seu veículo:");
        int numeroPlaca = sc.nextInt();
        
        int ultimoDigito = numeroPlaca % 10;

        switch (ultimoDigito) {
            case 1:
            case 2:
                System.out.println("O rodízio é na segunda-feira.");
                break;
            case 3:
            case 4:
                System.out.println("O rodízio é na terça-feira.");
                break;
            case 5:
            case 6:
                System.out.println("O rodízio é na quarta-feira.");
                break;
            case 7:
            case 8:
                System.out.println("O rodízio é na quinta-feira.");
                break;
            case 9:
            case 0:
                System.out.println("O rodízio é na sexta-feira.");
                break;
            default:
                System.out.println("Número de placa inválido.");
        }

        sc.close();
    }
}
