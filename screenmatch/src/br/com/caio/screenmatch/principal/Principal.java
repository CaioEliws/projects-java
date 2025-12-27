package br.com.caio.screenmatch.principal;

import br.com.caio.screenmatch.calc.CalculatorTemp;
import br.com.caio.screenmatch.calc.FilterRecommendation;
import br.com.caio.screenmatch.models.Episode;
import br.com.caio.screenmatch.models.Movie;
import br.com.caio.screenmatch.models.Serie;

import java.util.ArrayList;

public class Principal {
    static void main() {
        Movie myMovie = new Movie("Star Wars", 1989);
        // myMovie.setName("Star Wars");
        myMovie.setYearReleased(1989);
        myMovie.setDuration(250);

        myMovie.showSpecifications();

        myMovie.review(8);
        myMovie.review(5);
        myMovie.review(10);

        System.out.println("Media das avaliações: " + myMovie.averageRating());
        System.out.println("Total de avaliações: " + myMovie.getTotalRating());

        Serie the100 = new Serie("The 100", 2017);
//        the100.setName("The 100");
//        the100.setYearReleased(2017);
        the100.setSeasons(4);
        the100.setEpisodesPerSeason(12);
        the100.setMinutesPerEpisode(40);

        the100.showSpecifications();
        System.out.println("Duração da serie: " + the100.getDuration());
        System.out.println("Duração da serie em minutos: " + the100.getMinutesPerEpisode());

        Movie batman = new Movie("Batman", 1999);
//        batman.setName("Batman");
//        batman.setYearReleased(1999);
        batman.setDuration(200);

        CalculatorTemp calc = new CalculatorTemp();

        calc.include(myMovie);
        calc.include(batman);
        calc.include(the100);
        System.out.println(calc.getTotalTemp());

        FilterRecommendation filter = new FilterRecommendation();
        filter.filter(myMovie);

        Episode episode = new Episode();
        episode.setNumber(1);
        episode.setSerie(the100);
        episode.setTotalViews(300);
        filter.filter(episode);

        Movie venom = new Movie("Venom", 2017);
        // venom.setName("Venom");
//        venom.setYearReleased(2017);
        venom.setDuration(120);
        venom.review(10);

        ArrayList<Movie> listMovies = new ArrayList<>();
        listMovies.add(venom);
        listMovies.add(batman);
        listMovies.add(myMovie);
        System.out.println("Tamanho da lista: " + listMovies.size());
        System.out.println("Primeiro filme: " + listMovies.get(0).getName());
        System.out.println(listMovies);
        System.out.println("toString do filme: " + listMovies.get(0).toString());


    }
}