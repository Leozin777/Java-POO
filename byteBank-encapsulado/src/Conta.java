public class Conta {
    private double saldo;
    private int agencia;
    private int numero;
    private Cliente titular;
    private static int total;

    public Conta(int agencia, int numero){
        Conta.total++;
        this.numero = numero;
        this.agencia = agencia;
        System.out.println(Conta.total);
        System.out.println("A conta foi criada e o seu número é " + getNumero() + " e a agencia é " + getAgencia());
    }

    public void depositar(double valor){
        this.saldo += valor;
    }

    public boolean saca(double valor){
        if(this.saldo >= valor){
            this.saldo -= valor;
            return true;
        }
        return false;
    }

    public boolean transfere(double valor, Conta destino){
        if(this.saldo >= valor){
            this.saldo -= valor;
            depositar(valor);
            return true;
        }
        return false;
    }

    public double getSaldo(){
        return this.saldo;
    }

    public int getNumero(){return this.numero;}

    public int getAgencia(){return this.agencia;}

    public Cliente getTitular() {return this.titular;}

    public void setTitular(Cliente titular) {this.titular = titular;}

    public static int getTotal() {return Conta.total;}
}
