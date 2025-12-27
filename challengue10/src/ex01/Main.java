package ex01;

import ex01.br.com.caio.challengue.models.Pessoa;
import ex01.br.com.caio.challengue.models.PessoaOmdb;
import com.google.gson.Gson;

public class Main {
    static void main(String[] args) {
        String json = """
        {
            "name": "Caio",
            "year": 20,
            "city": "Indaiatuba"
        }
        """;

        Gson gson = new Gson();

        PessoaOmdb pessoaOmdb = gson.fromJson(json, PessoaOmdb.class);

        Pessoa pessoa = new Pessoa(pessoaOmdb.name(), pessoaOmdb.year(), pessoaOmdb.city());

        System.out.println(pessoa);
    }
}