public class animal {
    public String Nome, Tipo, Raca;

    public animal(String Nome, String Tipo, String Raca) {
        this.Nome = Nome;
        this.Tipo = Tipo;
        this.Raca = Raca;
    }

    public void imprimir() {
        System.out.println("Nome do animal: " + Nome);
        System.out.println("Tipo do animal: " + Tipo);
        System.out.println("Raça do animal: " + Raca);
    }
}
