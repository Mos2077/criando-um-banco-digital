public class Main {

    public static void main(String[] args) {
        Cliente matheus = new Cliente();
         matheus.setNome("Matheus");

        Conta cc = new ContaCorrente(matheus);
        Conta poupanca = new ContaPoupanca(matheus);

        cc.depositar(100);
        cc.transferir(100, poupanca);

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();
    }

}