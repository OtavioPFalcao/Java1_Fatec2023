import java.util.Random;

public class Gerador_numeros {
    public static void main(String[] args){
        Random gerador = new Random();

        int number_random = gerador.nextInt(101);
        System.out.println("Gerado ==>  " + number_random);
    }
}
