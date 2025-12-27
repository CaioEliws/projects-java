package ex03;

import ex03.br.com.caio.challengue.execao.ErroConsultaGitHubException;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class Main {
    static void main(String[] args) throws IOException, InterruptedException {
        Scanner input = new Scanner(System.in);

        try {
            System.out.println("Digite o nome de usuario do perfil do github");
            String userInput = input.nextLine();

            String address = "https://api.github.com/users/" + userInput;

            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(address))
                    .build();

            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());

            if (response.statusCode() == 404) {
                throw new ErroConsultaGitHubException("Erro.");
            }

            System.out.println(response.body());
        } catch (ErroConsultaGitHubException e) {
            System.out.println("Nome de usuário não encontrado.");
        }
    }
}
