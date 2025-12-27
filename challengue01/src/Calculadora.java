import java.util.Scanner;

public class Calculadora {
    int number;
    int finalNumber;

    void calcNumber () {
        System.out.println("Digite um numero: ");
        Scanner input = new Scanner(System.in);
        number = input.nextInt();

        finalNumber = number * 2;
        System.out.println("O resultado do número é: " + finalNumber);
    }
}
