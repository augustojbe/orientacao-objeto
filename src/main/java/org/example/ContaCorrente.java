package org.example;

public class ContaCorrente extends Conta {

    public ContaCorrente(String cliente){
        super(cliente);

    }


    @Override
    public void imprimirEstrato() {
        System.out.println(" === Estrato Conta Corrente ===");
        super.imprimirInforComuns();
    }


}
