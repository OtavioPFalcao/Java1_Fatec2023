public class conta {
    public String Nome;
    public String Numero;
    public float Saldo;

    public conta(String nome, String numero) {
        this.Nome = nome;
        this.Numero = numero;
        this.Saldo = 1000.0f;
    }

    public boolean depositar(float valorDeposito) {
        if (valorDeposito > 0) {
            Saldo += valorDeposito;
            return true;
        } else {
            return false;
        }
    }

    public boolean retirar(float valorRetirar) {
        if (valorRetirar > 0 && Saldo >= valorRetirar) {
            Saldo -= valorRetirar;
            return true;
        } else {
            return false;
        }
    
    }

    public float consulta_Saldo() {
        return Saldo;
    }
    
}
