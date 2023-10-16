public class Retangulo {
    private int base_ret1, altura_ret1;
    private int base_ret2, altura_ret2;

    public Retangulo(int b, int a) {
        base_ret2 = b;
        altura_ret2 = a;
    }

    public int retornaBaseRet1() {
        return base_ret1;
    }

    public int retornaAlturaRet1() {
        return altura_ret1;
    }

    public int retornaBaseRet2() {
        return base_ret2;
    }

    public int retornaAlturaRet2() {
        return altura_ret2;
    }

    public int calculaAreaRet1() {
        base_ret1 = 6;
        altura_ret1 = 4;
        int area_ret1 = base_ret1 * altura_ret1;
        return area_ret1;
    }

    public int calculaAreaRet2() {
        int area_ret2 = base_ret2 * altura_ret2;
        return area_ret2;
    }

    public int calculaPerimetroRet1() {
        int perimetro_ret1 = (base_ret1 + altura_ret1) * 2;
        return perimetro_ret1;
    }

    public int calculaPerimetroRet2() {
        int perimetro_ret2 = (base_ret2 + altura_ret2) * 2;
        return perimetro_ret2;
    }
}