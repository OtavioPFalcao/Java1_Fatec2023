public class Circulo extends Ponto {

	float raio;	
	
	public Circulo(float x, float y, float raio) {
		
		super(x,y);
		
		this.raio = raio;
		
	}
	
	public void impressao() {
		
		System.out.println("O raio é ==>  "  + raio);
		System.out.println("Parametro X é ==>  " + x);
		System.out.println("Parametro Y é ==>  " + y);
		
	}
	
	public float calc_area() {
		
		float pi = 3.1415f;
		float raio2 = raio * raio;
				
		float area = pi * raio2;
		
		return area;
		
	}
	
	public float calc_perimetro() {
		
		float pi = 3.1415f;
		
		float perimetro = 2 * pi * raio;
		
		return perimetro;
		
	
	}
	
	
	
	}
