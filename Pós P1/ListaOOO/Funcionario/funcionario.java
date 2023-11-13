public class funcionario {
    private String nome, funcao;
    private float salario;

    public funcionario(String nome, String funcao, float salario) {
        this.nome = nome;
        this.funcao = funcao;
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public String getFuncao() {
        return funcao;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public void aumentarSalario(float percentual) {
        salario *= (1 + percentual / 100);
    }
    
}
