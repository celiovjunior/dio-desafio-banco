package br.com.dio.innovationone;

public class ContaPoupanca extends Conta {
    @Override
    public void imprimirExtrato() {
        System.out.println("EXTRATO CONTA POUPANCA");
        super.infosComuns();
    }
}
