import javax.swing.JOptionPane;
public class Retangulo {
	public int base, altura;
	public Retangulo(int b, int a) {
		base = b;
		altura = a;
	}
	public Retangulo() {
		String b = JOptionPane.showInputDialog("Digite a base");
		String a = JOptionPane.showInputDialog("Digite a altura");
		base = Integer.parseInt(b);
		altura = Integer.parseInt(a);	
	}
	public int retornaBase() {
		return base;
	}
	public int retornaAltura() {
		return altura;
	}
	public int calculaArea() {
		int area = base * altura;
		return area;
	}
	public void calculaArea(boolean imprime) {
		if (imprime)
			System.out.println("Área ==> " + base*altura);
	}
	
	public int calculaPerimetro() {
		int perimetro = (base + altura) * 2;
		return perimetro;
	}
}
