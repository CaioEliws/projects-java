package ex03.br.caio.challengue.models;

public class Veiculo {
    private String name;
    private String color;
    private int year;
    private double price;

    public Veiculo(String name, String color, int year, double price) {
        this.name = name;
        this.color = color;
        this.year = year;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Veiculo = (" +
                "name: " + name +
                ", color: " + color +
                ", year: " + year +
                ", price: " + price +
                ')';
    }
}
