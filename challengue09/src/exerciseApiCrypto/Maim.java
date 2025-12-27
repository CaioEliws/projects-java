package exerciseApiCrypto;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class Maim {
    static void main(String[] args) throws IOException, InterruptedException {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite a crypto para fazer a busca: ");
        String searchCoin = input.nextLine();

        String address = "https://api.coingecko.com/api/v3/simple/price?vs_currencies=usd&ids=" + searchCoin + "&x_cg_demo_api_key=CG-tKhW6CmuhnNKgoLtpkybzV4x";

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(address))
                .build();
        HttpResponse<String> response = client
                .send(request, HttpResponse.BodyHandlers.ofString());

        System.out.println(response.body());
    }
}

//CHAVE API COIN GECKO: CG-tKhW6CmuhnNKgoLtpkybzV4x