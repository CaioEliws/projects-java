package example01;

import java.io.FileWriter;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static void main(String[] args) throws IOException, InterruptedException {
        Scanner input = new Scanner(System.in);

        FileWriter writer = new FileWriter("cep.json");
        ArrayList<String> list = new ArrayList<>();

        while (true) {
            System.out.println("Digite o seu CEP para busca ou 0 para sair: ");
            int busca = input.nextInt();

            if (busca == 0) {
                break;
            }

            String address = "http://viacep.com.br/ws/" + busca + "/json/";

            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(address))
                    .build();

            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());

            list.add(response.body());
            System.out.println("Endereço CEP adicionado na lista!");
        }

        writer.write(list.toString());
        writer.close();
    }
}