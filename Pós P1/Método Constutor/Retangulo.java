public class Retangulo {
    public int base, altura;

    public Retangulo(int b, int a) {
        base = b;
        altura = a;
    }

    public int retornaBase() {
        return base;
    }

    public int retornaAltura() {
        return altura;
    }

    public void calculaArea() {
        int area = base * altura;
        System.out.println("Valor da Área ==> " + area);
    }

    public void calculaPerimetro() {
        int perimetro = (base + altura) * 2;
        System.out.println("Valor do Perímetro ==> " + perimetro);
    }
}