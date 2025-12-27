package ex02.br.com.caio.challengue.models;

public class Title implements Comparable<Title> {
    private String title;

    public Title(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return title;
    }

    @Override
    public int compareTo(Title otherTitle) {
        return this.getTitle().compareTo(otherTitle.getTitle());
    }
}
