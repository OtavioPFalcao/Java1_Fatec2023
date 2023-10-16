// Feito por Caio Mizohata, Big Data 2° Termo

import java.util.Scanner;

public class Exercicio_4 {
    public static void main(String[] args) {

        Scanner num = new Scanner(System.in);

        int d, h, m, s, totalSeg;
        
        
        System.out.print("\n----------------------");
        System.out.print("\nTotal de Dias: ");
        d = num.nextInt();
    
        System.out.print("Total de Horas: ");
        h = num.nextInt();

        System.out.print("Total de Minutos: ");
        m = num.nextInt();

        System.out.print("Total de Segundos: ");
        s = num.nextInt();

        System.out.print("\n-------------------------------------------------------");
        totalSeg = (d*24*60*60) + (h*60*60) + (m*60 + s);
        System.out.println("\nO total de segundos foi: "+totalSeg+" Segundos");
        System.out.print("-------------------------------------------------------");
        
        num.close();

    }
}