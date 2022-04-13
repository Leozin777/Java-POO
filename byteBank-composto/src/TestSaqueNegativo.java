public class TestSaqueNegativo {
    public static void main(String[] args) {
        Conta conta = new Conta();

        conta.depositar(100);
        conta.saca(50);
        System.out.println(conta.getSaldo());
    }
}
