public class atleta {
    public String Nome, Sexo;
    public float Peso, Altura;

    public atleta(String Nome, String Sexo, float Peso, float Altura) {
        this.Nome = Nome;
        this.Sexo = Sexo;
        this.Peso = Peso;
        this.Altura = Altura;
    }

    public float calcularIMC() {
        float IMC = Peso / (Altura * Altura);

        if (IMC <= 17) {
            System.out.println("IMC: " + IMC + " (Muito abaixo do peso)");
        } else if (IMC > 17 && IMC <= 18.49) {
            System.out.println("IMC " + IMC + " (Abaixo do peso)");
        } else if (IMC > 18.5 && IMC <= 24.99) {
            System.out.println("IMC: " + IMC + " (Peso Normal)");
        } else if (IMC > 25 && IMC <= 29.99) {
            System.out.println("IMC: " + IMC + " (Acima do peso)");
        } else if (IMC > 30 && IMC <= 34.99) {
            System.out.println("IMC: " + IMC + " (Obesidade I)");
        } else if (IMC > 35 && IMC <= 39.99) {
            System.out.println("IMC: " + IMC + " (Obesidade II)");
        } else if (IMC > 40) {
            System.out.println("IMC: " + IMC + " (Obesidade III (Mórbida)");
        }

        return IMC;
    }

    public void imprimir() {
        System.out.println();
        System.out.println("Nome: "+ Nome);
        System.out.println("Sexo: "+ Sexo);
        System.out.println("Peso: "+ Peso + " Kg");
        System.out.println("Altura: "+ Altura + " metros");
        
    }
}