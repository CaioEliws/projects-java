package example02;

import java.io.IOException;
import java.util.Scanner;

public class Principal {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ConsultaCEP consulta = new ConsultaCEP();

        System.out.println("Digite um número de CEP para consulta: ");
        var cep = input.nextLine();

        try {
            Endereco novoEndereco = consulta.buscaEndereco(cep);
            System.out.println(novoEndereco);

            GeradorDeArquivo gerador = new GeradorDeArquivo();
            gerador.salvaJSON(novoEndereco);
        } catch (RuntimeException | IOException e) {
            System.out.println(e.getMessage());
            System.out.println("Finalizando a aplicação");
        }
    }
}
