public class Quadrado extends Ponto {

	float lado;
	
	
	public QUadrado(float x, float y, float lado) {
		
		super(x,y);
		
		this.lado = lado;
		
	}
	
	public void impressao() {
		
		System.out.println("O lado é ==>  "  + lado);
		System.out.println("Parametro X é ==>  " + x);
		System.out.println("Parametro Y é ==>  " + y);
		
	}
	
	public float calc_area() {
		
		float area = lado * lado;
		
		return area;
		
	}
	
	public float calc_perimetro() {
		
		float perimetro = lado * 4;
		
		return perimetro;
		
	}
	
	
	}