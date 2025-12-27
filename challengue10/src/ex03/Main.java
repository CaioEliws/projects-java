package ex03;

import com.google.gson.Gson;
import ex03.br.com.caio.challengue.models.Livro;
import ex03.br.com.caio.challengue.models.LivroOmdb;

public class Main {
    static void main(String[] args) {
        String json = """
        {
            "title": "O pessimo mundo de caio",
            "author": caio,
            "editor": "caioEditor"
        }
        """;

        Gson gson = new Gson();

        LivroOmdb livroOmdb = gson.fromJson(json, LivroOmdb.class);

        Livro livro = new Livro(livroOmdb.title(), livroOmdb.author(), livroOmdb.editor());

        System.out.println(livro);
    }
}
