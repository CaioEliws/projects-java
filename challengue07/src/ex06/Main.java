package ex06;

import ex06.br.com.caio.challengue.models.ContaBancaria;

import java.util.ArrayList;

public class Main {
    static void main(String[] args) {
        ContaBancaria conta1 = new ContaBancaria(172,180000);
        ContaBancaria conta2 = new ContaBancaria(845,16709);
        ContaBancaria conta3 = new ContaBancaria(967,2546722);

        ArrayList<ContaBancaria> listAccounts = new ArrayList<>();
        listAccounts.add(conta1);
        listAccounts.add(conta2);
        listAccounts.add(conta3);

        ContaBancaria contaMaiorSaldo = listAccounts.get(0);

        for (ContaBancaria conta : listAccounts) {
            if (conta.getBalance() > contaMaiorSaldo.getBalance()) {
                contaMaiorSaldo = conta;
            }
        }

        System.out.println("Numero da conta com maior saldo: " + contaMaiorSaldo.getAccountNumber());
        System.out.println("Saldo: " + contaMaiorSaldo.getBalance());
    }
}
