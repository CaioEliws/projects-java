package br.com.caio.screenmatch.calc;

import br.com.caio.screenmatch.models.Title;

public class CalculatorTemp {
    private int totalTemp;

    public int getTotalTemp() {
        return this.totalTemp;
    }

//    public void include(Movie m) {
//        this.totalTemp += m.getDuration();
//    }
//
//    public void include(Serie s) {
//        this.totalTemp += s.getDurationInMinutes();
//    }

    // Polimorfismo do Movie e Series
    public void include(Title title) {
        System.out.println("Adicionando duração em minutos de " + title);
        this.totalTemp += title.getDuration();
    }
}
