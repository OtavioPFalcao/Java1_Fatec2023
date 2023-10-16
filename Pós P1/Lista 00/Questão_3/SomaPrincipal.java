import java.util.Scanner;
public class SomaPrincipal {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		float valor;
		Media m = new Media();
		do {
			System.out.println("Digite um número => ");
			valor = leia.nextFloat();
			if (valor != 0)
			    m.Acrescenta(valor);
		} while (valor != 0);
		System.out.println("Média => " + m.MediaAtual());
	}

}
