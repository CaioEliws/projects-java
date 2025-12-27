package ex03;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import ex03.br.caio.challengue.models.Veiculo;

import java.util.ArrayList;

public class Main {
    static void main(String[] args) {
        Veiculo nivus = new Veiculo("Nivus", "blue", 2024, 10900.00);
        Veiculo corsa = new Veiculo("Corsa", "Gray", 2012, 36000.00);

        Gson gson = new GsonBuilder()
                .setPrettyPrinting()
                .create();

        ArrayList<Veiculo> list = new ArrayList<>();
        list.add(nivus);
        list.add(corsa);

        System.out.println(gson.toJson(list));
    }
}
