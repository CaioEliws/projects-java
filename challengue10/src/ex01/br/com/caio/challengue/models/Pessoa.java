package ex01.br.com.caio.challengue.models;

public class Pessoa {
    private String name;
    private int year;
    private String city;

    public Pessoa(String name, int year, String city) {
        this.name = name;
        this.year = year;
        this.city = city;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "name: " + name + '\'' +
                ", year: " + year +
                ", city: " + city + '\'' +
                '}';
    }
}