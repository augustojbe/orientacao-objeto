package org.example;

public class Main {
    public static void main(String[] args) {

        Cliente augusto = new Cliente();
        augusto.setNome("Augusto Alves");

        Cliente nice = new Cliente();
        nice.setNome("Nice Holanda");


        Conta cCorrante = new ContaCorrente("augusto");
        cCorrante.depositar(100);

        Conta cPupanca = new ContaPoupanca("nice");

        cCorrante.transferir(50, cPupanca);

        cCorrante.imprimirEstrato();
        cPupanca.imprimirEstrato();
    }
}