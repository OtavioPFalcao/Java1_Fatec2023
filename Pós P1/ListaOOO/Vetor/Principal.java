public class Principal {
    public static void main(String[] args) {

        vetor Vetor = new vetor(10);

        System.out.print("\nVetor Ordenado: ");
        Vetor.Ordenar();

        System.out.println("\nMaior elemento: " + "[" + Vetor.acharMaior() + "]");

        System.out.print("Menor elemento: " + "[" + Vetor.acharMenor() + "]");

        int elementoNoVetor = 24;
        int elementoPosicao = Vetor.procurarElemento(elementoNoVetor);
        if (elementoPosicao != -1) {
            System.out.print("\nO elemento " + elementoNoVetor + " foi encontrado");
        } else {
            System.out.println("\nO elemento " + elementoNoVetor + " não foi encontrado.");
        
        }
    }
}
