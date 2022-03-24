public class CriaConta {
    public static void main(String[] args) {
      Conta primeiraConta = new Conta();
      primeiraConta.saldo = 200;
      System.out.println(primeiraConta.saldo);

      primeiraConta.saldo += 100;
      System.out.println(primeiraConta.saldo);

      Conta segundaConta = primeiraConta;
      segundaConta.saldo = 50;

      primeiraConta.depositar(100);
      System.out.println("o saldo da primeira referência é " + primeiraConta.saldo);
      System.out.println("o saldo da segunda referência é " + segundaConta.saldo);

      System.out.println(primeiraConta);


    }
}
