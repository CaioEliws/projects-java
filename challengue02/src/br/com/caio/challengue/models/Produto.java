package br.com.caio.challengue.models;

public class Produto {
    private String name;
    private int price;

    private double desconto;

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setDesconto(double desconto) {
        this.desconto = desconto;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public double aplicarDesconto() {
        double valorDesconto = price * (desconto / 100);
        return price - valorDesconto;
    }
}
