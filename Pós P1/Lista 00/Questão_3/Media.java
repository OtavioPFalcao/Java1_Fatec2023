
public class Media {
	float soma, contador;
	public Media() {
		soma = 0.0f;
		contador = 0.0f;
	}
	public void Acrescenta(float valor) {
		soma += valor;
		contador++;
	}
	public float MediaAtual() {
		return soma / contador;
	}
}
