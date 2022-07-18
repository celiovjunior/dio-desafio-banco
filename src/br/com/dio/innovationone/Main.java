package br.com.dio.innovationone;

public class Main {
    public static void main(String[] args) {
        IConta cc1 = new ContaCorrente();
        IConta cp1 = new ContaPoupanca();

        cc1.depositar(2500);
        cc1.transferir(1800, cp1);

        cp1.sacar(1100);

        cc1.imprimirExtrato();
        cp1.imprimirExtrato();

    }
}
