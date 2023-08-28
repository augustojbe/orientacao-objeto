package org.example;

public class ContaPoupanca extends Conta {


    public ContaPoupanca(String cliente) {
        super(cliente);
    }

    @Override
    public void imprimirEstrato() {
        System.out.println(" === Estrato Conta Poupança ===");
        super.imprimirInforComuns();

    }
}
