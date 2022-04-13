public class CriaConta {
    public static void main(String[] args) {
      Conta primeiraConta = new Conta();

      //primeiraConta.saldo = 100;
      primeiraConta.depositar(100);
      primeiraConta.saca(100);
      //System.out.println("o saldo da primeira referência é " + primeiraConta.saldo);

    }
}
