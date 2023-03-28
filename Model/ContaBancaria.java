package br.edu.fescfafic.contabancaria.Model;

public abstract class ContaBancaria {
    public String conta;

    public String titular;

    public double saldo;

    public ContaBancaria(String conta, double saldo, String titular) {
        this.conta = conta;
        this.titular = titular;
        this.saldo = saldo;
    }

    public void depositar(double valor) {
        this.saldo += valor;
        System.out.printf("conta: %s\n" +
                "valor depositado: %.2f\n" +
                "novo saldo: %.2f\n", conta, valor, saldo);


    }

    public String retirar(double valor) {
        if (saldo < valor) {
            System.out.println("Saldo insuficiente!");
        } else {
            this.saldo -= valor;
            System.out.printf("conta: %s\n" +
                    "valor retirado: %.2f\n" +
                    "novo saldo: %.2f\n", conta, valor, saldo);
        }
        return null;
    }

}
