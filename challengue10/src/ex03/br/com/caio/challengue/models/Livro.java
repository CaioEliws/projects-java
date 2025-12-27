package ex03.br.com.caio.challengue.models;

public class Livro {
    private String title;
    private String author;
    private String editor;

    public Livro(String title, String author, String editor) {
        this.title = title;
        this.author = author;
        this.editor = editor;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setEditor(String editor) {
        this.editor = editor;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getEditor() {
        return editor;
    }

    @Override
    public String toString() {
        return "Livro = " +
                "title: " + title + '\'' +
                ", author: " + author + '\'' +
                ", editor: " + editor + '\'';
    }
}
