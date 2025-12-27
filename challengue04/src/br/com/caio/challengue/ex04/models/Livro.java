package br.com.caio.challengue.ex04.models;

import br.com.caio.challengue.ex04.calc.Calculavel;

public class Livro implements Calculavel {
    private String titulo;
    private String author;
    private double price;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public double calcularPrecoFinal() {
        return price + (price * 0.1);
    }
}
