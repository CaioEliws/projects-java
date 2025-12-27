package br.com.caio.screenmatch.calc;

public class FilterRecommendation {

    public void filter(Rateable rateable) {
        if (rateable.getRateable() >= 4) {
            System.out.println("Está entre os preferidos do momento!!");
        } else if (rateable.getRateable() >= 2) {
            System.out.println("Muito bem avaliado no momento!");
        } else {
            System.out.println("Coloque na sua lista para assistir depois.");
        }
    }
}
