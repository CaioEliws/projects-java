import java.util.Scanner;

public class LoopWhile {
    public static void main(String[] args) {
        String name = "Caio Elias Vieira";
        String typeOfAccount = "Corrente";
        int wallet = 5000;

        System.out.println(String.format("""
        ***********************
        Dados iniciais do cliente:
        
        Nome do cliente: %s
        Tipo de conta: %s
        Saldo inicial: R$ %s
        ***********************
        """, name, typeOfAccount, wallet));

        Scanner input = new Scanner(System.in);
        int option = 0;
        int addValue = 0;
        int removeValue = 0;
        int soma = 0;
        int sub = 0;

        while (option != 4) {
            System.out.println("""
                    Digite uma opção de operação: 
                    
                    1- Consultar saldo
                    2- Receber Valor
                    3- Transferir valor
                    4- Sair
                    """);
            option = input.nextInt();

            if (option == 1) {
                System.out.println("O valor do seu saldo é de: " + wallet);
            }

            if (option == 2) {
                System.out.println("Digite o valor desejado para receber: ");
                 addValue = input.nextInt();

                 soma = addValue + wallet;
                 wallet = soma;
                System.out.println("Novo saldo: R$ " + wallet);
            }

            if (option == 3) {
                System.out.println("Digite o valor desejado para transferir: ");
                removeValue = input.nextInt();

                sub = wallet - removeValue;
                wallet = sub;
                System.out.println("Novo saldo: R$ " + wallet);
            }

            if (option > 4) {
                System.out.println("Error 404, Digite uma opção valida!!!");
            }
        }
    }
}
