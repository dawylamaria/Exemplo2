package br.edu.fescfafic.contabancaria.Model;

public class ContaCorrente extends ContaBancaria {
    public ContaCorrente(String conta, double saldo, String titular) {
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
        return "Conta corrente{" +
                "conta='" + conta + '\'' +
                "saldo='" + saldo + '\'' +
                "titular='" + titular + '\'' +
                '}';
    }

}


