package br.edu.fescfafic.contabancaria.Main;
import br.edu.fescfafic.contabancaria.Model.*;
import java.util.Locale;
public class Main {
    public static void main(String[] args) {
        ContaCorrente contaCorrente1 = new ContaCorrente(
                "1234",
                100.00,
                "Maria");

        ContaCorrente contaCorrente2 = new ContaCorrente(
                "456",
                200.00,
                "José");

        ContaPoupanca contaPoupanca1 = new ContaPoupanca(
                "789",
                300.00,
                "Davi");

        ContaPoupanca contaPoupanca2 = new ContaPoupanca(
                "444",
                50.00,
                "Yara");

        System.out.println(contaPoupanca1.toString());

       contaPoupanca1.depositar(50);

       contaCorrente1.retirar(50);

    }
}