public class Cilindro extends Circulo {

	float area_base;	
	float altura;
	
	public Cilindro(float x, float y, float raio, float area_base, float altura) {
		
		super(x,y,raio);
		
		this.area_base = area_base;
		
		this.altura = altura;
		
	}
	
	public void impressao() {
		
		System.out.println("O Área da Base é ==>  "  + area_base);
		System.out.println("O Altura é ==>  "  + altura);
		System.out.println("O Raio é ==>  "  + raio);
		System.out.println("Parametro X é ==>  " + x);
		System.out.println("Parametro Y é ==>  " + y);
		
	}
	
	public float area() {
		
		float area_lateral = 2 * 3.1415f * raio * altura;
		
		float area = 2 * area_base + area_lateral;
		
		return area;
	}
	
	public float volume() {
		
		float volume = area * altura;
		
		return volume;
		
	}
	
	
	}
