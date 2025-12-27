package ex02;

import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import ex02.br.com.caio.challengue.models.Titulo;

public class Main {
    static void main(String[] args) {
        Titulo adventuresCaio = new Titulo("Aventuras de Caio", "Caio Elias", "EditorCaio");

        Gson gson = new GsonBuilder()
                .setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE)
                .setPrettyPrinting()
                .create();

        System.out.println("Arquivo JSON: " + gson.toJson(adventuresCaio));

    }
}
