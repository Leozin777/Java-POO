public class Conta {
    double saldo;
    int agencia;
    int numero;
    String titular;

    public void depositar(double valor){
        this.saldo += valor;
    }
}
