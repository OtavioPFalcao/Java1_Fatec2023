import java.util.Scanner;

public class Main_Questão_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("\n\n");
        
        System.out.print("\nInsira o valor da base do retângulo 2: ");
        int base_ret2 = scanner.nextInt();

        System.out.print("\nInsira o valor da altura do retângulo 2: ");
        int altura_ret2 = scanner.nextInt();

        Retangulo ret = new Retangulo(base_ret2, altura_ret2);

        int area_ret1 = ret.calculaAreaRet1();
        int perimetro_ret1 = ret.calculaPerimetroRet1();

        int area_ret2 = ret.calculaAreaRet2();
        int perimetro_ret2 = ret.calculaPerimetroRet2();

        System.out.println("Valores do Retângulo 1:");
        System.out.println("Área ==> " + area_ret1);
        System.out.println("Perímetro ==> " + perimetro_ret1);

        System.out.println("Valores do Retângulo 2:");
        System.out.println("Área ==> " + area_ret2);
        System.out.println("Perímetro ==> " + perimetro_ret2);

        if (perimetro_ret1 > perimetro_ret2) {
            System.out.println("O Retângulo 1 tem o maior perímetro.");
        } else if (perimetro_ret2 > perimetro_ret1) {
            System.out.println("O Retângulo 2 tem o maior perímetro.");
        } else {
            System.out.println("Os retângulos têm o mesmo perímetro.");
        }

        if (area_ret1 > area_ret2) {
            System.out.println("O Retângulo 1 tem a maior área.");
        } else if (area_ret2 > area_ret1) {
            System.out.println("O Retângulo 2 tem a maior área.");
        } else {
            System.out.println("Os retângulos têm a mesma área.");
        }

        scanner.close();
    }
}