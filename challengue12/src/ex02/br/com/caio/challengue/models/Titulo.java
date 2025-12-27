package ex02.br.com.caio.challengue.models;

public class Titulo {
    private String title;
    private String author;
    private String edithor;

    public Titulo(String title, String author, String edithor) {
        this.title = title;
        this.author = author;
        this.edithor = edithor;
    }

    @Override
    public String toString() {
        return
                "(title: " + title +
                ", author: " + author +
                ", edithor: " + edithor +
                ')';
    }
}
