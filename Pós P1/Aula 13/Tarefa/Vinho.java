public class Vinho extends Bebida {
    private int safra;

    public Vinho(String nome, double preco, int safra) {
        super(nome, preco);
        this.safra = safra;
    }

    public void mostraBebida() {
        System.out.println("Nome: " + nome);
        System.out.println("Preço: " + preco);
        System.out.println("Safra: " + safra);
    }
}