package br.com.caio.challengue.models;

public class ContaBancaria {
    private int accountNumber;
    private int saldo;
    public String titular;

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public int getSaldo() {
        return saldo;
    }
}
