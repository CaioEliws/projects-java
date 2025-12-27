package br.com.caio.screenmatch.models;

public class Title implements Comparable<Title> {
    //Atributos
    private String name;
    private int yearReleased;
    private boolean includeOfPlan;
    private double sumRating;
    private int totalRating;
    private int duration;

    // Construtor
    public Title(String name, int yearReleased) {
        this.name = name;
        this.yearReleased = yearReleased;
    }

    // Metodos
    // Getter
    public int getTotalRating() {
        return totalRating;
    }

    public int getDuration() {
        return duration;
    }

    public double getSumRating() {
        return sumRating;
    }

    public boolean isIncludeOfPlan() {
        return includeOfPlan;
    }

    public int getYearReleased() {
        return yearReleased;
    }

    public String getName() {
        return name;
    }

    // Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setYearReleased(int yearReleased) {
        this.yearReleased = yearReleased;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public void showSpecifications () {
        System.out.println("Nome: " + name);
        System.out.println("Ano de lançamento: " + yearReleased);
    }

    public void review(double grade) {
        sumRating += grade;
        totalRating++;
    }

    public double averageRating() {
        return sumRating / totalRating;
    }

    @Override
    public int compareTo(Title otherTitle) {
        return this.getName().compareTo(otherTitle.getName());
    }
}