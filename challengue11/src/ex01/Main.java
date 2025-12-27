package ex01;

import java.util.Scanner;

public class Main {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        try {
            System.out.println("Digite o numero um: ");
            int numberOne = input.nextInt();

            System.out.println("Digite o numero dois: ");
            int numberTwo = input.nextInt();

            int calc = numberOne / numberTwo;

            System.out.println(calc);
        } catch (ArithmeticException e) {
            System.out.println("Informou 0 como divisor");
        }
    }
}