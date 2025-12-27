package br.com.caio.challengue.models;

public class Livro {
    private String title;
    private String author;

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String exibirDetalhes() {
        return """
            Detalhes do livro:
            Autor:\n """ + getAuthor() +
            """
            \nTítulo:\n """ + getTitle();
    }
}
