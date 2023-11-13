public class veiculo {
    public String Tipo, Marca;
    public int Ano;

    public veiculo(String Tipo, String Marca, int Ano) {
        this.Tipo = Tipo;
        this.Marca = Marca;
        this.Ano = Ano;
    }

    public int calculaIdade(int anoAtual) {
        return anoAtual - Ano;
    }
    
    public void imprimir() {
        System.out.println();
        System.out.println("Tipo do veículo: " + Tipo);
        System.out.println("Marca do veículo: " + Marca);
        System.out.println("Idade do veículo: " + calculaIdade(2023));
       
    }

}