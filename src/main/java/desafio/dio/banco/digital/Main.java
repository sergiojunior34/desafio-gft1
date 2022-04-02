package desafio.dio.banco.digital;

public class Main {
    public static void main(String[] args) {

        Cliente ryder = new Cliente();
        ryder.setNome("Ryder");

        Conta cc = new ContaCorrente(ryder);
        Conta poupanca = new ContaPoupanca(ryder);

        cc.depositar(100);
        cc.transferir(100,poupanca);

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();
    }
}
