public class TestaValores {
    public static void main(String[] args) {
        Conta conta = new Conta(2001, 1337);
        Conta conta2 = new Conta(2001, 1337);
        Conta conta3 = new Conta(2001, 1337);
        Conta conta4 = new Conta(2001, 1337);

        System.out.println(Conta.getTotal());


    }
}
