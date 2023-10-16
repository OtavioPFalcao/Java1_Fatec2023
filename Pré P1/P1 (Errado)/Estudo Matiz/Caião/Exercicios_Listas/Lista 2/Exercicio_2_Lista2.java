import java.util.Scanner;

public class Exercicio_2_Lista2 {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);

        int placa, finalplaca;

        System.out.print("Digite a placa do carro: ");
        placa = num.nextInt();

        System.out.print("Digite o último número da placa: ");
        finalplaca = num.nextInt();

        System.out.print("Placa: " +placa);

        if ((finalplaca == 1) || (finalplaca == 2)) {
            System.out.print("\nSegunda-Feira");
        }
        
        if ((finalplaca == 3) || (finalplaca == 4)) {
              System.out.print("\nTerça-Feira");
        }
          
        if ((finalplaca == 5) || (finalplaca == 6)) {
            System.out.print("\nQuarta-Feira");
        }

        if ((finalplaca == 7) || (finalplaca == 8)) {
            System.out.print("\nQuinta-Feira");
        }
        
        if ((finalplaca == 9) || (finalplaca == 0)) {
            System.out.print("\nSexta-Feira");
        }
    
        num.close();
    
    }
}