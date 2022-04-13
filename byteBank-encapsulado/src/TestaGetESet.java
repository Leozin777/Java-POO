public class TestaGetESet {
    public static void main(String[] args) {
        Conta conta = new Conta(2001,1337);
        //conta.numero = 1337
        System.out.println(conta.getNumero());

        Cliente paulo = new Cliente();

        paulo.setNome("paulo");

        conta.setTitular(paulo);

        System.out.println(conta.getTitular().getNome());

        conta.getTitular().setProfissao("programador");
        //agora em duas linhas
        Cliente titularDaConta = conta.getTitular();
        titularDaConta.setProfissao("programador");
    }
}
