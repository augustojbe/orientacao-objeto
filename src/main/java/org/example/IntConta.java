package org.example;

public interface IntConta {

     void sacar(double valor);

     void depositar (double valor);

    void transferir(double valor, Conta contaDestino);

    void imprimirEstrato();

}
