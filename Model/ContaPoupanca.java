package br.edu.fescfafic.contabancaria.Model;

public class ContaPoupanca extends ContaBancaria {
    public ContaPoupanca(String conta, double saldo, String titular) {
        super(conta, saldo, titular);
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    @Override
    public String toString() {
        return "conta poupanca{" +
                "conta='" + conta + '\'' +
                "saldo='" + saldo + '\'' +
                "titular='" + titular + '\'' +
                '}';
    }
}
