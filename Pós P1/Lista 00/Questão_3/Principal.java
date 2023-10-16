public class Principal {

	public static void main(String[] args) {
		Retangulo ret1 = new Retangulo(6,5);
		Retangulo ret2= new Retangulo();
		
		System.out.println("Base => " + ret1.retornaBase());
		System.out.println("Altura => " + ret1.retornaAltura());
		System.out.println("Base => " + ret2.retornaBase());
		System.out.println("Altura => " + ret2.retornaAltura());
		
		System.out.println("Área de ret1 => "+ ret1.calculaArea());
		System.out.println("Perímetro de ret1 => "+ ret1.calculaPerimetro());
		System.out.println("Área de ret2 => "+ ret2.calculaArea());
		System.out.println("Perímetro de ret2 => "+ ret2.calculaPerimetro());
	}

}
