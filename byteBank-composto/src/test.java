public class test{
    public static void main(String[] args) {
        Cliente paulo = new Cliente();
        paulo.nome = "Paulo";
        paulo.cpf = "489.848.312-89";
        paulo.profissao = "programador";

        Conta contaDoPaulo = new Conta();
        contaDoPaulo.depositar(100);

        //Associa CLiente com Conta
        contaDoPaulo.titular = paulo;

        System.out.println(contaDoPaulo.titular.nome);
    }
}
