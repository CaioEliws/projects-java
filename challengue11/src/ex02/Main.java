package ex02;

import ex02.br.com.caio.execao.SenhaInvalidaException;

import java.util.Scanner;

public class Main {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        try {
            System.out.println("Digite a senha do user: ");
            String password = input.nextLine();
            System.out.println("Sua senha é: " + password);

            if (password.length() < 8) {
                throw new SenhaInvalidaException(
                        "Senha inválida, deve conter 8 caracters..."
                );
            }

        } catch (SenhaInvalidaException e) {
            System.out.println("Não atendeu todos os critérios, necessita de 8 caracteres.");
        }
    }
}
