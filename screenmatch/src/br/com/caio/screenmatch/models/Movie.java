package br.com.caio.screenmatch.models;

import br.com.caio.screenmatch.calc.Rateable;

//Herança
public class Movie extends Title implements Rateable {
    private String director;

    // Construtor
    public Movie(String name, int yearReleased) {
        super(name, yearReleased);
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getDirector() {
        return director;
    }

    @Override
    public int getRateable() {
        return (int) averageRating() / 2;
    }

    @Override
    public String toString() {
        return "Filme: " + this.getName() + " (" + this.getYearReleased() + ")";
    }
}
