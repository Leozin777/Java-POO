public class test{
    public static void main(String[] args) {
        Cliente paulo = new Cliente();
        paulo.nome = "Paulo";
        paulo.cpf = "222.222.222-22";
        paulo.profissao = "programador";

        Conta contaDoPaulo = new Conta();
        contaDoPaulo.depositar(100);

        contaDoPaulo.titular = paulo;
        System.out.println(contaDoPaulo.titular.nome);
    }
}
