public class Suco extends Bebida {
    private String sabor;

    public Suco(String nome, double preco, String sabor) {
        super(nome, preco);
        this.sabor = sabor;
    }

    public void mostraBebida() {
        System.out.println("Nome: " + nome);
        System.out.println("Preço: " + preco);
        System.out.println("Sabor: " + sabor);
    }
}